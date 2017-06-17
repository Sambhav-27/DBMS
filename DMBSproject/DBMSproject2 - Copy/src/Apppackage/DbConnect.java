package Apppackage;


import java.sql.*;


public class DbConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/projectdb?"+ "user=root&password=nevergiveup");
            //st = con.createStatement();
        }
        catch(Exception ex){
            System.out.println(ex+"Can not connect");
        }
    }
    public void getData(){
        try{
            String query ="select * from train;";
            rs = st.executeQuery(query);
            while(rs.next()){
                String id = rs.getString("src");
                System.out.println(id);
            }
        }
        catch(Exception ex){
            System.out.println(ex +"her");
        }
    }
    
 
}
