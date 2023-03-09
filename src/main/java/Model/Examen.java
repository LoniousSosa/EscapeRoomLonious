package Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "examen")
public class Examen {
    @Id
    private long idExamen;

    @Column
    private String fecha;

    @Column
    private double nota;

    @Column
    private double idAlumno;

    @Column
    private double idModulo;

    public Examen(long idExamen, String fecha, double nota, double idAlumno, double idModul) {
        this.idExamen = idExamen;
        this.fecha = fecha;
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idModulo = idModul;
    }

    public Examen(){

    }

    public long getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(long idExamen) {
        this.idExamen = idExamen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(double idAlumno) {
        this.idAlumno = idAlumno;
    }

    public double getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(double idModul) {
        this.idModulo = idModul;
    }
}
