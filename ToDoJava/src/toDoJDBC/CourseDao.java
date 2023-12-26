package toDoJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.mysql.cj.protocol.Resultset;

public class CourseDao implements DaoInterface<CourseEntity, Integer> {

	@Override
	public Collection<CourseEntity> getAll() {
		String sqlQuery= "select * from course";
		Collection<CourseEntity> allcourse=new ArrayList<>();
		try(
				Connection conn = JdbcUlities.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
			){
			while(rs.next()) {
				int c_id=rs.getInt(1);
				String tittle= rs.getString(2);
				int duration=rs.getInt(3);
				String provider= rs.getString(4);
				int fees= rs.getInt(5);
				
				CourseEntity currentcourse= new CourseEntity (c_id,tittle,duration,provider,fees);
				allcourse.add(currentcourse);	
			}
		
	}
	 catch (Exception e) {
		// TODO Auto-generated catch block
	  e.printStackTrace();
	}
		return allcourse;
	}

	@Override
	public CourseEntity getOne(Integer courseID) {
		CourseEntity foundcourse=null;
		try(Connection conn=JdbcUlities.buildConnection();
				){
		String sqlQuery="select * from course where courseID=?";
		PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
		pstmt.setInt(1, courseID);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			int id= rs.getInt(1);
			String tittle=rs.getString(2);
			int duration=rs.getInt(3);
			String provider=rs.getString(4);
			int fees = rs.getInt(5);
			
			foundcourse= new CourseEntity(id,tittle,duration,provider,fees);
		
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return foundcourse;
	

}

	@Override
	public void create(CourseEntity course) {
		String sqlQuery="insert into course(courseID,tittle,duration,provider,fees)values(?,?,?,?,?)";
		try(Connection cn= JdbcUlities.buildConnection();
				PreparedStatement pstmt=cn.prepareStatement(sqlQuery);
		   ){
			int cid= course.getCourseID();
			String tittle = course.getTittle();
			int duration= course.getDuration();
			String provider= course.getProvider();
			int fees=course.getFees();
			
			pstmt.setInt(1, cid);
			pstmt.setString(2, tittle);
			pstmt.setInt(3, duration);
			pstmt.setString(4, provider);
            pstmt.setInt(5, fees);
            
            int count=pstmt.executeUpdate();
            System.out.println();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

