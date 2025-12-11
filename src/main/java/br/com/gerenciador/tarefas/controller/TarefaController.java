package br.com.gerenciador.tarefas.controller;


import br.com.gerenciador.tarefas.model.Categoria;
import br.com.gerenciador.tarefas.model.Tarefa;
import br.com.gerenciador.tarefas.repositorio.CategoriaRepository;
import br.com.gerenciador.tarefas.repositorio.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TarefaController {

    @Autowired private TarefaRepository tarefaRepo;
    @Autowired private CategoriaRepository categoriaRepo;

    // ====== CATEGORIAS ======
    @GetMapping("/categorias")
    public List<Categoria> listarCategorias() {
        return categoriaRepo.findAll();
    }

    @PostMapping("/categorias")
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return categoriaRepo.save(categoria);
    }

    // ====== TAREFAS ======
    @GetMapping("/tarefas")
    public List<Tarefa> listarTarefas() {
        return tarefaRepo.findAll();
    }

    @PostMapping("/tarefas")
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepo.save(tarefa);
    }

    @PutMapping("/tarefas/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa dados) {
        Tarefa tarefa = tarefaRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        tarefa.setTitulo(dados.getTitulo());
        tarefa.setDescricao(dados.getDescricao());
        tarefa.setPrioridade(dados.getPrioridade());
        tarefa.setCategoria(dados.getCategoria());
        tarefa.setConcluida(dados.isConcluida());

        return ResponseEntity.ok(tarefaRepo.save(tarefa));
    }

    @DeleteMapping("/tarefas/{id}")
    public ResponseEntity<?> excluirTarefa(@PathVariable Long id) {
        tarefaRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}