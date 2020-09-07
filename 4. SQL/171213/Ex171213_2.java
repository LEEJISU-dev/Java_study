import java.sql.*;
/* 결과값
	1	aaa	801010-1000000	Fri Oct 10 00:00:00 KST 1980	
	2	bbb	981010-1000000	Sat Oct 10 00:00:00 KST 1998	
	3	ccc	941010-1000000	Mon Oct 10 00:00:00 KST 1994
*/
public class Ex171213_2{

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs= null;
		
		String id ="root";
		String pass ="1234";
		String url ="jdbc:mysql://localhost:3306/java";
		String sql ="select * from person";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.exit(0);
		}
		
		try{
			con = DriverManager.getConnection(url, id, pass);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int num = rs.getInt("num");//==rs.getInt(1);
				String name = rs.getString("name");
				String jumin = rs.getString("jumin");
				java.sql.Date date = rs.getDate("birth");
				java.util.Date d= new java.util.Date(date.getTime());
				
				System.out.println(num +"\t"+name +"\t"+jumin +"\t"+ d.toString() +"\t");
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			
		}

	}

}