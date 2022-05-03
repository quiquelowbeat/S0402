package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaServiceImpl implements FruitaService{

    @Autowired
    private FruitaRepository fruitaRepository;

    @Override
    public FruitaEntity addFruita(FruitaEntity fruita) {
        return fruitaRepository.save(fruita);
    }

    @Override
    public FruitaEntity updateFruita(FruitaEntity fruita) {
        Optional<FruitaEntity> fruitaEntityOptional = this.fruitaRepository.findById(fruita.getId());
        FruitaEntity fruitaUpdated = null;
        if(fruitaEntityOptional.isPresent()){
            fruitaUpdated = fruitaEntityOptional.get();
            fruitaUpdated.setId(fruita.getId());
            fruitaUpdated.setNom(fruita.getNom());
            fruitaUpdated.setQuantitatQuilos(fruita.getQuantitatQuilos());
        } 
        return fruitaRepository.save(fruitaUpdated);
    }

    @Override
    public void deleteFruitaById(int id) {
        this.fruitaRepository.deleteById(id);
    }

    @Override
    public FruitaEntity getFruitaById(int id) {
        Optional<FruitaEntity> fruitaEntityOptional = this.fruitaRepository.findById(id);
        FruitaEntity fruita = null;
        if(fruitaEntityOptional.isPresent()){
            fruita = fruitaEntityOptional.get();
        } 
        return fruita;
    }

    @Override
    public List<FruitaEntity> getAllFruita() {
        return fruitaRepository.findAll();
    }
}
