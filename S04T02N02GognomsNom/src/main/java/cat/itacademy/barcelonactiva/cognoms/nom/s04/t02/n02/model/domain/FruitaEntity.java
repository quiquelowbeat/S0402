package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "llista_fruita")
public class FruitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "quantitat_quilos")
    private int quantitatQuilos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }
}
