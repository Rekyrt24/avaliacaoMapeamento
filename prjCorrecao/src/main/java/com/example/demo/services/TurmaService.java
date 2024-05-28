package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Turma;
import com.example.demo.repositories.TurmaRepository;

@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;
    
    @Autowired
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public Turma saveTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Turma getTurmaById(Long id) {
        return turmaRepository.findById(id).orElse(null);
    }

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public void deleteTurmas(Long id) {
    	turmaRepository.deleteById(id);
    }
}
