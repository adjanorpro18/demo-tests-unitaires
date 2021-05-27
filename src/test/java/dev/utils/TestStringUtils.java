package dev.utils;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStringUtils {

    @Before
    public void setUp() {
        // Pas besoin car etant une méthode static

    }

    /**
     * Test pour voir si tout fonctionne correctement
     */
    @Test
    public void testNormal(){
        assertNotEquals(StringUtils.levenshteinDistance("Chine", "Chien"), 0);
    }

    /**
     * Test dans le cas ou une des valeurs est vide
     */
    @Test
    public void testParam1VideOuParam2Vide()
    {
        assertNotEquals(StringUtils.levenshteinDistance("", "Chien"), 0);
        assertNotEquals(StringUtils.levenshteinDistance("Chine ", "Chien"), 0);
    }

    /**
     * Test dans le cas ou les deux valeurs sont vides
     */
    @Test
    public void testParam1VideParam2Vide()
    {
        assertEquals(StringUtils.levenshteinDistance("", ""), 0);
    }

    /**
     * Test dans le cas ou les deux valeurs sont nulles
     */
    @Test()
    public void testParam1Param2Null()
    {
        assertEquals(StringUtils.levenshteinDistance(null, null), -1);

    }

}
