package br.com.apiReceitas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiReceitas.model.ModoDePreparoModel;
import br.com.apiReceitas.model.ReceitaModel;

//Repositório de Modos de preparos
public interface ModoDePreparoRepository extends JpaRepository<ModoDePreparoModel, Integer>{

    List<ModoDePreparoModel> findByReceita(ReceitaModel receita);
    
}
