package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FruitaEntity;

import java.util.List;

public interface FruitaService {

    FruitaEntity addFruita(FruitaEntity fruita);
    FruitaEntity updateFruita(FruitaEntity fruita);
    void deleteFruitaById(int id);
    FruitaEntity getFruitaById(int id);
    List<FruitaEntity> getAllFruita();

}
