package com.udemy.backendninja.Service;

import java.util.List;

import com.udemy.backendninja.Entity.Curso;

public interface CursoService {
	public List<Curso> listAllCursos();
	public Curso addCurso(Curso curso);
	public int removerCurso(Curso curso);
	public Curso actualizarCurso(Curso curso);
}
