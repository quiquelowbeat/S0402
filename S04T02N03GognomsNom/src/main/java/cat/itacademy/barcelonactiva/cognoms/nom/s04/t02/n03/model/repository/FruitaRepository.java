package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.FruitaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitaRepository extends MongoRepository<FruitaEntity, Integer> {
    void deleteById(String id);
    Optional<FruitaEntity> findById(String id);
}
