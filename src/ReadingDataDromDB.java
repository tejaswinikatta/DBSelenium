import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadingDataDromDB {
	 public static ArrayList<Object[]> a;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
String host="localhost";
String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/test","root","root123");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from regestrationPage");
		a=new ArrayList<Object[]>();
		while(rs.next()){
			
		String firstname=rs.getString("firstname");
		String lastname=rs.getString("lastname");
		String phone=rs.getString("phone");
		String email=rs.getString("email");
		Object[] ob= {firstname,lastname,phone,email};
		a.add(ob)
		}
	}

}