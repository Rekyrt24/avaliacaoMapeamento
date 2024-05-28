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

import com.example.demo.entities.Aluno;
import com.example.demo.services.AlunoService;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "http://localhost:8080")
public class AlunoController {
    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno getAluno(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
    	alunoService.deleteAlunos(id);
    }
    @GetMapping("/cidade/{cidade}")
    public List<Aluno> buscarPorCidade(@PathVariable String cidade) {
    	return alunoService.buscarPorCidade(cidade);
    }
    @GetMapping("/ra/{ra}")
    public List<Aluno> buscarPorRa(@PathVariable String ra) {
    	return alunoService.buscarPorRa(ra);
    }
}
