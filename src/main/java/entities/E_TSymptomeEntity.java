package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "symptome", schema = "ctpblanc", catalog = "")
public class E_TSymptomeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "Heure", nullable = true)
    private Time heure;
    @Basic
    @Column(name = "description", nullable = false, length = 45)
    private String description;
    @Basic
    @Column(name = "duree", nullable = true)
    private Integer duree;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TSymptomeEntity that = (E_TSymptomeEntity) o;
        return id == that.id && Objects.equals(date, that.date) && Objects.equals(heure, that.heure) && Objects.equals(description, that.description) && Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, heure, description, duree);
    }
}
