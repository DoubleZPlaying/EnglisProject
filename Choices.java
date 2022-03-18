public class Choices
{
    int wakeUp;
    int atSchool;
    int bonus;
    int arriveToClass;
    int lunch;
    int test;
    int endSchool;
    int homework;
    int sleep; 
    int day;

    public Choices(int day)
    {
        this.day = day;
    }

    public void setWakeUp(String wakeUp)
    {
        if(wakeUp.equals("ignore"))
        {
            this.wakeUp = 0;
        }

        else if(wakeUp.equals("wake up"))
        {
            this.wakeUp = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public void getWakeUp()
    {

    }

    public void setAtSchool(String atSchool)
    {
        this.atSchool = atSchool; 
    }

    public void getAtSchool()
    {
        
    }

    public void setBonus(String bonus)
    {
        this.bonus = bonus;
    }

    public void getBonus()
    {

    }

    public void setArriveToClass(String arriveToClass)
    {
        this.arriveToClass = arriveToClass;
    }

    public void getArriveToClass()
    {

    }

    public void setLunch(String lunch)
    {
        this.lunch = lunch;
    }

    public void getLunch()
    {

    }

    public void setTest(String test)
    {
        this.test = test;
    }

    public void getTest()
    {

    }

    public void setEndSchool(String endSchool)
    {
        this.endSchool = endSchool;
    }

    public void getEndSchool()
    {
        
    }

    public void setHomework(String homework)
    {
        this.homework = homework;
    }

    public void getHomework()
    {

    }

    public void setSleep(String sleep)
    {
        this.sleep = sleep;
    }

    public void getSleep()
    {

    }
}
