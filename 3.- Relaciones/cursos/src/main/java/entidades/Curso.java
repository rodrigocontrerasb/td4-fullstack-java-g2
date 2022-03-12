package entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	// Atributos de Clase
	private int idCurso;
	private String descricion;
	private double precio;

	public Curso() {
	}

	@Id
	@Column(name = "id_curso")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cursoid")
	@SequenceGenerator(name = "cursoid", sequenceName = "cursoid", allocationSize = 1)
	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	@Basic
	@Column(name = "descripcion")

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	@Basic
	@Column(name = "precio")
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
