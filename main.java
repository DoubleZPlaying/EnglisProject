import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //philosophy: Your fate is altered by the choices you make using free will
        //v1.00
        Scanner input = new Scanner(System.in);
        String temp;

        Choices day = new Choices(1);

        while(true){

            System.out.println("It's a normal day. You wake up to your alarm. Do you ignore it, or wake up? (wake up, ignore)");
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

            System.out.println("The end of the school day has arrived. Are you going to stay for robotics, or go home? (stay for robotics, go home)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setEndSchool(temp);

            System.out.println("Now it's time for you to do homework. Will you do it, or procrastinate? (do it, procrastinate)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setHomework(temp);

            System.out.println("It's becoming late, and it's time to go to bed. Will you go to bed on time, or stay up and watch a TV show on Netflix? (go to bed, watch Netiflix)");
            temp = input.nextLine();
            temp = temp.toLowerCase(); 
            System.out.println();
            day.setSleep(temp);

            day.testCalc();
            System.out.println();

            System.out.println("HERE'S HOW YOUR DAY WENT:");
            System.out.print("This morning your alarm wakes you up. You decide to " + day.getWakeUp());
            System.out.print(". After arriving, you head to class. In class, " + day.getAtSchool());
            System.out.print(". After classes Bonus starts. You have a test to study for, " + day.getBonus());
            System.out.print(". Bonus comes to an end " + day.getArriveToClass());
            System.out.print(". After class you have lunch. You decide to " + day.getLunch() + " American Politics Club");
            System.out.print(". After lunch it's time to take your test. You are ready to turn in the test " + day.getTest());
            System.out.print(". The school day comes to close, and you " + day.getEndSchool());
            System.out.print(". Once you get home you " + day.getHomework());
            System.out.print(". It's beginning to get late and you begin to prepare for bed. " + day.getSleep());

            break;
        }   

        input.close();
    }
}
