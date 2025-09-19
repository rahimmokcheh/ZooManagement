import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        // Lecture du nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = sc.nextLine();

        while (zoo.zooName.isEmpty()) {
            System.out.print(" Le nom du zoo ne peut pas être vide. Réessayez : ");
            zoo.zooName = sc.nextLine();
        }

        // Lecture du nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        while (true) {
            if (sc.hasNextInt()) {
                int cages = sc.nextInt();
                if (cages > 0) {
                    zoo.nbrCages = cages;
                    break;
                } else {
                    System.out.print(" Le nombre doit être positif. Réessayez : ");
                }
            } else {
                System.out.print(" Entrez un nombre entier valide : ");
                sc.next(); // vide l'entrée incorrecte
            }
        }

        // Affichage des informations mises à jour
        System.out.println("✅ " + zoo.zooName + " comporte " + zoo.nbrCages + " cages.");

        sc.close();
    }
}
