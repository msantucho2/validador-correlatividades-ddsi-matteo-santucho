package validadorCorrelatividades;

import java.util.Set;

/**
 * Clase que representa un alumno.
 */
public class Alumno {

    private final String nombre;
    private final String apellido;
    private final Integer dni;
    private final String legajo;
    private final Set<Materia> materiasAprobadas;

    /**
     * Constructor de Alumno.
     *
     * @param apellido          Apellido del alumno.
     * @param nombre            Nombre del alumno.
     * @param dni               DNI del alumno.
     * @param materiasAprobadas Materias que el alumno ya aprobó.
     * @param legajo            Número de legajo del alumno.
     */
    public Alumno(String apellido, String nombre, Integer dni, Set<Materia> materiasAprobadas, String legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.materiasAprobadas = materiasAprobadas;
        this.legajo = legajo;
    }

    /**
     * Verifica si el alumno tiene aprobadas todas las materias correlativas requeridas para una materia.
     *
     * @param materia Materia a cursar.
     * @return true si todas las materias correlativas están aprobadas, false en caso contrario.
     */
    public Boolean areMateriasCorrelativasAprobadas(Materia materia) {
        return materia.getMateriasCorrelativas().stream().allMatch(this::isMateriaAprobada);
    }


    private Boolean isMateriaAprobada(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }
}
