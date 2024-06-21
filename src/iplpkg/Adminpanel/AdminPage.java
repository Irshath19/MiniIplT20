package iplpkg.Adminpanel;

import java.util.*;

public class AdminPage {
     Scanner in = new Scanner(System.in);
    AdminController ac=new AdminController();
    AdminHomePage ahp=new AdminHomePage();
    public void AdminPages()
    {
        System.out.println("=========================================");
        System.out.println("Enter the username: ");
        String username=in.nextLine();
        System.out.println("Enter the password");
        String password=in.nextLine();
        if(ac.isAdminThere(username, password))
        {
            ahp.Adminwelcomepage(username);
        }
        else
        {
            System.out.println("false");
        }
        
        
    }
    
}
