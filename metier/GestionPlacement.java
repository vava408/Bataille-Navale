package metier;
//les bateux son placer par rapport au premier points si c est verticla le reste du betaux va se postioner de gauche a doite si c est horizontal du haut vers le bas 

import java.util.Scanner;

public class GestionPlacement {
	Actions actions = new Actions();

	//verifie si on peut mettre le bateaux a cette endroit voir si il depasse pas. 
	public static boolean verifierPlacement(Players players, int x, int y, int taille, char orientation) {
		int taillePlateaux = players.getplateaux().length;
		char[][] plateau   = players.getplateaux();

		if (orientation == 'H' && x + taille > taillePlateaux)
			return false;

		if (orientation == 'V' && y + taille > taillePlateaux)
			return false;

		for (int cpt = 0; cpt < taille; cpt++)
		{
			//si orientation == H alors posX = x + cpt sinon posX = X
			//? si c est vrai / si c est faux
			int posX = (orientation == 'H') ? x + cpt : x;
			int posY = (orientation == 'V') ? y + cpt : y;
			if (plateau[posY][posX] != '.')
			{
				return false;
			}
		}

		return true;
	}


	//permet de placer un bateaux
	public static void placementBateaux(Players players) {
		boolean placeLibre;
		Scanner scanner = new Scanner(System.in);

		//taleaux contenant les noms des bateaux
		String[] bateauxNom = { "Porte-avions", "Croiseur", "Contre-torpilleur", "Sous-marin", "Torpilleur" };
		//taleaux contenant les tailles des bateaux
		int[] bateauxTailles = { 5, 4, 3, 3, 2 };

		System.out.println("Le joeueur " + players.getNom() + " à toi de placer les bateaux");

		for (int i = 0; i < bateauxNom.length; i++)
		{
			placeLibre = false;

			while (!placeLibre)
			{
				System.out.println("Veuillez placez le bateaux " + bateauxNom[i] + " qui a une taille de " + bateauxTailles[i]);
				System.out.print("Entrez x (0-" + (players.getplateaux().length - 1) + ") : ");
				int x = scanner.nextInt();
				System.out.print("Entrez y (0-" + (players.getplateaux().length - 1) + ") : ");
				int y = scanner.nextInt();
				System.out.print("Orientation (H/V) : ");
				char orientation = scanner.next().toUpperCase().charAt(0);

				if (orientation != 'H' && orientation != 'V')
				{
					System.out.println("Orientation invalide. Utilisez H ou V.");
					continue;
				}

				if (verifierPlacement(players, x, y, bateauxTailles[i], orientation))
				{
					Bateaux bateau = new Bateaux(bateauxNom[i], bateauxTailles[i]);
					for (int j = 0; j < bateauxTailles[i]; j++)
					{
						int posX, posY;
						if (orientation == 'H')
						{
							posX = x + j;
							posY = y;
						}
						else
						{ // orientation == 'V'
							posX = x;
							posY = y + j;
						}
						bateau.ajouterPosition(posY, posX);
					}
					players.ajouterBateaux(bateau);
					placeLibre = true;
					afficherPlateau(players.getplateaux());
				}
				else
				{
					System.out.println("Placement invalide, réessayez.");
				}

			}

		}
	}

   public static void afficherPlateau(char[][] plateau)
   {
		System.out.print("  ");
		for (int i = 0; i < plateau.length; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < plateau.length; i++)
		{
			System.out.print(i + " ");
			for (int j = 0; j < plateau[i].length; j++)
			{
				System.out.print(plateau[i][j] + " ");
			}
			System.out.println();
		}
   }

}
