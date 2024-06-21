package iplpkg.UserDashboard;

import java.util.Scanner;

public class playerregistration {
    Scanner in = new Scanner(System.in);
    UserController uc=new UserController();
    public void playerdetails()
    {
        System.out.println("Enter the player details here....");
        System.out.println("-------------------------------");
        System.out.println("Enter the player name");
        String pname=in.nextLine();
        System.out.println("Enter the team name");
        String team=in.nextLine();
        System.out.println("Enter the player country");
        String pcountry=in.nextLine();
        System.out.println("Enter the player city");
        String pcity=in.nextLine();
        System.out.println("Enter the age");
        int age=in.nextInt();
        in.nextLine();
        System.out.println("Enter the player role");
        String role=in.nextLine();
        System.out.println("Enter the batting style");
        String batstyle=in.nextLine();
        System.out.println("Enter the bowling style");
        String bowlingstyle=in.nextLine();
        String response =uc.addplayers(pname, team, pcountry, pcity, age, role, batstyle, bowlingstyle);
        System.out.println("-------------------------------");
        System.out.println(response);

    }
}
