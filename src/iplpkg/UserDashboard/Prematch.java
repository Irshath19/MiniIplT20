package iplpkg.UserDashboard;

import java.util.ArrayList;
import java.util.Scanner;

public class Prematch {
    Scanner in = new Scanner(System.in);
    UserController uc=new UserController();
    public void prematchceremony()
    {
        System.out.println("INDIAN PREMIER LEAGUE");
        System.out.println("Teams:");
        System.out.println("Enter the name of team 1 ");
        String team1=in.nextLine();
        System.out.println("Enter the name of team 2");
        String team2=in.nextLine();
        System.out.println();
        if(uc.validteam(team1) && uc.validteam(team2))
        {
            Matchtoss mt=new Matchtoss();
            ArrayList <String> toss=mt.matchtoss(team1,team2);
            String tosswon=toss.get(0);
            String chooseto=toss.get(1);
            System.out.println(tosswon+" won the toss and choose to "+chooseto);
            System.out.println();
            System.out.println("Match will start shortly......");
            for (int i = 10; i >= 0; i--) {
                if(i==0)
                System.out.println("Lets Play!!!");
                else
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted: " + e.getMessage());
                }
            }
            Innings1 ing1=new Innings1();
            if(team1==tosswon)
            {
                if(chooseto.equals("bat"))
                 ing1.Innings(tosswon, team2);
                else
                ing1.Innings(team2, tosswon);
            }
            else
            {
                if(chooseto.equals("bat"))
                {
                   ing1.Innings(tosswon, team1);
                }
                else
                {
                    ing1.Innings(team1, tosswon);
                }
            }    
        }
        else
        {
            System.out.println("Kindly Register your team");
        }
    }
}
