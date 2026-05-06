package org.POO.TeamSolid;

import org.POO.TeamSolid.servicio.EstudianteDAO;
import org.POO.TeamSolid.servicio.IEstudianteDAO;
import org.POO.TeamSolid.servicio.ServicioDataBase;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        IEstudianteDAO dao = new EstudianteDAO(ServicioDataBase.
                getInstance().createConnection());
        dao.selectAll().forEach(System.out::println);
    }
}