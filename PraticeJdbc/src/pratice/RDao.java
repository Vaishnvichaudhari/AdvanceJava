package pratice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RDao implements DaoInterface<Resturant,Integer> {

	@Override
	public Collection<Resturant> getAll() {
		String sqlquery="select * from Resturant";
		Collection<Resturant> allRest= new ArrayList<>();
		
				try(
					Connection conn=Utils.buildConnection();
					Statement smt= conn.createStatement();
					ResultSet rs=smt.executeQuery(sqlquery);
					){
					while(rs.next()) {
						int  id= rs.getInt(1);
						String name = rs.getString(2);
						String cusine=rs.getString(3);
						int branches=rs.getInt(4);
						
						Resturant rt= new Resturant(id,name,cusine,branches);
					  allRest.add(rt);	
					}
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
	
				return allRest;
	     }

	@Override
	public Resturant GetOne(Integer key) {
		Resturant frest=null;
		try (
			Connection conn= Utils.buildConnection();
		){
			String sqlquery="select * from Resturant where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sqlquery);
			pstmt.setInt(1, key);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				int  id = rs.getInt(1);
				String name = rs.getString(2);
				String cuisine=rs.getString(3);
				int branches=rs.getInt(4);
				
			 	frest=new Resturant(id,name,cuisine,branches);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return frest;
	}

	@Override
	public void create(Resturant newRestaurant) {
		// TODO Auto-generated method stub
		String sqlQuery="insert into Resturant(id,rest_name, rest_cuisine,rest_branches)values(?,?,?,?)";
		try(Connection conn= Utils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				){
			//Extracting the values from the incoming Restaurant object
			int id=newRestaurant.getId();
			String name= newRestaurant.getName();
			String cuisine= newRestaurant.getCuisine();
			int branches=newRestaurant.getBranches();
			
			//Substituitng all the values
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, cuisine);
			pstmt.setInt(4, branches);
			
			int count=pstmt.executeUpdate();
			System.out.println();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	}
	

