package fr.cbon.app;

import java.util.ArrayList;
import java.util.Scanner;

import fr.cbon.app.aliments.Aliment;
import fr.cbon.app.aliments.BaseAliments;
import fr.cbon.app.calories.Repas;
import fr.cbon.app.calories.TypeRepas;

public class CBon {
    public static void main(String[] args) {

        // Initialization des repas
        Repas pRepas = new Repas(TypeRepas.PETITDEJ);
        Repas dejeunRepas = new Repas(TypeRepas.DEJEUNER);
        Repas collationRepas = new Repas(TypeRepas.GOUTER);
        Repas dinRepas = new Repas(TypeRepas.DINER);

        // Initialization de BaseAliment
        BaseAliments base = new BaseAliments();
        Scanner inputMenu = new Scanner(System.in);
        int input;

        do {
            System.out.println(" ----------------------------------");
            System.out.println("---       APPLICATION CBon       ---");
            System.out.println(" ---  Calcul des calories repas  ---");
            System.out.println(" ----------------------------------");
            System.out.println("0 - Quitter");
            System.out.println("1 - Ajouter un aliment");
            System.out.println("2 - Afficher le bilan actuel de la journée");

            /// Scanner input object
            System.out.println("Enter a valid number: ");
            input = inputMenu.nextInt();
            switch (input) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: { // Partie 1: Ajouter un aliment
                    System.out.println("Nom de l'aliment consommé: ");
                    inputMenu.nextLine();
                    String inputAliment = inputMenu.nextLine();
                    System.out.println("Aliment de recherche: " + inputAliment);
                    Aliment temp = searchAliment(inputAliment, base);
                    if (temp != null) {
                        System.out.println(
                                "Aliment trouvé: Aliment [nom=" + temp.getNom() + ", " + temp.getType() + ", proteines:"
                                        + temp.getProteinesParGramme() + ", glucides=" + temp.getGlucidesParGramme()
                                        + ", lipides=" + temp.getLipidesParGramme() + ", calories="
                                        + temp.getCalories() + "]");
                    }
                    System.out.println("Ajouter au repas: ");
                    System.out.println("1 - Petit Déjeuner");
                    System.out.println("2 - Déjeuner");
                    System.out.println("3 - Collation");
                    System.out.println("4 - Diner");
                    System.out.println("Veillez saisir un nombre: ");
                    int inputMenuRepas = inputMenu.nextInt();
                    System.out.println("Nombre de grammes: ");
                    int inputNombreGrammes = inputMenu.nextInt();
                    switch (inputMenuRepas) {
                        case 1: {
                            pRepas.addAliment(temp, inputNombreGrammes);
                            break;
                        }
                        case 2: {
                            dejeunRepas.addAliment(temp, inputNombreGrammes);
                            break;
                        }
                        case 3: {
                            collationRepas.addAliment(temp, inputNombreGrammes);
                            break;
                        }
                        case 4: {
                            dinRepas.addAliment(temp, inputNombreGrammes);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 2: { // Partie 2: Afficher le bilan de la journee
                    System.out.println("-- Bilan actuel de la journée");
                    System.out.println("2022-05-27");
                    System.out.println("\t Petit Dejeuner " + pRepas.getCalories());
                    System.out.println("\t Dejeuner " + dejeunRepas.getCalories());
                    System.out.println("\t Collation " + collationRepas.getCalories());
                    System.out.println("\t Dinner " + dinRepas.getCalories());
                    System.out.println("\t TOTAL consomme: " + (pRepas.getCalories() + dejeunRepas.getCalories()
                            + collationRepas.getCalories() + dinRepas.getCalories()));
                }
                default:
                    break;
            }
        } while (input != 0);
        inputMenu.close();
    }

    public static Aliment searchAliment(String nomAliment, BaseAliments base) {
        ArrayList<Aliment> listBase = new ArrayList<>();
        listBase = base.getListBaseAliment();
        for (Aliment item : listBase) {
            if (nomAliment.equals(item.getNom())) {
                return item;
            }
        }
        return null;
    }

}
