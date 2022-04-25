package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.FruitaEntity;
import java.util.List;

public interface FruitaService {
    void addFruita(FruitaEntity fruita);
    boolean updateFruita(FruitaEntity fruita);
    void deleteFruitaById(String id);
    FruitaEntity getFruitaById(String id);
    List<FruitaEntity> getAllFruita();
}
