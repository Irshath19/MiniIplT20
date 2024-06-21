package iplpkg.Adminpanel;
import java.sql.ResultSet;
import iplpkg.DBFile.*;

public class AdminDBA {
    public DBManipulation dm;
    public AdminDBA()
    {
        this.dm=new DBManipulation();
    }
    public boolean isAdminThere(String username,String password)
    {
         try {
            String query = "SELECT * FROM admin WHERE username='" + username + "' and password = '" + password + "';";
            ResultSet res = dm.stmt.executeQuery(query);
            return res.next();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }
    
}
