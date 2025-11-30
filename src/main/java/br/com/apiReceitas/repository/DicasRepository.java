package br.com.apiReceitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apiReceitas.model.DicaModel;

public interface DicasRepository extends JpaRepository<DicaModel, Integer>{
    
}
