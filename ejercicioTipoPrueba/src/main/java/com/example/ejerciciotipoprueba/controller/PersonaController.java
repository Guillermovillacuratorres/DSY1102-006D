package com.example.ejerciciotipoprueba.controller;

import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;
import com.example.ejerciciotipoprueba.repository.PersonaRepository;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersonaController {

    private static final String TIPO_DOCENTE = "Docente";
    private static final String TIPO_ESTUDIANTE = "Estudiante";

    private final PersonaRepository personaRepository = new PersonaRepository();
    private final ObservableList<Persona> personas = FXCollections.observableArrayList();

    HelperController helper = new HelperController();

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtSueldo;

    @FXML
    private TextField txtNivel;

    @FXML
    private ComboBox<String> cmbTipo;

    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colCasado;

    @FXML
    private TableColumn colEdad;

    @FXML
    private CheckBox chbCasado;

    @FXML
    private TableColumn<Persona, Integer> colCalculo;



    @FXML
    public void initialize(){
        cmbTipo.getItems().setAll("Seleccione",TIPO_DOCENTE, TIPO_ESTUDIANTE);
        cmbTipo.getSelectionModel().select(0);

        cambiarTipo();
        colId.setCellValueFactory(new PropertyValueFactory<>("idPersona"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edadPersona"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombrePersona"));
        colCasado.setCellValueFactory(new PropertyValueFactory<>("casado"));
        colCalculo.setCellValueFactory(p -> new SimpleObjectProperty<>(p.getValue().calcularSueldo()));

        tblPersonas.setItems(personas);

        try{
            personaRepository.cargar();
            personas.setAll(personaRepository.listar());
        }catch (Exception  e){
            System.out.println(e.getMessage());
        }

    }




    @FXML
    public void agregar(){
        String  tipoPersona = cmbTipo.getValue();
        Persona persona;

        try{
            int idPersona = personaRepository.listar().size() + 1;

            int edad;

            try{
                    edad = Integer.parseInt(txtEdad.getText());
                if (edad <= 0){
                    helper.mostrarError("Debe ingresar un edad y no un " + edad);
                    return;
                }
            }catch (Exception e){
                helper.mostrarError("Solo se permiten numeros.");
                return;
            }


            String nombre = txtNombre.getText();
            if (nombre.isEmpty()){
                helper.mostrarError("Debe ingresar un nombre");
                return;
            }
            boolean casado =  chbCasado.isSelected();

            if (TIPO_DOCENTE.equals(tipoPersona)){
                String titulo = txtTitulo.getText();
                int sueldo = Integer.parseInt(txtSueldo.getText());

                Docente docenteNuevo = new Docente(idPersona,edad,nombre,casado,titulo,sueldo);
                persona = docenteNuevo;
            }else{
                String nivel =  txtNivel.getText();
                persona = new Estudiante(idPersona,edad,nombre,casado,nivel);
            }

            limpiarFormulario();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }

        try{
         personaRepository.guardar(persona);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        personas.setAll(personaRepository.listar());



    }

    @FXML
    public void eliminar(){
        Persona personaSeleccionada =  tblPersonas.getSelectionModel().getSelectedItem();
        if (personaSeleccionada == null){
            System.out.println("Debe seleccionar una persona");
            return;
        }
        try{
            personaRepository.eliminar(personaSeleccionada);
            System.out.println("El persona se elimino correctamente");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        personas.setAll(personaRepository.listar());
    }

    @FXML
    public void cambiarTipo(){
     String tipo = cmbTipo.getValue();
     boolean esDocente = TIPO_DOCENTE.equals(tipo);
     boolean esEstudiante = TIPO_ESTUDIANTE.equals(tipo);

     txtTitulo.setDisable(!esDocente);
     txtSueldo.setDisable(!esDocente);
     txtNivel.setDisable(!esEstudiante);
    }



    private void limpiarFormulario(){
        txtTitulo.clear();
        txtSueldo.setText("");
        txtNivel.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        chbCasado.setSelected(false);
    }

}
