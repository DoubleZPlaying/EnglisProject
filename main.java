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

            if(temp.equals("wake up")) 
            {
                day.setWakeUp(temp); 
            }
        }   
    }
}
