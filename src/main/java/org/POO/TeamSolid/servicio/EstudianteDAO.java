package org.POO.TeamSolid.servicio;

import org.POO.TeamSolid.model.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements IEstudianteDAO {

    private final Connection con;

    public EstudianteDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(Estudiante e) {
        String sql = "INSERT INTO Estudiante(id, nombre, cif) VALUES(?,?,?)";
        try(PreparedStatement ps=con.prepareStatement(sql))
        {
            ps.setInt(1, e.getId());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getCif());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Estudiante e) {

    }

    @Override
    public List<Estudiante> selectAll() {
        List<Estudiante> list = new ArrayList<>();
        try (Connection conn = con) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM \"Estudiante\"");
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setCif(rs.getString("cif"));
                list.add(estudiante);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
