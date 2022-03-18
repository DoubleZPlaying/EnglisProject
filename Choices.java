public class Choices
{
    int wakeUp = -1;
    int atSchool = -1;
    int bonus = -1;
    int arriveToClass = -1;
    int lunch = -1;
    int test = -1;
    int endSchool = -1;
    int homework = -1;
    int sleep = -1; 
    int day = -1;
    int testScore = 65;

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

    public String getWakeUp()
    {
        if(wakeUp == 0)
        {
            return "ignore your alarm and go back to school. You arrive to school late";
        }

        else if(wakeUp == 1)
        {
            return "wake up on time and get ready for school. You arrive on time";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setAtSchool(String atSchool)
    {
        if(atSchool.equals("take notes"))
        {
            this.atSchool = 0;
        }

        else if(atSchool.equals("talk"))
        {
            this.atSchool = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getAtSchool()
    {
        if(atSchool == 0)
        {
            return "you take notes and fully understand the lesson";
        }

        else if(atSchool == 1)
        {
            return "you talk to friends and don't understand the lesson";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setBonus(String bonus)
    {
        if(bonus.equals("see teacher"))
        {
            this.bonus = 0;
        }

        else if(bonus.equals("eat with friends"))
        {
            this.bonus = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getBonus()
    {
        if(bonus == 0)
        {
            return "and go to your teacher to review";
        }

        else if(bonus == 1)
        {
            return "but decide to eat with your friends instead";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setArriveToClass(String arriveToClass)
    {
        if(arriveToClass.equals("arrive on time"))
        {
            this.arriveToClass = 0;
        }

        else if(arriveToClass.equals("finish conversation"))
        {
            this.arriveToClass = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getArriveToClass()
    {
        if(arriveToClass == 0)
        {
            return "and you arrive to class on time";
        }

        else if(arriveToClass == 1)
        {
            return "but you finish your conversation and arrive to class late";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setLunch(String lunch)
    {
        if(lunch.equals("attend"))
        {
            this.lunch = 0;
        }

        else if(lunch.equals("skip"))
        {
            this.lunch = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getLunch()
    {
        if(lunch == 0)
        {
            return "attend";
        }

        else if(lunch == 1)
        {
            return "skip";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setTest(String test)
    {
        if(test.equals("check"))
        {
            this.test = 0;
        }

        else if(test.equals("don't check"))
        {
            this.test = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public void testCalc()
    {
        if(bonus == 0)
        {
            testScore += 15;
        }

        if(test == 0)
        {
            testScore += 15;
       }
    }

    public String getTest()
    {
        if(test == 0)
        {
            return "but check your answers first. Congrats, you find and correct some mistakes! You score a " + testScore + "% on your test";
        }

        else if(test == 1)
        {
            return "and do so without checking your answers. You score a " + testScore + "% on your test";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setEndSchool(String endSchool)
    {
        if(endSchool.equals("stay for robotics"))
        {
            this.endSchool = 0;
        }

        else if(endSchool.equals("go home"))
        {
            this.endSchool = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getEndSchool()
    {
        if(endSchool == 0)
        {
            return "stay for robotics";
        }

        else if(endSchool == 1)
        {
            return "decide to skip robotics and go home";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setHomework(String homework)
    {
        if(homework.equals("do it"))
        {
            this.homework = 0;
        }

        else if(homework.equals("procrastinate"))
        {
            this.homework = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getHomework()
    {
        if(homework == 0)
        {
            return "do your homework and relax";
        }

        else if(homework == 1)
        {
            return "plan on doing homework, but procrastinate and run out of time";
        }

        else
        {
            return "INVALID INPUT";
        }
    }

    public void setSleep(String sleep)
    {
        if(sleep.equals("go to bed"))
        {
            this.sleep = 0;
        }

        else if(sleep.equals("watch netflix"))
        {
            this.sleep = 1;
        }
        
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }

    public String getSleep()
    {
        if(sleep == 0)
        {
            return "You go to sleep and and are well rested for another school day";
        }

        else if(sleep == 1)
        {
            return "Before you go to bed you watch Netflix, and end up going to bed too late. Looks like tomorrow's going to be a tiring day for you . . .";
        }

        else
        {
            return "INVALID INPUT";
        }
    }
}
