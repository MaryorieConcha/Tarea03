package Model;

public abstract class Trabajador {
	private String nombre;
	private String tituloProfesional;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private String horarioDeTrabajo;
	public Clinica clinica;

	public Trabajador(String nombre, String tituloProfesional, String direccion,
					  String estadoCivil, String rut, String horarioDeTrabajo,
					  Clinica clinica) {
		this.nombre = nombre;
		this.tituloProfesional = tituloProfesional;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horarioDeTrabajo = horarioDeTrabajo;
		this.clinica = clinica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getHorarioDeTrabajo() {
		return horarioDeTrabajo;
	}

	public void setHorarioDeTrabajo(String horarioDeTrabajo) {
		this.horarioDeTrabajo = horarioDeTrabajo;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public abstract String getTipo();
}