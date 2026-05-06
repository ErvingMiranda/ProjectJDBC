package org.POO.TeamSolid;

import org.POO.TeamSolid.model.Estudiante;
import org.POO.TeamSolid.servicio.EstudianteDAO;
import org.POO.TeamSolid.servicio.IEstudianteDAO;
import org.POO.TeamSolid.servicio.ServicioDataBase;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        IEstudianteDAO dao = new EstudianteDAO(ServicioDataBase.
                getInstance().createConnection());
        Estudiante e = new Estudiante();
        e.setNombre("Juanito");
        e.setCif("12345");
        e.setId(3);
        dao.insert(e);
        dao.selectAll().forEach(System.out::println);
    }
}