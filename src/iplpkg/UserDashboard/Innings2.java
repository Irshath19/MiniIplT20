package iplpkg.UserDashboard;

import java.util.ArrayList;
import java.util.Random;

public class Innings2 {
    UserController uc=new UserController();
    superover1 sop=new superover1();
    public String getbatsman(String team1[],int b1)
    {
        String bats=team1[b1];
        b1++;
        return bats;
    }
    public void Innings(String teamtobat,String teamtobowl,int target,int wic)
    {
        int b1=0;
        String team1[]=uc.getplayers(teamtobat);
        String team2[]=uc.getplayers(teamtobowl);
        String ran[]={"1","2","3","4","5","6","7","W","WD","NB","0","BOUNCER","BNC+WD"};
        Random random=new Random();
        System.out.println("Team to bat: "+teamtobat);
        System.out.println("Team to bowl: "+teamtobowl);
        int subovertotal=0,wicket=0;
        String batsman="";
        for(int i=0;i<20;i++)
        {
            if(subovertotal>=target) break;
            if(wicket>9 || b1>9)
            {
                System.out.println("All out");
                break;
            }
            else 
            {
                System.out.println("Over "+(i+1));
            batsman=getbatsman(team1, b1);
            System.out.println("Current batsman: "+batsman);
            ArrayList <Integer> score=new ArrayList<>();
            int ball=0,bnc=0;
            String val="";
            int run=0;
            while(ball<6)
            {
                if(subovertotal>=target) break;
                    int ind=random.nextInt(ran.length);
                    val=ran[ind];
                if(val.equals("WD"))
                {
                    run=run+1;
                }
                else if(val.equals("BOUNCER"))
                {
                    bnc++;
                    ball++;

                }
                else if(val.equals("NB"))
                {
                    run=run+1;
                }
                else if(val.equals("BNC+WD"))
                {
                    bnc++;
                    run=run+1;
                }
                else if(bnc>=2)
                {
                    run=run+1;
                }
                else if(val.equals("W"))
                {
                    wicket++;
                    ball++;
                    batsman=getbatsman(team1, b1);
                    b1++;
                }
                else
                {
                    run=run+Integer.parseInt(val);
                    ball++;
                }
            }
            subovertotal+=run;
            score.clear();
            }
        }
        System.err.println(subovertotal+"-"+wicket);
        if(subovertotal==target-1)
        {

        }
        else if(subovertotal<target)
        {
            System.out.println(teamtobowl+" win by "+(target-subovertotal)+" runs");
        }
        else if(subovertotal>target)
        {
            System.out.println(teamtobat+" win by "+wicket+" wickets");

        }
        String firstinnings=""+target+"-"+wic;
        String secondinnings=""+subovertotal+"-"+wicket;
        if(subovertotal!=target-1)
        {
            uc.matchsummary(teamtobat, teamtobowl,firstinnings,secondinnings,subovertotal>=target?teamtobat:teamtobowl);
        }
        else 
        {
            sop.Superover1(teamtobat, teamtobowl);
        }
    }

    
}
