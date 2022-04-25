package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.services.FruitaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8083")
public class FruitaController {

    @Autowired
    private FruitaServiceImpl fruitaService;

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> add(@RequestBody FruitaEntity fruita){
        try {
            fruitaService.addFruita(fruita);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<HttpStatus> update(@RequestBody FruitaEntity fruita){
        if(fruitaService.updateFruita(fruita)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id){
        try {
            fruitaService.deleteFruitaById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<FruitaEntity> getOne(@PathVariable("id") String id){
        FruitaEntity fruita = fruitaService.getFruitaById(id);
        if(fruita == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(fruita, HttpStatus.OK);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<FruitaEntity>> getAll(){
        List<FruitaEntity> fruitaList = fruitaService.getAllFruita();
        if(fruitaList.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(fruitaList, HttpStatus.OK);
        }
    }
}
