package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Décrivez votre classe Pokemon ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pokemon
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int pointVie;
    private int pointBouclier;
    private Type type;
    private int pointTotale;
    private Arene arene;
    private List<Arene> areneList;

    /**
     * Constructeur d'objets de classe Pokemon
     */
    public Pokemon(int pointBouclier, Type type)
    {
        // initialisation des variables d'instance
        this.pointVie = 6;
        this.type = type;
        this.pointBouclier = pointBouclier;
        this.areneList = new ArrayList<Arene>();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
    public int getPointBouclier (){
        return pointBouclier;
    }
        
    public List<Arene> getAreneList() {
		return areneList;
	}
	
    public void addArene(Arene arene){
    		areneList.add(arene);
    		arene.addPokemon(this);
    	
    }

	public int getPointTotale (){
        return pointTotale;
    }
    
    public void setArene(Arene arene){
        this.arene = arene;
    }
    
    public Arene getArene(){
        return this.arene;
    }
    
    public void setPointTotale(int pointTotale){
        this.pointTotale = pointTotale;
    }
    
     public Type getType(){
        return type;
    }
    
    public int sommeVie(int pointBouclier)
    {
        // Insérez votre code ici
        return pointTotale = pointVie + pointBouclier;
    }
}
