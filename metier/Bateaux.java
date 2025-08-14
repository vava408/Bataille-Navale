package metier;

import java.util.ArrayList;
import java.util.List;

public class Bateaux
{
 private String nom;
	private int taille;
	private List<int[]> positions; // Liste de cases [ligne, colonne]
	private int pointsDeVie;
	
	public Bateaux(String nom, int taille)
	{
		this.taille = taille;
		this.nom    = nom;
		this.positions = new ArrayList<>();
		this.pointsDeVie = taille;
	}

	public void ajouterPosition(int ligne, int colonne)
	{
		this.positions.add(new int[]{ligne, colonne});
	}

	public boolean estToucher(int ligne, int colonne)
	{
		for (int[] pos : positions)
		{
			if(pos[0] == ligne && pos[1] == colonne)
			{
				this.pointsDeVie--;
				return true;
			}
		}
		return false;
	}

	public boolean estCoule()
	{
		if(this.taille == 0)
		{
			return true;
		}
		return false;
	}

	public String getNom()
	{
		return nom;
	}

	public int getTaille()
	{
		return taille;
	}

	public List<int[]> getPositions()
	{
		return positions;
	}
}
