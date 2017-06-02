import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class MainApp extends JFrame {

	private JPanel contentPane;
	private int loginAttempt = 0;
	private JTextField txtSearch;
	private JLabel lblStatus;
	private final static String PASSWORD = "$admin";
	private JTable table;
	private Database db;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainApp() {
		setResizable(false);
		setTitle("College Database System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 460);
		
		login();
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 132, 110, 110);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter DTE Code"));
				String name = JOptionPane.showInputDialog(null, "Enter Name");
				String add = JOptionPane.showInputDialog(null, "Enter Address");
				String city = JOptionPane.showInputDialog(null, "Enter City");
				String about = JOptionPane.showInputDialog(null, "Enter About");
				
				db.add(code, name, add, city, about);
			}
		});
		btnAdd.setIcon(new ImageIcon("C:\\Users\\vishal\\workspace\\College Database System\\src\\icon\\appbar.list.add.above.png"));
		btnAdd.setToolTipText("Add");
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(30, 144, 255));
		btnAdd.setBounds(10, 11, 214, 110);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = JOptionPane.showInputDialog(null, "Enter DTE Code", "Remove College",JOptionPane.PLAIN_MESSAGE);
				db.remove(Integer.parseInt(code));
			}
		});
		btnRemove.setToolTipText("Remove");
		btnRemove.setIcon(new ImageIcon("C:\\Users\\vishal\\workspace\\College Database System\\src\\icon\\appbar.list.delete.inline.png"));
		btnRemove.setForeground(new Color(255, 255, 255));
		btnRemove.setBackground(new Color(30, 144, 255));
		btnRemove.setBounds(234, 11, 230, 110);
		contentPane.add(btnRemove);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter DTE Code of the College to be Update"));
				int newCode = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter DTE Code"));
				String name = JOptionPane.showInputDialog(null, "Enter Name");
				String add = JOptionPane.showInputDialog(null, "Enter Address");
				String city = JOptionPane.showInputDialog(null, "Enter City");
				String about = JOptionPane.showInputDialog(null, "Enter About");
				db.update(code, newCode, name, add, city, about);
			}
		});
		btnUpdate.setToolTipText("Update");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\vishal\\workspace\\College Database System\\src\\icon\\appbar.list.hidden.png"));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(30, 144, 255));
		btnUpdate.setBounds(474, 11, 230, 110);
		contentPane.add(btnUpdate);
		
		txtSearch = new JTextField();
		txtSearch.setToolTipText("Enter DTE Code here");
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSearch.setBounds(140, 132, 324, 45);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		txtSearch.requestFocus();
		
		JButton btnSearch_1 = new JButton("");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int code = Integer.parseInt(txtSearch.getText());
				db.showCollege(code);
				txtSearch.setText("");
			}
		});
		btnSearch_1.setToolTipText("Search");
		btnSearch_1.setIcon(new ImageIcon("C:\\Users\\vishal\\workspace\\College Database System\\src\\icon\\appbar.magnify.png"));
		btnSearch_1.setForeground(Color.WHITE);
		btnSearch_1.setBackground(new Color(30, 144, 255));
		btnSearch_1.setBounds(474, 132, 230, 45);
		contentPane.add(btnSearch_1);
		
		lblStatus = new JLabel("Welcome");
		lblStatus.setForeground(new Color(105, 105, 105));
		lblStatus.setBackground(new Color(255, 255, 255));
		lblStatus.setBounds(10, 406, 694, 14);
		contentPane.add(lblStatus);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 188, 694, 218);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("DTE Code :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 128, 120, 49);
		contentPane.add(lblNewLabel);
		
		showStatus("Login");
		
		db = new Database(this);
	
		table = new JTable(db.getData(), db.getColumn()){

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		};
		scrollPane.setViewportView(table);
		
	}
	
	void updateTable() {
		
		table = new JTable(db.getData(), db.getColumn()){

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		};
		scrollPane.setViewportView(table);
	}
	
	private void login() {
		while (true) {
			String pass = JOptionPane.showInputDialog(this, "Enter Password", "Security Login",
					JOptionPane.PLAIN_MESSAGE);
			if (pass.equals(PASSWORD) == false) {
				loginAttempt += 1;
				JOptionPane.showMessageDialog(this, "Wrong Password, Please try again", "Warning",
						JOptionPane.ERROR_MESSAGE);
				if (loginAttempt == 3) {
					System.exit(0);
				}
			} else if (pass.equals(PASSWORD) == true) {
				return;
			} 
		}
	}
	
	void showStatus(String msg) {
		lblStatus.setText(LocalTime.now() + " : " + msg);
	}
}
