package br.com.apiReceitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apiReceitas.model.ReceitaModel;

//Repositório de Receitas
public interface ReceitaRepository extends JpaRepository<ReceitaModel, Integer>{
    
}
