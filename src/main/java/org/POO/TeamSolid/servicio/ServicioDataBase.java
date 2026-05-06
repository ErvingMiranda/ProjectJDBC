package org.POO.TeamSolid.servicio;

import java.sql.*;

public class ServicioDataBase {
    private static ServicioDataBase instance = new ServicioDataBase();
    private final String URL = "jdbc:postgresql://localhost:5432/POO";
    private final String USER = "postgres";
    private final String PASSWORD = "Ezone2106";


    public static ServicioDataBase getInstance() {
        return instance;
    }

    public Connection createConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private ServicioDataBase(){}
}
