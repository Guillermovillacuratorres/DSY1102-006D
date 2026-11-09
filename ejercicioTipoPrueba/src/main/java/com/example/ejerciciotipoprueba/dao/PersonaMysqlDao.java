package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.database.DatabaseConnection;
import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaMysqlDao implements  PersonaDao{
    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        String sql  = "SELECT * FROM persona";

        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

        ){
            while(rs.next()){
               if ("DOCENTE".equals(rs.getString("tipo"))) {
                   personas.add(new Docente(
                           rs.getInt("id"),
                           rs.getInt("edad"),
                           rs.getString("nombre"),
                           rs.getBoolean("casado"),
                           rs.getString("titulo_profesional"),
                           rs.getInt("sueldo")
                   ));
               }else{
                   personas.add(new Estudiante(
                           rs.getInt("id"),
                           rs.getInt("edad"),
                           rs.getString("nombre"),
                           rs.getBoolean("casado"),
                           rs.getString("nivel_conocimientos")
                   ));
               }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return   personas;
    }

    @Override
    public void insertar(Persona persona) {
        String sql = "INSERT INTO persona (tipo, nombre,edad,casado,titulo_profesional,sueldo,nivel_conocimientos) VALUES (?,?,?,?,?,?,?)";

        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(2,persona.getNombrePersona());
            ps.setInt(3,persona.getEdadPersona());
            ps.setBoolean(4,persona.isCasado());

            if (persona instanceof Docente) {
                Docente docente = (Docente) persona;
                ps.setString(1,"DOCENTE");
                ps.setString(5,docente.getTituloProfesional());
                ps.setInt(6,docente.getSueldo());
                ps.setNull(7, Types.VARCHAR);
            } else{
                Estudiante estudiante = (Estudiante) persona;
                ps.setString(1,"ESTUDIANTE");
                ps.setNull(5,Types.VARCHAR);
                ps.setNull(6,Types.VARCHAR);
                ps.setString(7,estudiante.getNivelConocimientos());
            }
            ps.executeUpdate();
        }catch (SQLException e){
                e.printStackTrace();
        }


    }

    @Override
    public void actualizar(Persona persona) {

    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM persona WHERE id=?";

        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
