import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Input_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("�������");
	JPanel pan = new JPanel();
	
	JLabel lab2 = new JLabel("������ȣ :");
	JLabel lab3 = new JLabel("���� :");
	JLabel lab4 = new JLabel("���� :");
	JLabel lab5 = new JLabel("���ǻ� :");
	JLabel lab6 = new JLabel("���� :");
	JLabel lab7 = new JLabel("�뿩���� :");
	
	JTextField txtf2 = new JTextField(10);
	JTextField txtf3 = new JTextField(10);
	JTextField txtf4 = new JTextField(10);
	JTextField txtf5 = new JTextField(10);
	JTextField txtf6 = new JTextField(10);
	JTextField txtf7 = new JTextField(10);
	
	JPanel cpan = new JPanel();
	
	JButton bt = new JButton("Ȯ��");
	JButton bt1 = new JButton("���");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BKBean> list;
	
	public Input_book(){
		this.setTitle("�������");
		init();
	}
	
	public void init(){
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.white);
		pan.add(lab);
		
		cpan.setLayout(new GridLayout(6, 1));
		cpan.add(lab2);
		cpan.add(txtf2);
		cpan.add(lab3);
		cpan.add(txtf3);
		cpan.add(lab4);
		cpan.add(txtf4);
		cpan.add(lab5);
		cpan.add(txtf5);
		cpan.add(lab6);
		cpan.add(txtf6);
		cpan.add(lab7);
		cpan.add(txtf7);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		span.add(bt);
		span.add(bt1);
		
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", span);
		
		this.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ȯ��")){
			String code = txtf3.getText();
			String title = txtf2.getText();
			String price = txtf4.getText();
			String author = txtf5.getText();
			String publisher = txtf6.getText();
			String state = txtf7.getText();
			mgr.insertbk(code, title, price, author, publisher, state);
			JOptionPane.showMessageDialog(this, "ó���Ǿ����ϴ�");
			dispose();
			
		}else if(e.getActionCommand().equals("���")){
			dispose();
		}
		
		
	}
}
