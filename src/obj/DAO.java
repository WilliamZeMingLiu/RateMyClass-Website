package obj;

import java.sql.Connection;

public class DAO {
	protected Connection conn = null;
	protected String url = "jdbc:mysql://google/Sample?cloudSqlInstance=phonic-agility-255419:us-central1:fproject&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false&user=username&password=password";
	protected String sqlUser = "username";
	protected String sqlPassword = "password";
}
