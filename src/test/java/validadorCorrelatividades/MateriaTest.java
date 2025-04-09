package validadorCorrelatividades;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Collections;

public class MateriaTest {

    @Test
    public void testGetMateriasCorrelativasShouldSucceed() {
        Materia algebra = new Materia("Algebra", Collections.emptySet());
        Materia analisis = new Materia("Analisis", Collections.singleton(algebra));

        assertEquals(1, analisis.getMateriasCorrelativas().size());
        assertTrue(analisis.getMateriasCorrelativas().contains(algebra));
    }
}