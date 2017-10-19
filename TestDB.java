package student;
import java.sql.*;
public class TestDB {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public TestDB() {
		// 声明数据库驱动程序，sql 数据引擎
		String Jdriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// 声明数据源 注意ip地址和端口号，数据库名字
		String DBserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Student";

		try {
			// 加载驱动1）
			Class.forName(Jdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2)
		try {
			// 连接到服务器上的数据库
			String user = "techysy";
			String password = "techysy.com";
			System.out.println("准备连接");
			conn = DriverManager.getConnection(DBserver, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接失败" + e);
		}
		System.out.println("连接成功");

	}
	  //数据库的查询
		public ResultSet query(String sql) {
			try {
				//创建SQL命令对象
				st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				
				rs = st.executeQuery(sql);//返回sql语句查询的结果集
				System.out.println("查询完毕");

			} catch (Exception e) {
				System.out.println("查询出错"+e);
			}
			return rs;
          
		}
	
	//添加修改删除
		public void add_update_delete(String sql) {
			try {
				st=conn.createStatement();
				int x=st.executeUpdate(sql);
				System.out.println("操作成功"+x+"条数据");
			} catch (Exception e) {
				 System.out.println("操作失败"+e);
			}
		}
		
		//数据库的关闭
		public ResultSet close() {
			if (conn!=null) {
				try {
					st.close();
					conn.close();
					System.out.println("连接关闭");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("连接关闭时发生错误"+e);
				}//关闭命令对象
			
			}
			return rs;
			
		}
}
