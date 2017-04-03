package test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pokemon.Arene;
import pokemon.Pokemon;
import pokemon.Type;


public class AreneTest
{
    private Pokemon pikachu;
    private Pokemon dracofeu;
    private Arene areneElectrique;
    /**
     * Constructeur de la classe-test AreneTest
     */
    public AreneTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        pikachu = new Pokemon(2,Type.ELECTRIQUE);
        dracofeu = new Pokemon(3,Type.FEU);
        areneElectrique = new Arene(Type.ELECTRIQUE);
        pikachu.setArene(areneElectrique);
        dracofeu.setArene(areneElectrique);
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
    public void testType()
    {
        assertEquals(areneElectrique.getType(), pikachu.getType());
	    assertEquals(areneElectrique, pikachu.getArene());
	    assertEquals(areneElectrique, dracofeu.getArene());
    }

    @Test
    public void testBonusVie()
    {
        pikachu.setArene(areneElectrique);
        dracofeu.setArene(areneElectrique);
        areneElectrique.bonusVie(pikachu);
        areneElectrique.bonusVie(dracofeu);
        assertEquals(10, pikachu.getPointTotale());
        assertEquals(9, dracofeu.getPointTotale());
    }
    
    @Test
    public void testAddPokemon(){
    	assertEquals(0,areneElectrique.getPokemonsList().size());
    	assertEquals(0,pikachu.getAreneList().size());
    	assertEquals(0,dracofeu.getAreneList().size());
    	assertEquals(0,areneElectrique.getPokemonsList().size());
	    areneElectrique.addPokemon(pikachu);
	    areneElectrique.addPokemon(dracofeu);
	    assertEquals(2,areneElectrique.getPokemonsList().size());
	    assertEquals(1,pikachu.getAreneList().size());
	    assertEquals(1,dracofeu.getAreneList().size());
    
    }
}





