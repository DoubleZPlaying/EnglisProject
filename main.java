import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        //philosophy: Your fate is altered by the choices you make using free will
        Scanner input = new Scanner(System.in);
        String temp;

        Choices day = new Choices(1);

        while(true){

            System.out.println("It's a normal day. You wake up to your alarm. Do you ignore it, or wake up? (ignore, wake up)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setWakeUp(temp); 

            System.out.println("Now it's time to go to school. Do you take notes in class or talk? (take notes, talk)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setAtSchool(temp); 

            System.out.println("Now it's Bonus. Would you like to visit your teacher to study for your test today? (see teacher, eat with friends)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setBonus(temp); 

            System.out.println("Bonus is ending and it's time to go to class. Will you cut your conversation short and go to class, or continue it and get to class late? (arrive on time, finish conversation)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setArriveToClass(temp); 

            System.out.println("After class you have lunch, and have to attend American Politics Club. Will you attend or skip APC? (attend, skip)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setLunch(temp);
            
            System.out.println("It's time for your test. When you finish will you check your answers? (check, don't check)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setTest(temp);
        }   
    }
}
