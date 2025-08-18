package metier;

import java.util.Scanner;

public class Actions
{


    public Actions()
    {

    }

    public void tirer(Players cicble, int x, int y)
    {
        for (Bateaux bateaux : cicble.getBateau())
        {
            if(bateaux.estToucher(x,y))
            {
                System.out.println("Toucher");
                
                if(bateaux.estCoule())
                {
                    System.out.println("Bateaux Couler");
                }
            }    
        }
    }

    public void jouerPartie(Players joueur1, Players joueur2) {
        Scanner scanner = new Scanner(System.in);

        // Placement des bateaux pour chaque joueur
        metier.GestionPlacement.placementBateaux(joueur1);
        metier.GestionPlacement.placementBateaux(joueur2);

        boolean jeuEnCours = true;
        Players joueurActif = joueur1;
        Players cible = joueur2;

        while (jeuEnCours) {
            System.out.println(joueurActif.getNom() + ", à toi de tirer !");
            System.out.print("Entrez x : ");
            int x = scanner.nextInt();
            System.out.print("Entrez y : ");
            int y = scanner.nextInt();

            tirer(cible, x, y);

            // Vérifie si tous les bateaux de la cible sont coulés
            boolean tousCoules = true;
            for (var b : cible.getBateau()) {
                if (!b.estCoule()) {
                    tousCoules = false;
                    break;
                }
            }
            if (tousCoules) {
                System.out.println(joueurActif.getNom() + " a gagné !");
                jeuEnCours = false;
            } else {
                // Change de joueur
                Players temp = joueurActif;
                joueurActif = cible;
                cible = temp;
            }
        }
    }
}
