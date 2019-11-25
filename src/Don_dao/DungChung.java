package Don_dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DungChung {
	public Connection cn;
	public void KetNoi()throws Exception{
		System.out.print("dã kết noi");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://localhost:1433;databaseName=Le_Quy_Don;user=sa; password=123";
		cn=DriverManager.getConnection(url);
		System.out.print("dã kết noi");
	}
}
