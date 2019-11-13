package com.udemy.backendninja.Repository;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backendninja.Entity.Curso;

@Repository("cursoJPARespository")
public interface CursoJPARepository extends JpaRepository<Curso, Serializable>{

	
}
