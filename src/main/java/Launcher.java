import Model.Clinica;
import Model.EspecialidadMedica;
import Model.Especializacion;
import Model.Medico;

public class Launcher {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.inicializar();
    }

    public void inicializar(){
        Clinica clinica = new Clinica();
        EspecialidadMedica espMedic = new EspecialidadMedica("nombre", "latitud","longitud", clinica);
        clinica.agregarEspecialidadMedica(espMedic);
        Medico medico = new Medico("Nombre","titulo","direccion","eCivil","rut","horario"
        , Especializacion.valueOf(String.valueOf(0)),0,espMedic,clinica);
        clinica.agregarMedicos(medico);
        espMedic.asociarMedicos(medico);
        System.out.println(clinica.obtenerMedicoPorEspecialidad().get(0).getNombre());
    }
}
