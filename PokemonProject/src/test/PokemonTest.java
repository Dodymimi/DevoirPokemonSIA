package test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pokemon.Pokemon;
import pokemon.Type;

public class PokemonTest
{
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test PokemonTest
     */
    public PokemonTest()
    {
    }
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testSommeVie()
    {
        Pokemon pikachu = new Pokemon(2,Type.ELECTRIQUE);
        assertEquals(8, pikachu.sommeVie(2));
    }
}

