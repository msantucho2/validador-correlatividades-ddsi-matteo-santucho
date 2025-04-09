package validadorCorrelatividades;

import java.util.Set;

/**
 * Clase que representa una materia.
 */
public class Materia {

    private final String nombre;
    private final Set<Materia> materiasCorrelativas;

    /**
     * Constructor de Materia.
     *
     * @param nombre               Nombre de la materia.
     * @param materiasCorrelativas Materias que deben estar aprobadas antes de cursar esta materia.
     */
    public Materia(String nombre, Set<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    /**
     * Obtiene las materias correlativas requeridas para cursar esta materia.
     *
     * @return Conjunto de materias correlativas.
     */
    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
