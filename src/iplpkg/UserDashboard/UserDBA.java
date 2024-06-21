package iplpkg.UserDashboard;

import java.sql.*;
import java.util.*;

import iplpkg.DBFile.DBManipulation;

public class UserDBA {
     public DBManipulation dm;
    public UserDBA()
    {
        this.dm=new DBManipulation();
    }
    public boolean isTeamthere(String team) {
        try {
            String query = "SELECT * FROM team WHERE team_name = ?";
            PreparedStatement pstmt = dm.con.prepareStatement(query);
            pstmt.setString(1, team);
    
            ResultSet res = pstmt.executeQuery();
            boolean teamExists = res.next();
    
            res.close();
            pstmt.close();
    
            return teamExists;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return false;
    }
    // public boolean isTeamthere(String team)
    // {
    //      try {
    //         String query = "SELECT * FROM team WHERE team_name="+team;
    //         ResultSet res = dm.stmt.executeQuery(query);
    //         return res.next();
    //     } catch (Exception e) {
    //         System.out.println("kindly Register your team");
    //     }
    //     return false;
    // }
    public String addteam(String teamname, String teamcountry, String coach, String owner, String manager) {
		try {
			String query = "INSERT INTO team (team_name,team_country,team_coach,team_owner,team_manager) VALUES(\""
					+ teamname + "\",\"" + teamcountry + "\",\"" + coach + "\",\"" + owner + "\",\"" + manager + "\")";
			dm.stmt.execute(query);
			return "Registered Successfully";
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
public void matchsummary(String team1name,String team2name,String firstinnings,String secondinnings,String winner)
{
    try {
        String query = "INSERT INTO Matches (team1name,team2name,firstinnings,secondinnings,winner) VALUES(\""
                + team1name + "\",\"" + team2name + "\",\"" + firstinnings + "\",\"" + secondinnings + "\",\"" + winner + "\")";
        dm.stmt.execute(query);
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}
public String[] getelevens(String team) {
    ArrayList<String> playerNames = new ArrayList<>();

    try {
        String query = "SELECT player_name FROM players WHERE player_team='" + team + "'";
        ResultSet rs = dm.stmt.executeQuery(query);
        while (rs.next()) {
            playerNames.add(rs.getString("player_name"));
        }
        rs.close();
    } catch (Exception e) {
        System.out.println(e.toString());
    }
    return playerNames.toArray(new String[0]);
}

	public String addplayers(String pname, String pteam, String pcountry, String pcity, int page, String prole, String batstyle, String bowlStyle) {
    try {
        String query = "INSERT INTO players (player_name, player_team, player_country, player_city, player_age, player_role, player_batstyle, player_bowlstyle) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstmt = dm.con.prepareStatement(query);
        pstmt.setString(1, pname);
        pstmt.setString(2, pteam);
        pstmt.setString(3, pcountry);
        pstmt.setString(4, pcity);
        pstmt.setInt(5, page);
        pstmt.setString(6, prole);
        pstmt.setString(7, batstyle);
        pstmt.setString(8, bowlStyle);
        
        pstmt.executeUpdate();
        return "Registered Successfully";
    } catch (Exception e) {
        System.out.println(e.toString());
    }
    return "Registration Failed";
}
    
}
