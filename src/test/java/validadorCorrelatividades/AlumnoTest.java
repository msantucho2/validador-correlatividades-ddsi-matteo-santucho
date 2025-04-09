package validadorCorrelatividades;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AlumnoTest {

    @Test
    public void testAreMateriasCorrelativasAprobadasWhenNoCorrelativasShouldReturnTrue() {
        Materia materia = new Materia("Matematica", Collections.emptySet());
        Alumno alumno = new Alumno("Perez", "Juan", 12345678, Collections.emptySet(), "A001");

        assertTrue(alumno.areMateriasCorrelativasAprobadas(materia));
    }

    @Test
    public void testAreMateriasCorrelativasAprobadasWhenCorrelativasAprobadasShouldReturnTrue() {
        Materia algebra = new Materia("Algebra", Collections.emptySet());
        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(algebra);

        Materia analisis = new Materia("Analisis", Collections.singleton(algebra));
        Alumno alumno = new Alumno("Lopez", "Maria", 87654321, materiasAprobadas, "B002");

        assertTrue(alumno.areMateriasCorrelativasAprobadas(analisis));
    }

    @Test
    public void testAreMateriasCorrelativasAprobadasWhenCorrelativasNoAprobadasShouldReturnFalse() {
        Materia algebra = new Materia("Algebra", Collections.emptySet());
        Materia analisis = new Materia("Analisis", Collections.singleton(algebra));
        Alumno alumno = new Alumno("Gomez", "Ana", 11223344, Collections.emptySet(), "C003");

        assertFalse(alumno.areMateriasCorrelativasAprobadas(analisis));
    }
}