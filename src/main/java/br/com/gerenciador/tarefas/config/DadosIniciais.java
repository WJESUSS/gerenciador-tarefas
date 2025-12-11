package br.com.gerenciador.tarefas.config;


import br.com.gerenciador.tarefas.model.Categoria;
import br.com.gerenciador.tarefas.repositorio.CategoriaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DadosIniciais {

    @Autowired private CategoriaRepository categoriaRepo;

    @PostConstruct
    public void criarCategoriasPadrao() {
        if (categoriaRepo.count() == 0) {
            categoriaRepo.save(new Categoria(null, "Trabalho"));
            categoriaRepo.save(new Categoria(null, "Pessoal"));
            categoriaRepo.save(new Categoria(null, "Estudos"));
            categoriaRepo.save(new Categoria(null, "Saúde"));
            categoriaRepo.save(new Categoria(null, "Casa"));
        }
    }
}
