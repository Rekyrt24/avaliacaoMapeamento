package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Aluno;
import com.example.demo.repositories.AlunoRepository;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;
    
    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public void deleteAlunos(Long id) {
    	alunoRepository.deleteById(id);
    }
    
    public List<Aluno> buscarPorCidade(String cidade) {
    	return alunoRepository.buscarPorCidade(cidade);
    }
    public List<Aluno> buscarPorRa(String ra) {
    	return alunoRepository.buscarPorRa(ra);
    }
    
}
