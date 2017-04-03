package pokemon;
import java.util.ArrayList;
import java.util.List;


/**
 * Décrivez votre classe Arene ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Arene
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Type type;
    private List<Pokemon> pokemonsList = new ArrayList<Pokemon>();

    /**
     * Constructeur d'objets de classe Arene
     */
    public Arene(Type type)
    {
        // initialisation des variables d'instance
        this.type=type;
       
    }
    
    public Type getType(){
        return this.type;
    }
    
    public List<Pokemon> getPokemonsList() {
		return pokemonsList;
	}

	public void bonusVie(Pokemon pokemon)
    {
        // Insérez votre code ici
        int point = pokemon.sommeVie(pokemon.getPointBouclier());
        if(type.equals(pokemon.getType())){
           pokemon.setPointTotale(point+2);
        }else{
           pokemon.setPointTotale(point);
        }
    }

	public void addPokemon(Pokemon pokemon) {
		if(pokemonsList.contains(pokemon)){}else{
			pokemonsList.add(pokemon);	
			pokemon.addArene(this);
		}
		
	}
}
