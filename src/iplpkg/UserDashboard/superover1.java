package iplpkg.UserDashboard;

import java.util.ArrayList;
import java.util.Random;

public class superover1 {
    UserController uc=new UserController();
    superover2 sp2=new superover2();
    public String getbatsman(String team1[],int b1)
    {
        if(b1<10)
        {
            String bats=team1[b1];
            b1++;
            return bats;
        }
        return "All Out";
    }
    public void Superover1(String teamtobat,String teamtobowl)
    {
        String team1[]=uc.getplayers(teamtobat);
        String team2[]=uc.getplayers(teamtobowl);
        int b1=0;
        String ran[]={"1","2","3","4","5","6","7","W","WD","NB","0","BOUNCER","BNC+WD"};
        Random random=new Random();
        System.out.println("Team to bat: "+teamtobat);
        System.out.println("Team to bowl: "+teamtobowl);
        int subovertotal=0,wicket=0;
       
        String batsman="";
            if(wicket>=2 || b1>=2)
            {
                System.out.println("All out");
            }
            else 
            {
            batsman=getbatsman(team1, b1);
            System.out.println("Current batsman: "+batsman);
            ArrayList <Integer> score=new ArrayList<>();
            int ball=0,bnc=0;
            String val="";
            int run=0;
            while(ball<6)
            {
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
                    if(batsman.equals("All Out"))
                    break;
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
        System.err.println(subovertotal+"-"+wicket);
        for (int i = 10; i >= 0; i--) {
            if(i==10)
            {
                System.out.println();
                System.out.println(teamtobowl+" need "+(subovertotal+1)+" to win the match");
                System.out.println("Drinks break...");
                System.out.println();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
        }
        sp2.superover(teamtobat, teamtobowl, subovertotal+1, wicket);
    
}
}
