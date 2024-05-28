package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Turma;
import com.example.demo.services.TurmaService;

@RestController
@RequestMapping("/turmas")
@CrossOrigin(origins = "http://localhost:8080")
public class TurmaController {
    private final TurmaService turmaService;

    @Autowired
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping
    public Turma createTurma(@RequestBody Turma turma) {
        return turmaService.saveTurma(turma);
    }

    @GetMapping("/{id}")
    public Turma getTurma(@PathVariable Long id) {
        return turmaService.getTurmaById(id);
    }

    @GetMapping
    public List<Turma> getAllTurmas() {
        return turmaService.getAllTurmas();
    }

    @DeleteMapping("/{id}")
    public void deleteTurma(@PathVariable Long id) {
    	turmaService.deleteTurmas(id);
    }
    
}
