import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BookManageMain extends BFrame implements ActionListener{
	ButtonGroup group = new ButtonGroup();
	JButton bt1 = new JButton("도서대여/반납");
	JButton bt2 = new JButton("회원 등록/삭제");
	JButton bt3 = new JButton("도서등록/삭제");
	JButton bt5 = new JButton("모든 대여 정보");
	JButton bt6 = new JButton("종료");
	JPanel pan = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel pan1_1 = new JPanel();
	ImageIcon img = new ImageIcon("D:\\img\\main.jpg");
	JLabel lab = new JLabel(img);
	JPanel pan2 = new JPanel();
	DBMgr mgr = new DBMgr();
	
	public BookManageMain(){
		this.setTitle("도서 관리 프로그램");
		this.setBounds(100,200,300,300);
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan1.setBackground(Color.WHITE);
		bt1.setBackground(Color.white);
		bt2.setBackground(Color.white);
		bt3.setBackground(Color.white);
		bt5.setBackground(Color.white);
		bt6.setBackground(Color.white);
		pan1.add(pan1_1);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		pan1.add(bt1);
		pan1.add(bt2);
		pan1.add(bt3);
		pan1.add(bt5);
		pan1.add(bt6);
		pan.add(lab);
		con.add("North", pan1);
		con.add("South", pan);
		
		this.pack();
	}
	public static void main(String[] args) {
		new BookManageMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals(bt2.getText())) {
			new Insert_mb();
		}
		else if(button.equals(bt6.getText())) {
			System.exit(0);
		}
		
	}
}
