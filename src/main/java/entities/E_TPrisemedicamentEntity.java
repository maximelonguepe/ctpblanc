package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "prisemedicament", schema = "ctpblanc", catalog = "")
public class E_TPrisemedicamentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "Heure", nullable = false)
    private Time heure;
    @Basic
    @Column(name = "medicaments_id", nullable = false)
    private int medicamentsId;
    @Basic
    @Column(name = "quantite", nullable = false)
    private int quantite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public int getMedicamentsId() {
        return medicamentsId;
    }

    public void setMedicamentsId(int medicamentsId) {
        this.medicamentsId = medicamentsId;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TPrisemedicamentEntity that = (E_TPrisemedicamentEntity) o;
        return id == that.id && medicamentsId == that.medicamentsId && quantite == that.quantite && Objects.equals(date, that.date) && Objects.equals(heure, that.heure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, heure, medicamentsId, quantite);
    }
}
