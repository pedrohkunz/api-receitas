package br.com.apiReceitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apiReceitas.model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Integer>{
    
}
