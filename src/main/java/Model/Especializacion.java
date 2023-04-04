package Model;

public enum Especializacion {
    Cirujano("Cirujano"),
    MedicinaInterna("Medico Interno"),
    Pediatria("Pediatra");

    private String especializacion;

    Especializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
