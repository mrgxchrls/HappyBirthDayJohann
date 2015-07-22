package happybirthday;
import java.util.*;

/**
 *
 * @author margauxcharles thomascharles elisemathieu
 */
public class HappyBirthDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Salutations 
        System.out.println("Salut, comment t'appelles-tu?\n");
        String name = sc.nextLine();
        System.out.println("\n" + name + "?\nMais quel joli prénom!!! Je suis "
                + "ravi de te rencontrer car on m'a beaucoup parlé de toi tu"
                + " sais! ;)\n");
        
        
        // Année
        System.out.println("Dis moi, tu es né en quelle année?\n");
        String birthYear = sc.nextLine();
        
        // Mois
        System.out.println("\nAh oui quand même ça date tout ça... :S");
        System.out.println("Sois un peu plus précis mon petit, quel est ton "
                + "mois de naissance?\n");
        String birthMonth = sc.nextLine();

        // Jour
        System.out.println("\nJe sais je suis curieux mais promis ce sera ma "
                + "dernière question : quel jour es-tu arrivé au monde?\n");
        String birthDay = sc.nextLine();

        // Date du jour
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();
        int todayYear = calendar.get(Calendar.YEAR);
        int todayMonth = calendar.get(Calendar.MONTH) + 1;
        int todayDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Calcul de l'âge
        int age = todayYear - Integer.parseInt(birthYear);
        
        // Anniversaire
        Boolean isToday = false;
        Boolean isPast = false;
        
        if(todayMonth == Integer.parseInt(birthMonth))
        {
            if(todayDayOfMonth == Integer.parseInt(birthDay))
            {
                isToday = true;
            }
            else if(Integer.parseInt(birthDay) < todayDayOfMonth)
            {
                isPast = true;
            }
        }
        else
        {
            if(Integer.parseInt(birthDay) < todayDayOfMonth)
            {
                isPast = true;
            }
        }
        if(isToday)
        {
            System.out.println("\nFélicitations, tu as " + age + "aujourd'hui!!!"
                    + " :O");
            System.out.println("Joyeux anniversaire " + name + "!!!");
        }
        else if(isPast)
        {
            System.out.println("\nOh mince j'ai raté tes " + age + " ans... "
                    + ":'(");
            System.out.println("Mais je vais me rattraper pour tes "
                    + (age + 1) + " ans :P");
        }
        else 
        {
            System.out.println("\nOh tu vas bientôt avoir " + age + " ans! =)");
        }
    }
}
