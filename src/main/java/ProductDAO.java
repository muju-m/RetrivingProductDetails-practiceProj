import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductDAO {
	public int insert(Product s) throws ClassNotFoundException, SQLException {
		Connection con = DbUtil.getCon();
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
		
		Statement st =  con.createStatement();
		String sql ="insert into product values("+s.getPid()+","+"'"+s.getPname()+"'"+","+"'"+s.getPrate()+"'"+","+"'"+s.getPquan()+"')";
		int row=st.executeUpdate(sql);
		return row;
	}
	public ResultSet retrive(retriveInfo ri) throws SQLException, ClassNotFoundException {
		Connection con = DbUtil.getCon();
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
		
		Statement st =  con.createStatement();
		String sql = "select * from product where pid ="+"'"+ri.getPidName()+"'";
		ResultSet rs = st.executeQuery(sql);
		
		return rs;
	}

}
