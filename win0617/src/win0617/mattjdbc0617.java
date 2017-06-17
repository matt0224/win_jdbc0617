package win0617;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mattjdbc0617 {
	public static void main(String[] args) {
		// 1. Driver
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("OK");
		}catch(ClassNotFoundException ee){
			System.out.println(ee);
			System.exit(0);
		}
		
		try{
			// 2. Connection
			Connection conn = 
				DriverManager.getConnection(
					"jdbc:mysql://localhost:7777/matt?" +
                    "user=root&password=root");
			// 3. SQL statement
			Statement stmt = conn.createStatement();
			// 4. query
			String sql = "INSERT INTO cust (cname,tel,birthday)" + 
					" VALUES ('matt','123','2000-02-08')";
			System.out.println(sql);
			boolean isQueryOK = stmt.execute(sql);
			if (isQueryOK){
				System.out.println("OK");
			}else{
				System.out.println("XX");
			}
		}catch(SQLException se){
			System.out.println(se);
		}
		
		
		
	}
}
