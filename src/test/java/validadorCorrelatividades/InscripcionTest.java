package validadorCorrelatividades;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class InscripcionTest {

    @Test
    public void testIsAprobadaWhenAllMateriasCorrelativasAprobadasShouldReturnTrue() {
        Materia algebra = new Materia("Algebra", Collections.emptySet());
        Materia analisis = new Materia("Analisis", Collections.singleton(algebra));

        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(algebra);

        Alumno alumno = new Alumno("Diaz", "Pedro", 99887766, materiasAprobadas, "D004");
        Set<Materia> materias = new HashSet<>();
        materias.add(analisis);

        Inscripcion inscripcion = new Inscripcion(materias, alumno);

        assertTrue(inscripcion.isAprobada());
    }

    @Test
    public void testIsAprobadaWhenSomeMateriasCorrelativasNoAprobadasShouldReturnFalse() {
        Materia algebra = new Materia("Algebra", Collections.emptySet());
        Materia analisis = new Materia("Analisis", Collections.singleton(algebra));

        Alumno alumno = new Alumno("Fernandez", "Sofia", 88776655, Collections.emptySet(), "E005");
        Set<Materia> materias = new HashSet<>();
        materias.add(analisis);

        Inscripcion inscripcion = new Inscripcion(materias, alumno);

        assertFalse(inscripcion.isAprobada());
    }
}