package metier;

import java.util.ArrayList;
import java.util.List;

public class Players
{
	public static final  int TAILLE_PLATEAUX = 10;


	private String nomUser;
	private char[][] plateaux;
	private List<Bateaux> bateaux;
	//private metier.Bateaux bat;

	public Players(String nomUser) 
	{
		// Verifie le nom utiilisateur
		if(nomUser.equals(" ") || nomUser.isEmpty())
		{
		   this.nomUser = "player";
		}
		else
		{
			this.nomUser = nomUser;
		}

		// Creer le bateaux avec la mer
		this.plateaux = new char[TAILLE_PLATEAUX][TAILLE_PLATEAUX];
		for(int y = 0; y < TAILLE_PLATEAUX; y++)
		{
			for(int x = 0; x < TAILLE_PLATEAUX; x++)
			{
				this.plateaux[y][x] = '.'; //met de l eau partout par defaut a la création du joueur 
			}
		}

		//Créer la List
		this.bateaux = new ArrayList<>();

	}

	//ajoute un bateauwx a la list
	public void ajouterBateaux(Bateaux bateaux )
	{
		this.bateaux.add(bateaux);
	}


	//Getteur

	//retourne le plateaux
	public char[][] getplateaux()
	{
		return this.plateaux;
	}

	//retourne la list de bateaux
	public List<Bateaux>  getBateau()
	{
		return bateaux;		
	}

	public String getNom()
	{
		return this.nomUser;
	}
}