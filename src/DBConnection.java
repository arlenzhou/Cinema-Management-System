import java.sql.*; 
import java.sql.*; 
import java.sql.*; 


 public class DBConnection {  
 
  
    private Connection conn;  
    private Statement stat;  
    private String url="jdbc:oracle:thin:@fourier.cs.iit.edu:1521:ORCL"; 
    private String user= "jzhou49";;  
    private String password = "zhoujie2312148JAY*";
    //private String driver = 
  
    // ��ʼ�����statement����  
    public Connection getDBConnection()  {  
        try {  
            Class.forName("oracle.jdbc.driver.OracleDriver");//�������� 
            //System.out.println("���ݿ������ɹ�"); 
        } catch (ClassNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } 
        try{
            url = "jdbc:oracle:thin:@fourier.cs.iit.edu:1521:ORCL";  
            user = "jzhou49";//���ݿ��û���  
            password = "zhoujie2312148JAY*";//���ݿ�����  
            conn = DriverManager.getConnection(url, user, password);//�������  
        }catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
		return conn;
        
    }  
  
    // ִ�в��룬�޸ģ�ɾ���ӿ�  
    /*public int executeUpdate(String sql) {  
        int flag = 0;  
        try {  
            flag = stat.executeUpdate(sql);//ִ��sql���  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } finally {  
  
            try {  
                stat.close();//�ͷ���Դ  
                conn.close();  
            } catch (SQLException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
  
        }  
        return flag;  
    }  
  
    // ִ�в�ѯ�Ľӿ�  
    public ResultSet executeQuery(String sql) {  
        ResultSet set = null;  
        try {  
            set = stat.executeQuery(sql);  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } finally {  
          try {  
              stat.close();  
              conn.close();  
          } catch (SQLException e) {  
              // TODO Auto-generated catch block  
              e.printStackTrace();  
          }  
        }  
        return set;  
    }*/
    //public static void main(String[] args){
    //	DBConnection c =new DBConnection();
    //	c.getDBConnection();
    //}
  
}
