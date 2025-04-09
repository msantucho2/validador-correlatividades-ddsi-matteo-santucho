package validadorCorrelatividades;

import java.util.Set;

/**
 * Clase que representa una inscripción de un alumno a un conjunto de materias.
 */
public class Inscripcion {

    private final Set<Materia> materias;
    private final Alumno alumno;

    /**
     * Constructor de Inscripcion.
     *
     * @param materias Materias a las que se inscribe el alumno.
     * @param alumno   Alumno que realiza la inscripción.
     */
    public Inscripcion(Set<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    /**
     * Verifica si la inscripción es aprobada, es decir, si el alumno cumple con todas las correlatividades.
     *
     * @return true si todas las materias cumplen correlatividades, false en caso contrario.
     */
    public Boolean isAprobada() {
        return this.materias.stream().allMatch(materia -> alumno.areMateriasCorrelativasAprobadas(materia));
    }
}
