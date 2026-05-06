package org.POO.TeamSolid.servicio;

import org.POO.TeamSolid.model.Estudiante;

import java.util.List;

public interface IEstudianteDAO {
    void insert(Estudiante e);
    void update(Estudiante e);
    List<Estudiante> selectAll();
}
