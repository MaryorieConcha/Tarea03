package Model;

import java.util.ArrayList;
import Model.Medico;
import Model.Administrativo;

public class EspecialidadMedica {
	private String nombre;
	private String latitud;
	private String longitud;
	private Clinica clinica;
	private ArrayList<Medico> medicos;
	private ArrayList<Administrativo> administrativos;

	public EspecialidadMedica(String nombre, String latitud, String longitud, Clinica clinica) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.clinica = clinica;
		this.medicos = new ArrayList<Medico>();
		this.administrativos = new ArrayList<Administrativo>();
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public Medico asociarMedicos(Medico medico) {
		this.medicos.add(medico);
		return medico;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public Administrativo asociarAdministrativo(Administrativo administrativo){
		this.administrativos.add(administrativo);
		return administrativo;
	}
}