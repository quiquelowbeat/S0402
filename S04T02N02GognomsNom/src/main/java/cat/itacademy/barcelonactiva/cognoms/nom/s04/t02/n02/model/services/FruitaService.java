package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.domain.FruitaEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FruitaService {
    FruitaEntity addFruita(FruitaEntity fruita);
    FruitaEntity updateFruita(FruitaEntity fruita);
    void deleteFruitaById(int id);
    FruitaEntity getFruitaById(int id);
    List<FruitaEntity> getAllFruita();
}
