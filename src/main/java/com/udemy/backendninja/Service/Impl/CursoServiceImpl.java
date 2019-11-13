package com.udemy.backendninja.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.Entity.Curso;
import com.udemy.backendninja.Repository.CursoJPARepository;
import com.udemy.backendninja.Service.CursoService;

@Service("CursoService")
public class CursoServiceImpl implements CursoService{

	@Autowired
	@Qualifier("cursoJPARespository")
	private CursoJPARepository cursoJpaRepository;
	
	@Override
	public List<Curso> listAllCursos() {
		cursoJpaRepository.findAll();
		return null;
	}

	@Override
	public Curso addCurso(Curso curso) {
		cursoJpaRepository.save(curso);
		return null;
	}

	@Override
	public int removerCurso(Curso curso) {
		cursoJpaRepository.delete(curso);
		return 0;
	}

	@Override
	public Curso actualizarCurso(Curso curso) {
		cursoJpaRepository.save(curso);
		return null;
	}

}
