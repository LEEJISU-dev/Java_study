import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Input_mb extends BFrame implements ActionListener{
	JLabel lab = new JLabel("ȸ�����");
	JPanel pan = new JPanel();
	
	JLabel lab2 = new JLabel("�̸� :");
	JLabel lab3 = new JLabel("�ֹι�ȣ :");
	JLabel lab4 = new JLabel("����ó :");
	JLabel lab5 = new JLabel("�ּ� :");
	JTextField txtf = new JTextField(10);
	JTextField txtf1 = new JTextField(10);
	JTextField txtf2 = new JTextField(10);
	JTextField txtf3 = new JTextField(10);
	JPanel cpan = new JPanel();
	
	JButton bt = new JButton("Ȯ��");
	JButton bt1 = new JButton("���");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	
	public Input_mb(){
		this.setTitle("ȸ�����");
		init();
	}
	private void init(){
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.white);
		pan.add(lab);
		
		cpan.setLayout(new GridLayout(4, 1));
		cpan.add(lab2);
		cpan.add(txtf);
		cpan.add(lab3);
		cpan.add(txtf1);
		cpan.add(lab4);
		cpan.add(txtf2);
		cpan.add(lab5);
		cpan.add(txtf3);
		
		
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
			String name = txtf.getText();
			String number = txtf1.getText();
			String phone = txtf2.getText();
			String addr = txtf3.getText();
			mgr.insertMB(name, number, phone, addr);
			JOptionPane.showMessageDialog(this, "ó���Ǿ����ϴ�");
			dispose();
		}else if(e.getActionCommand().equals("���")){
			dispose();
			txtf.setText(" ");
		}
		
	}

}
