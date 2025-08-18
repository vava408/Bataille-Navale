import metier.GestionPlacement;
import metier.Players;
import metier.Actions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Actions actions = new Actions();
        GestionPlacement gestionPlacement = new GestionPlacement();
        String nomJoueur1;
        String nomJoueur2;

        // Demande le nom des joueurs
        System.out.print("Nom du Joueur 1 : ");
        nomJoueur1 = scanner.nextLine();
        System.out.print("Nom du Joueur 2 : ");
        nomJoueur2 = scanner.nextLine();

        Players joueur1 = new Players(nomJoueur1);
        Players joueur2 = new Players(nomJoueur2);


        actions.jouerPartie(joueur1, joueur2);
    }
}