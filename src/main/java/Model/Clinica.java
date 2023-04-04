package Model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
	private String nombre;
	private String[] direccionesAsociadas;
	private TipoDeClinica tipoDeClinica;
	private ArrayList<EspecialidadMedica> espMedics;
	private ArrayList<Trabajador> trabajadores;

	public String[] getDireccionesAsociadas() {
		return direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String[] direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public TipoDeClinica getTipoDeClinica() {
		return tipoDeClinica;
	}

	public void setTipoDeClinica(TipoDeClinica tipoDeClinica) {
		this.tipoDeClinica = tipoDeClinica;
	}
	public EspecialidadMedica agregarEspecialidadMedica (EspecialidadMedica especialidad) {
		this.espMedics.add(especialidad);
		return especialidad;
	}

	public Trabajador agregarMedicos (Medico medico){
		this.trabajadores.add(medico);
		return medico;
	}

	public Trabajador agregarAdministrativos (Administrativo administrativo){
		this.trabajadores.add(administrativo);
		return administrativo;
	}
//Obtener todos los médicos de una clínica.
	public List<Medico> obtenerMedicos (){
		List<Medico> medicos = new ArrayList<Medico>();
		for (Trabajador trabajador : this.trabajadores){
			if (trabajador.getTipo().equals("Medico")){
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}


	//Obtener todos los administrativos de una clínica.
	public List<Administrativo> obtenerAdministrativos() {
		List<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}


	//Obtener una lista de médicos de una especialidad médica específica de acuerdo a su nombre.
	public List<Medico> obtenerMedicoPorEspecialidad (){
		List<Medico> medicos = new ArrayList<>();
		for (EspecialidadMedica especialidadMedica : this.espMedics){
			medicos.addAll(especialidadMedica.getMedicos());
		}
		return medicos;
	}


//Obtener un administrativo de una especialidad clínica específica de acuerdo a su nombre y/o rut.
	public List<Administrativo> obtenerAdminPorEspecialidad(){
		List<Administrativo> administrativos = new ArrayList<>();
		for (EspecialidadMedica especialidadMedica : this.espMedics){
			administrativos.addAll(especialidadMedica.getAdministrativos());
		}
		return administrativos;
	}
}