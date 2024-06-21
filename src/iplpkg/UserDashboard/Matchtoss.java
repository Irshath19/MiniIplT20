package iplpkg.UserDashboard;
import java.util.ArrayList;
import java.util.Random;

public class Matchtoss {
   public ArrayList<String> matchtoss(String team1,String team2)
   {
    Random random=new Random();
    boolean toss=random.nextBoolean();
    // System.out.println(toss);
    boolean choose=random.nextBoolean();
    if(toss)
    {
        if(choose)
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(team1);
            res.add("bat");
            return res;
        }
        else
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(team1);
            res.add("bowl");
            return res;
        }
    }
    else 
    {
        if(choose)
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(team2);
            res.add("bat");
            return res;
        }
        else
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(team2);
            res.add("bowl");
            return res;
        }
    }
    
   }
    
   public String Chooseto(String team)
   {
    return null;

   }
}
