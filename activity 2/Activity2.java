/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;


public class Activity2 {

   
    public static void main(String[] args) {
        
        LabGrade PJ =
                new LabGrade("PJ", 80, 90);

        LabGrade lori =
                new LabGrade("KIRT", 101, 85);

        
        System.out.println(PJ.getStudentName());
        System.out.println("Final Grade: " + PJ.getFinalGrade());
        System.out.println("Passing: " + PJ.isPassing());

       
        System.out.println("\n" + KIRT.getStudentName());
        System.out.println("Final Grade: " + KIRT.getFinalGrade());
        System.out.println("Passing: " + KIRT.isPassing());


        System.out.println("\nUpdate PJ (95, 101): "
                + PJ.updateScores(95, 101));
        System.out.println("Final Grade: " + PJ.getFinalGrade());

  
        System.out.println("\nUpdate PJ (74, 75): "
                + PJ.updateScores(74, 75));
        System.out.println("Final Grade: " + PJ.getFinalGrade());
        System.out.println("Passing: " + PJ.isPassing());

    
        System.out.println("\nUpdate PJ (75, 75): "
                + zhee.updateScores(75, 75));
        System.out.println("Final Grade: " + PJ.getFinalGrade());
        System.out.println("Passing: " + PJ.isPassing());

       
        System.out.println("\nKIRT's Final Grade: "
                + KIRT.getFinalGrade());
        System.out.println("Passing: " + KIRT.isPassing());
    }
}


/* QUESTION:
    Why must you validate both new scores before assigning either one?

      Validating both scores first ensures an atomic update so a valid quiz score is not
    saved when the accompanying lab score is invalid. Without checking both beforehand,
    an invalid update could leave the object in a partially modifie
*/
