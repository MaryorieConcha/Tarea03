package Model;

public class Administrativo extends Trabajador {
	private String email;
	private EspecialidadMedica especialidadMedica;

	public Administrativo(String nombre, String tituloProfesional, String direccion,
						  String estadoCivil, String rut, String horarioDeTrabajo,
						  String email, EspecialidadMedica especialidadMedica,
						  Clinica clinica) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut, horarioDeTrabajo, clinica);
		this.email = email;
		this.especialidadMedica = especialidadMedica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EspecialidadMedica getEspecialidadMedica() {
		return especialidadMedica;
	}

	public EspecialidadMedica asociarEspecialidad(EspecialidadMedica especialidadMedica){
		this.especialidadMedica = especialidadMedica;
		return especialidadMedica;
	}

	public String getTipo() {
		return "Administrativo";
	}
}