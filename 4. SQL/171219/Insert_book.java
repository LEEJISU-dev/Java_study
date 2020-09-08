import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class Insert_book extends BFrame implements ActionListener{
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
	
	String col[] = {"������ȣ", "����","����","���ǻ�","����","���⿩��"};
	DBMgr mgr = new DBMgr();
	ArrayList<BKBean> list;
	BKBean bean;
	
	public Insert_book(){
		this.setTitle("���� �԰�/���");
		list = mgr.allbk();
		init();
	}
	
	public Insert_book(ArrayList<BKBean> list){
		this.setTitle("���� �԰�/���");
		this.list = list;
		init();
	}
	
	public void init(){
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
		for(int i =0; i<list.size(); i++){
			bean = list.get(i);
			record[i][0] = bean.getLib_name();
			record[i][1] = bean.getLib_code();
			record[i][2] = bean.getLib_price();
			record[i][3] = bean.getLib_author();
			record[i][4] = bean.getLib_publisher();
			record[i][5] = bean.getLib_state();
		}
		table = new JTable(record,col);
		scpan = new JScrollPane(table);
		JPanel panline = new JPanel(new BorderLayout());
		panline.setBorder(new TitledBorder(new EtchedBorder(),"�������"));
		//���� ��Ī ����
		panline.add(scpan,BorderLayout.CENTER);
		
		con.add("North", pan1);
		con.add("Center", panline);
		this.pack();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("���")){
			new Input_book();
		}else if(e.getActionCommand().equals("���ΰ�ħ")){
			dispose();
			new Insert_book();
		}else if(e.getActionCommand().equals("���ư���")){
			dispose();
		}else if(e.getActionCommand().equals("����")){
			new Delete_book();
		}else if(e.getActionCommand().equals("����")){
			new Update_book();
		}
		
	}

}
