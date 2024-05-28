package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	@Query(value = "SELECT * FROM Aluno l WHERE lower(l.cidade) LIKE %:cidade%", nativeQuery = true)
	List<Aluno> buscarPorCidade(@Param("cidade") String cidade);
	
	@Query(value = "SELECT * FROM Aluno l WHERE lower(l.ra) LIKE %:ra%", nativeQuery = true)
	List<Aluno> buscarPorRa(@Param("ra") String ra);

}