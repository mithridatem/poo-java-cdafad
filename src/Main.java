import com.exemple.jeu.Des;
import com.exemple.jeu.Joueur;
import com.exemple.jeu.Partie;
import com.exemple.model.Habitation;
import com.exemple.model.Vehicule;

public class Main {
    static void main() {
        //Instance des habitations
        Habitation villa = new Habitation("Villa", 10, 15.5);
        Habitation acienda = new Habitation("Acienda", 16.48, 17.80);
        Habitation immeuble = new Habitation("Immeuble", 22, 22.5, 8);
        //appel de la fonction surface
        System.out.println("L'habitation  : " + villa.getNom() + " à une surface de : " + villa.surface() + " m²");
        System.out.println("L'habitation  : " + acienda.getNom() + " à une surface de : " + acienda.surface() + " m²");
        System.out.println("L'habitation  : " + immeuble.getNom() + " à une surface de : " + immeuble.surface() + " m²");

        //instance de vehicules
        Vehicule moto = new Vehicule("HONDA CBR", 2, 280);
        Vehicule voiture = new Vehicule("Mercedes CLK", 4, 250);
        Vehicule camion = new Vehicule("Camion", 8, 130);

        //appel de detect
        System.out.println("Le vehicule : " +  moto.getNom() + " est de type : " + moto.detect());
        System.out.println("Le vehicule : " +  voiture.getNom() + " est de type : " + voiture.detect());
        System.out.println("Le vehicule : " +  camion.getNom() + " est de type : " + camion.detect());

        //appel de la méthode boost
        System.out.println("Le véhicule : " + voiture.getNom() + " possède une vitesse de : " + voiture.getVitesse() + " km/h.");
        voiture.boost();
        System.out.println("Le véhicule : " + voiture.getNom() + " possède une vitesse de : " + voiture.getVitesse() + " km/h.");

        //appel de la méthode plusRapide
        System.out.println("Le véhicule le plus rapide est : " + moto.plusRapide(voiture));
        System.out.println("Le véhicule le plus rapide est : " + moto.plusRapide(camion));
        System.out.println("Le véhicule le plus rapide est : " + camion.plusRapide(voiture));
        System.out.println("Le véhicule le plus rapide est : " + voiture.plusRapide(moto));

        //jeux de dés
        Des des1 = new Des();
        Des des2 = new Des();

        Joueur j1 = new Joueur("Mathieu", des1);
        Joueur j2 = new Joueur("Marie", des2);

        Partie partie = new Partie(j1,j2);
        //lancer la partie
        partie.lancerPartie();

    }
}
