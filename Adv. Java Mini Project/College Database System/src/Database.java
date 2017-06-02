import java.sql.*;

import javax.swing.JOptionPane;

public class Database {

	private Connection con;
	private MainApp ap;
	private PreparedStatement addStatement;
	private PreparedStatement removeStatement;
	private PreparedStatement updateStatement;
	private final int COLUMN_NUMBER = 5;
	private Statement s;
	
	Database(MainApp ap) {
		try {
			this.ap = ap;
			
			Class.forName("org.sqlite.JDBC");
			
			con = DriverManager.getConnection("jdbc:sqlite:college_db.db");
			ap.showStatus("Database Connected !!");
			
			addStatement = con.prepareStatement("insert into college_data values(?,?,?,?,?)");
			removeStatement = con.prepareStatement("delete from college_data where dte_code = ?");
			updateStatement = con.prepareStatement("update college_data set dte_code = ?, name = ?, address = ?, city = ?, about = ? "
					+ "where dte_code = ?");
			
		} catch (Exception e) {
			e.printStackTrace();
			ap.showStatus(e.getMessage());
		}
	}
	
	String[][] getData() {
		
		String data[][] = new String[100][COLUMN_NUMBER];
		
		try {
			s = con.createStatement();
			ResultSet res = s.executeQuery("select * from college_data");
			int c = 0;
			while(res.next()) {
				for(int r = 0; r < COLUMN_NUMBER; r++) {
					switch(r) {
					case 0:
						data[c][r] = res.getInt("dte_code")+"";
						break;
					case 1:
						data[c][r] = res.getString("name");
						break;
					case 2:
						data[c][r] = res.getString("address");
						break;
					case 3:
						data[c][r] = res.getString("city");
						break;
					case 4:
						data[c][r] = res.getString("about");
						break;
					}
				}
				c++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			ap.showStatus(e.getMessage());
		}
		
		return data;
	}
	
	String[] getColumn() {
		
		return new String[] {"DTE Code", "Name", "Address", "City","About"};
	}
	
	void add(int code, String name, String address, String city, String about) {
		try {
			addStatement.setInt(1, code);
			addStatement.setString(2, name);
			addStatement.setString(3, address);
			addStatement.setString(4, city);
			addStatement.setString(5, about);
			addStatement.executeUpdate();
			ap.showStatus("New college inserted");
			ap.updateTable();
			
		} catch (SQLException e) {
			e.printStackTrace();
			ap.showStatus(e.getMessage());
		}
	}
	
	void update(int code, int newCode, String name, String address, String city, String about) {
		try {
			updateStatement.setInt(6, code);
			updateStatement.setInt(1, newCode);
			updateStatement.setString(2, name);
			updateStatement.setString(3, address);
			updateStatement.setString(4, city);
			updateStatement.setString(5, about);
			updateStatement.executeUpdate();
			ap.updateTable();
			
		} catch (SQLException e) {
			e.printStackTrace();
			ap.showStatus(e.getMessage());
		}
	}
	
	void remove(int code) {
		try {
			
			removeStatement.setInt(1, code);
			removeStatement.executeUpdate();
			ap.showStatus("1 College removed");
			ap.updateTable();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
			ap.showStatus(e.getMessage());
		}
	}
	
	void showCollege(int code) {
		
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("select * from college_data where dte_code = " + code);
			while(r.next()) {
				int dteCode = r.getInt("dte_code");
				String name = r.getString("name");
				String address = r.getString("address");
				String city = r.getString("city");
				String msg = "DTE Code : " + dteCode + "\nName : " + name + "\nAddress : " + address + "\nCity : " + city;
				JOptionPane.showMessageDialog(null, msg, name, JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
