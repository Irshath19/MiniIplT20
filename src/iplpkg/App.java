package iplpkg;

import java.util.Scanner;

import iplpkg.Adminpanel.AdminPage;
import iplpkg.UserDashboard.Innings1;
import iplpkg.UserDashboard.Prematch;
import iplpkg.UserDashboard.Userpage;
import iplpkg.UserDashboard.playerregistration;
import iplpkg.UserDashboard.teamregistration;

public class App {
    static AdminPage ap=new AdminPage();
    static Userpage up=new Userpage();
    static teamregistration tr=new teamregistration();
    static playerregistration pr=new playerregistration();
    static Prematch pm=new Prematch();
    static Innings1 ing=new Innings1();
    App app=new App();
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("MINI IPL 2024");
        System.out.println();
        System.out.println("Logged In as....");
        System.out.println();
        System.out.println("[1]-Admin");
        System.out.println("[2]-User");
        System.out.println("[3]-Team Register");
        System.out.println("[4]-Player Register");
        System.out.println("[5]-Let's Play");
        System.out.print("->");
        int choice=in.nextInt();
        if(choice==1)
        {
            ap.AdminPages();
        }
        else if(choice==2)
        {
            up.Userpages();
        }
        else if(choice==3)
        {
            tr.teamdetails();
        }
        else if(choice==4)
        {
            pr.playerdetails();
            // App app=new App();
        }
        else if(choice==5)
        {
            pm.prematchceremony();
        }
        // else if(choice==6)
        // {
        //     ing.Innings("CSK", "MI");
        // }
        else
        {
            System.out.println("Choose the valid number");
        }
        in.close();
    }
    
}
