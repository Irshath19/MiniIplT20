package iplpkg.UserDashboard;
import java.util.*;
public class teamregistration {
    Scanner in = new Scanner(System.in);
    UserController uc=new UserController();
    public void teamdetails()
    {
        System.out.println("Enter your team details here");
        System.out.println("-----------------------------");
        System.out.println("Enter the team name");
        String teamname=in.nextLine();
        System.out.println("Enter the team country");
        String teamcountry=in.nextLine();
        System.out.println("Enter the coach name");
        String coach=in.nextLine();
        System.out.println("Enter the Owner name");
        String owner=in.nextLine();
        System.out.println("Enter the Manager name");
        String manager=in.nextLine();
        String response=uc.addteam(teamname, teamcountry, coach, owner, manager);
        System.out.println(response);
    }
    
}
