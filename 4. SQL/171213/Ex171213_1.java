import java.sql.*;

public class Ex171213_1{

	public static void main(String[] args) {
		Connection con = null;	//연결(접속)
		Statement stmt = null;	//sql
		ResultSet rs = null;		//결과 실행
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1234");
			String sql = "select * from sample";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			}
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception e){
			System.exit(0);
		}

		
	}

}