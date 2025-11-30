package br.com.apiReceitas.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.apiReceitas.model.DicaModel;
import br.com.apiReceitas.repository.DicasRepository;

@Service
public class DicaService {
    final DicasRepository dicasRepository;

    //Construtor
    public DicaService(DicasRepository dicasRepository) {
        this.dicasRepository = dicasRepository;
    }

    //Save
    @Transactional
    public DicaModel save(DicaModel dicaModel){
        DicaModel dica = dicasRepository.save(dicaModel);
        return dica;
    }

    //Lista todas dicas
    public List<DicaModel> findAll(){
        return dicasRepository.findAll();
    }

    //Lista as dicas pelo id
    public Optional<DicaModel> findById(int id){
        return dicasRepository.findById(id);
    }

    //Delete pelo id
    public void deleteById(int id){
        dicasRepository.deleteById(id);
    }
}
