package Teoria_Array;

/**
 *
 * @author Samir
 */
public class Arrays_Bidireccionals {

    public static void main(String[] args) {

        String[] nom = {"Ernest", "Carla", "Gonzalo", "Adri", "khammali", "Andrea","Mitjana",};
        
        
        double[][] notes = {{7.9, 9.1, 10.0, 0.0},
        {6.7, 5.5, 6.8, 0.0},
        {7.3, 9.5, 7.89, 0.0},
        {4.3, 2.2, 7.0, 0.0},
        {4.3, 2.2, 1.0, 0.0},
        {8.2, 5.7, 4.56, 0.0},
        {0.0, 0.0, 0.0, 0.0}};
        
        double mitjP = 0; 
        double mitjE = 0; 
        double mitjABP = 0;
        double mitjT = 0;
        
        System.out.println("Nom \t\t Prac \t Examen   ABP \t Mitjana total");
        for (int i = 0; i < notes.length; i++) {
        mitjP += notes [i][0];
        mitjE += notes [i][1];
        mitjABP += notes [i][2];
        mitjT += notes[i][3];
        }  
        
        mitjP /= notes.length;
        mitjE /= notes.length;
        mitjABP /= notes.length;
        mitjT /= notes.length;

        // Recorrem l'array bidimensional per a visualitzar les dades
        for (int i = 0; i < notes.length; i++) {
            // Aquest bucle recorre les files
            System.out.print("\n" + nom[i] + "\t ");
            notes[i][3] = notes[i][0] * 0.2 + notes[i][1] * 0.6 + notes[i][2] * 0.2;
            
            for (int j = 0; j < notes[i].length; j++) {
                System.out.printf("\t %.2f", notes[i][j]);
            }

        }
        System.out.println();
        System.out.print("---------------------------------------------");
        System.out.println("\nMitjana total Practica: " + mitjP);
        System.out.println("Mitjana total d'examens: " + mitjE);
        System.out.println("Mitjana total de ABP: " + mitjABP);
        System.out.println("Mitjana total: " + mitjT);
    }
}
