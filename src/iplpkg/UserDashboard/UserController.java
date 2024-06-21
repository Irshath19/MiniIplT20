package iplpkg.UserDashboard;

public class UserController {
    UserDBA ud=new UserDBA();
    public String addteam(String teamname, String teamcountry, String coach, String owner, String manager)
    {
        return ud.addteam(teamname, teamcountry, coach, owner, manager);
    }
    public String addplayers(String pname,String pteam,String pcountry,String pcity,int page,String prole,String batstyle,String bowlStyle)
    {
        return ud.addplayers(pname, pteam, pcountry, pcity, page, prole, batstyle, bowlStyle);
    }
   public String[] getplayers(String team)
   {
    return ud.getelevens(team);
   }
   public void matchsummary(String team1name,String team2name, String firstinnings,String secondinnings,String winner)
   {
     ud.matchsummary(team1name,team2name,firstinnings,secondinnings,winner);
   }
   public boolean validteam(String team)
   {
    return ud.isTeamthere(team);
   }
}
