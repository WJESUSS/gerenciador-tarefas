package br.com.gerenciador.tarefas.repositorio;

import br.com.gerenciador.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
