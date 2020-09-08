import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class Insert_mb extends BFrame implements ActionListener{
	JPanel pan1 = new JPanel();
	JButton bt = new JButton("���");
	JButton bt1 = new JButton("��ȸ");
	JButton bt2 = new JButton("����");
	JButton bt3 = new JButton("���ΰ�ħ");
	JButton bt4 = new JButton("���ư���");
	JButton bt5 = new JButton("����");
	JPanel pan2 = new JPanel();
	
	JTable table;
	JScrollPane scpan;
	
	String col[] = {"�̸�", "�ֹι�ȣ", "��ȭ��ȣ", "�ּ�"};
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	MbBean bean;
	
	public Insert_mb() {
		this.setTitle("ȸ�����");
		list = mgr.allmb();
		init();
	}
	
	public Insert_mb(ArrayList<MbBean> list) {
		this.setTitle("ȸ�����");
		this.list = list;
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		pan1.add(bt3);
		pan1.add(bt);
		pan1.add(bt1);
		pan1.add(bt5);
		pan1.add(bt2);
		pan1.add(bt4);
		
		String record[][] = new String[list.size()][col.length];
		for(int i = 0; i<list.size();i++) {
			bean = list.get(i);
			record[i][0] = bean.getMb_name();
			record[i][1] = bean.getMb_num();
			record[i][2] = bean.getMb_phone();
			record[i][3] = bean.getMb_address();
		}
		table = new JTable(record,col);
		scpan = new JScrollPane(table);
		JPanel panline = new JPanel(new BorderLayout());
		panline.setBorder(new TitledBorder(new EtchedBorder(),"ȸ�����"));
		panline.add(scpan,BorderLayout.CENTER);
		con.add("North", pan1);
		con.add("Center", panline);
		this.pack();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("���")){
			new Input_mb();
		}else if(e.getActionCommand().equals("���ΰ�ħ")){
			dispose();
			new Insert_mb();
		}else if(e.getActionCommand().equals("����")){
			new Delete_mb();
		}else if(e.getActionCommand().equals("���ư���")){
			dispose();
		}else if(e.getActionCommand().equals("��ȸ")){
			new Search_mb();
		}
		
	}
}
