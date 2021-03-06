package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document (collection = "llista_fruita")
public class FruitaEntity {

    @Id
    private String id;
    private String nom;
    private int quantitatQuilos;

}
