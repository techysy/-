package student;
import java.sql.*;
public class TestDB {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public TestDB() {
		// �������ݿ���������sql ��������
		String Jdriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// ��������Դ ע��ip��ַ�Ͷ˿ںţ����ݿ�����
		String DBserver = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Student";

		try {
			// ��������1��
			Class.forName(Jdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2)
		try {
			// ���ӵ��������ϵ����ݿ�
			String user = "techysy";
			String password = "techysy.com";
			System.out.println("׼������");
			conn = DriverManager.getConnection(DBserver, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("����ʧ��" + e);
		}
		System.out.println("���ӳɹ�");

	}
	  //���ݿ�Ĳ�ѯ
		public ResultSet query(String sql) {
			try {
				//����SQL�������
				st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				
				rs = st.executeQuery(sql);//����sql����ѯ�Ľ����
				System.out.println("��ѯ���");

			} catch (Exception e) {
				System.out.println("��ѯ����"+e);
			}
			return rs;
          
		}
	
	//����޸�ɾ��
		public void add_update_delete(String sql) {
			try {
				st=conn.createStatement();
				int x=st.executeUpdate(sql);
				System.out.println("�����ɹ�"+x+"������");
			} catch (Exception e) {
				 System.out.println("����ʧ��"+e);
			}
		}
		
		//���ݿ�Ĺر�
		public ResultSet close() {
			if (conn!=null) {
				try {
					st.close();
					conn.close();
					System.out.println("���ӹر�");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("���ӹر�ʱ��������"+e);
				}//�ر��������
			
			}
			return rs;
			
		}
}
