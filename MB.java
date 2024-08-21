
import java.util.Scanner;

public class MB {
public static void main(String[] args) {
    int start = 2;
    int personilizerA = 0;
    int personilizerB = 0;
    int personilizerC = 0;
    int personilizerD = 0;
    
    do {
        System.out.println("Are you an Introvert Or Extrovert? [I/E]/[1/2]");
        System.out.println("Introvert : a shy, reticent person./ Extrovert an outgoing, socially confident person.");
        Scanner PERSONILIZERA = new Scanner(System.in);
        personilizerA = PERSONILIZERA.nextInt();
        
        System.out.println("When Making decisions do you use  Intuition Or Sensing? [N/S]/[1/2]");
        System.out.println("Intuition is the ability to understand something instinctively, without the need for conscious reasoning/ Sensing is to perceive by a sense or senses ");
        Scanner PERSONILIZERB = new Scanner(System.in);
        personilizerB = PERSONILIZERB.nextInt();

        System.out.println("Are you a Thinker Or Feeler? [T/F]/[1/2]");
        System.out.println(" Thinking is the process of considering or reasoning about something./ Feeler is a tentative proposal intended to ascertain someone's attitude or opinion");
        Scanner PERSONILIZERC = new Scanner(System.in);
        personilizerC = PERSONILIZERC.nextInt();

        System.out.println("Are you a person who is Judging Or Perceiving? [J/P]/[1/2]");
        System.out.println(" Judging is to give a verdict on (someone) in a law/ Perceiving is to become aware or conscious of (something); come to realize or understand.");
        Scanner PERSONILIZERD = new Scanner(System.in);
        personilizerD = PERSONILIZERD.nextInt();
        String ResultsA = "A";
        String ResultsB = "B";
        String ResultsC = "C";
        String ResultsD = "D";


        switch (personilizerA) {
            case 1:
            ResultsA = "I";
            break;
            case 2:
            ResultsA = "E";
            break;
        }
        switch (personilizerB) {
            case 1:
            ResultsB = "N";
            break;
            case 2:
            ResultsB = "S";
            break;
        } 
        switch (personilizerC) {
            case 1:
            ResultsC = "T";
            break;
            case 2:
            ResultsC = "F";
            break;
        }
        switch (personilizerD) {
            case 1:
            ResultsD = "J";
            break;
            case 2:
            ResultsD = "P";
            break;
        }
        System.out.println("Your personality type is: " + ResultsA + ResultsB + ResultsC + ResultsD);
        break;
        
    } while (start >= 1);
}
}
