/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;

/**
 *
 * @author RELLOSO_CPE113
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LabGrade zhee =
                new LabGrade("zhee", 80, 90);

        LabGrade lori =
                new LabGrade("lori", 101, 85);

        
        System.out.println(zhee.getStudentName());
        System.out.println("Final Grade: " + zhee.getFinalGrade());
        System.out.println("Passing: " + zhee.isPassing());

       
        System.out.println("\n" + lori.getStudentName());
        System.out.println("Final Grade: " + lori.getFinalGrade());
        System.out.println("Passing: " + lori.isPassing());


        System.out.println("\nUpdate zhee (95, 101): "
                + zhee.updateScores(95, 101));
        System.out.println("Final Grade: " + zhee.getFinalGrade());

  
        System.out.println("\nUpdate zhee (74, 75): "
                + zhee.updateScores(74, 75));
        System.out.println("Final Grade: " + zhee.getFinalGrade());
        System.out.println("Passing: " + zhee.isPassing());

    
        System.out.println("\nUpdate zhee (75, 75): "
                + zhee.updateScores(75, 75));
        System.out.println("Final Grade: " + zhee.getFinalGrade());
        System.out.println("Passing: " + zhee.isPassing());

       
        System.out.println("\nlori's Final Grade: "
                + lori.getFinalGrade());
        System.out.println("Passing: " + lori.isPassing());
    }
}


/* QUESTION:
    Why must you validate both new scores before assigning either one?

      Validating both scores first ensures an atomic update so a valid quiz score is not
    saved when the accompanying lab score is invalid. Without checking both beforehand,
    an invalid update could leave the object in a partially modifie
*/
