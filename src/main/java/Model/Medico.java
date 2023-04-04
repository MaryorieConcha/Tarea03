package Model;

public class Medico extends Trabajador {
	private Especializacion especializacion;
	private int pacientesAsignados;
	private EspecialidadMedica especialidadMedica;

	public Medico(String nombre, String tituloProfesional, String direccion,
				  String estadoCivil, String rut, String horarioDeTrabajo,
				  Especializacion especializacion, int pacientesAsignados, EspecialidadMedica especialidadMedica,
				  Clinica clinica) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut, horarioDeTrabajo, clinica);
		this.especializacion = especializacion;
		this.pacientesAsignados = pacientesAsignados;
		this.especialidadMedica = especialidadMedica;
	}

	public Especializacion getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(Especializacion especializacion) {
		this.especializacion = especializacion;
	}

	public int getPacientesAsignados() {
		return pacientesAsignados;
	}

	public void setPacientesAsignados(int pacientesAsignados) {
		this.pacientesAsignados = pacientesAsignados;
	}

	public EspecialidadMedica getEspecialidadMedica() {
		return especialidadMedica;
	}

	public EspecialidadMedica asociarEspecialidad(EspecialidadMedica especialidadMedica) {
		this.especialidadMedica = especialidadMedica;
		return especialidadMedica;
	}

	public String getTipo() {
		return "Medico";
	}
}