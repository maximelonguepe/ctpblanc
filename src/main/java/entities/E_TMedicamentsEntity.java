package entities;

import generalclass.ClassId;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medicaments", schema = "ctpblanc", catalog = "")
public class E_TMedicamentsEntity {
    @Basic
    @Column(name = "nom", nullable = true, length = -1)
    private String nom;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    public E_TMedicamentsEntity() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TMedicamentsEntity that = (E_TMedicamentsEntity) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, id);
    }

    public E_TMedicamentsEntity(String nom) {
        this.nom = nom;
    }

    public E_TMedicamentsEntity(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    @Override
    public String toString() {
        return "E_TMedicamentsEntity{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                '}';
    }
}
