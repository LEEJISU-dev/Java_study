import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Admin_Login extends BFrame implements ActionListener {
	public static void main(String[] args) {
		new Admin_Login();
	}//1
	ImageIcon img = new ImageIcon("D:\\img\\admin.png");
	JLabel labimg = new JLabel(img);
	JPanel cpan = new JPanel();
	//4
	JLabel lab = new JLabel("�����ڷα���");
	JPanel pan = new JPanel();
	///5
	
	//North
	JLabel lab1 = new JLabel("ID : ");
	JTextField txtf = new JTextField(10);
	JLabel lab2 = new JLabel("PW : ");
	JTextField txtf1 = new JPasswordField(10);
	
	JPanel pan1 = new JPanel();
	//////6
	//Center
	JButton bt = new JButton("�α���");
	JButton bt1 = new JButton("����");
	JPanel pan2 = new JPanel();
	//7
	
	DBMgr mgr = new DBMgr();
	ArrayList<AdminBean> list;
	AdminBean bean;
	//3
	
	public Admin_Login() {
		this.setTitle("������ �α���");
		list = mgr.login();
		init();
	}
	//8
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.black);
		lab.setForeground(Color.white);
		pan.add(lab);
		pan1.add(labimg);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		pan2.add(lab1);
		pan2.add(txtf);
		pan2.add(lab2);
		pan2.add(txtf1);
		pan2.add(bt);
		pan2.add(bt1);
		
		con.add("Center", pan1);
		con.add("South", pan2);
		
		this.pack();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("�α���")) {
			String id = txtf.getText();
			String pw = txtf1.getText();
			
			if(id.equals(list.get(0).getId())&&pw.equals(list.get(0).getPw())) {
				BookManageMain bmm = new BookManageMain();
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Login Erro..","ErrorMessage",JOptionPane.ERROR_MESSAGE);
				txtf.setText("");
				txtf1.setText("");
			}
		}else {
			dispose();
		}
		
	}
}
