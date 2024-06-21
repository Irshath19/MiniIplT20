package iplpkg.Adminpanel;

public class AdminController {
    AdminDBA ada=new AdminDBA();
    public boolean isAdminThere(String username,String passsword)
    {
            return ada.isAdminThere(username,passsword);
    }
    
}
