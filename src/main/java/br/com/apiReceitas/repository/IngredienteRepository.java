package br.com.apiReceitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiReceitas.model.IngredienteModel;
import br.com.apiReceitas.model.ReceitaModel;

//Repositório de ingredientes
public interface IngredienteRepository extends JpaRepository<IngredienteModel, Integer>{

    List<IngredienteModel> findByReceita(ReceitaModel receita);
    
}
