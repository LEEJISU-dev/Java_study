import java.sql.*;
import java.util.*;
/*
	친구 추가  / 검색/ 전체 출력 / 종료
*/
public class Ex171213_3{

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;//정적인 sql
		ResultSet rs= null;
		PreparedStatement pst = null;//동적인 sql
		
		String id ="root";
		String pass ="1234";
		String url ="jdbc:mysql://localhost:3306/java";
		String sql;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.exit(0);
		}
		
		try{
			con = DriverManager.getConnection(url, id, pass);
			
		}catch(Exception e){
			System.exit(0);
		}
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1.친구 추가\t 2. 주민번호로 검색\t 3.전체출력\t 4.수정  5.종료");
			int select =sc.nextInt();
			switch(select){
			case 1:
				System.out.println("[친구 추가]");
				System.out.println();
				System.out.print("이름 >>");
				String name = sc.next();
				System.out.print("주민 번호 >>");
				String jumin = sc.next();
				sql = "insert into friend values(null,?,?)";
				
				try{
					pst = con.prepareStatement(sql);
					pst.setString(1, name);//첫번째 ?값
					pst.setString(2, jumin);
					pst.executeUpdate();
					pst.close();
					System.out.println("등록 완료 되었습니다");
				}catch(SQLException e){
					System.exit(0);
				}
				break;
			case 2:
				System.out.println("[검색하기]");
				System.out.print("주민번호를 입력하세요>>");
				jumin =sc.next();
				sql = "select * from friend where jumin='"+jumin+"'";
				try{
					st = con.createStatement();

					rs = st.executeQuery(sql);
					
					while(rs.next()){
						int num = rs.getInt(1);
						name =rs.getString(2);
						System.out.println(num + "\t"+name+"\t"+jumin);
						System.out.println();
					}
					st.close();
					rs.close();
					System.out.println("검색 완료");
				}catch(SQLException e){
					System.exit(0);
				}
				break;
			case 3:
				System.out.println("[전체 출력]");
				sql ="select * from friend";
				try{
					st = con.createStatement();
					rs= st.executeQuery(sql);
					while(rs.next()){
						int num =rs.getInt(1);
						name = rs.getString(2);
						jumin = rs.getString(3);
						System.out.println(num + "\t"+name+"\t"+jumin);
						System.out.println();
					}
					st.close();
					rs.close();
				}catch(SQLException e){
					System.exit(0);
				}
				break;
			case 4:
				System.out.println("[친구 수정]");
				
			case 5:
				System.out.println("프로그램 종료");
				try {
					con.close();//무조건 예외 처리해야함
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		}
	}

}
