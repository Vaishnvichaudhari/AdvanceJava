package day4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import day4.Utils.JdbcUtils;
import day4.beans.Resturant;

public class ResturantDao implements DaoInterface<Resturant, Integer> {

	@Override
	public Collection<Resturant> getAll() {
		String sqlQuery = "select id, rest_name, rest_cuisine,  rest_branches from resturant";
		Collection<Resturant> allRestaurants = new ArrayList<>();
		try(
				Connection conn = JdbcUtils.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				){
			while(rs.next()) {
				int r_id = rs.getInt(1);
				String name = rs.getString(2);
				String cuisine = rs.getString(3);
				int branches = rs.getInt(4);
				
				//Populating a Restaurant object based upon the values fetched from the record.
				Resturant currentRestaurant = new Resturant(r_id, name, cuisine, branches);
				//Adding this Restaurant object into the Collection
				allRestaurants.add(currentRestaurant);
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		 
		return allRestaurants;
	}

	@Override
	public Resturant getOne(Integer id) {
		Resturant foundResturant = null;
		try(
			Connection conn = JdbcUtils.buildConnection();
				){
		String sqlQuery = 
			"select id, rest_name, rest_cuisine,rest_branches from resturant where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, id);
			ResultSet rs =  pstmt.executeQuery();
			if(rs.next()) {
				int  r_id = rs.getInt(1);
				String name = rs.getString(2);
				String cuisine = rs.getString(3);
				int branches = rs.getInt(4);
				
		foundResturant = new Resturant(r_id, name, cuisine, branches);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundResturant;
	}



	@Override
	public void create(Resturant newRestaurant) {
		// TODO Auto-generated method stub
		String sqlQuery="insert into resturant(id,rest_name, rest_cuisine,rest_branches)values(?,?,?,?)";
		try(Connection conn= JdbcUtils.buildConnection();
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
	
	
//DELETE ONE RECORD USING ID
	@Override
	public void deleteOne(Integer id) {
		// TODO Auto-generated method stub
		String sqlQuery="delete from resturant where id=?";
		try(Connection conn= JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int count =pstmt.executeUpdate();
					System.out.println(count +"record deleted");
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}
		
		
		}
	
	//UPDATE RECORDS

	@Override
	public void update(Resturant modifiedResturant) {
		// TODO Auto-generated method stub
		String sqlQuery="update resturant set rest_name =? ,rest_cuisine=? , rest_branches=? where id=?";
		try(Connection conn= JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				){
			int id=modifiedResturant.getId();
			String name= modifiedResturant.getName();
			String cuisine= modifiedResturant.getCuisine();
			int branches=modifiedResturant.getBranches();
			
			//Substituitng all the values
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setString(2, cuisine);
			pstmt.setInt(3, branches);
			
			int count =pstmt.executeUpdate();
			System.out.println(count +"record Updated");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	 }


		
}










