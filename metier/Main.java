package metier;

public class Main {
    public static void main(String[] args) {
        Players joueur1 = new Players("Vava");
        GestionPlacement.placementBateaux(joueur1);

        System.out.println("Placement terminé. Voici le plateau final :");
        GestionPlacement.afficherPlateau(joueur1.getplateaux());

       
    }
}
