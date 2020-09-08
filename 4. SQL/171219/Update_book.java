import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Update_book extends BFrame implements ActionListener{
	
	JLabel lab = new JLabel("도서 코드 : ");
	JTextField txtf = new JTextField(10);
	JButton bt = new JButton("검색");
	JPanel pan = new JPanel();
	
	JLabel lab1 = new JLabel("도서코드 :");
	JTextField txtf1 = new JTextField(10);
	JLabel lab2 = new JLabel("제목 :");
	JTextField txtf2 = new JTextField(10);
	JLabel lab3 = new JLabel("저자 :");
	JTextField txtf3 = new JTextField(10);
	JLabel lab4 = new JLabel("출판사 :");
	JTextField txtf4 = new JTextField(10);
	JLabel lab5 = new JLabel("가격 :");
	JTextField txtf5 = new JTextField(10);
	JLabel lab6 = new JLabel("대여여부 :");
	JTextField txtf6 = new JTextField(10);
	JPanel pan1 = new JPanel();
	
	JButton bt1 = new JButton("수정");
	JButton bt2 = new JButton("취소");
	JPanel pan2 = new JPanel();
	
	JTable table;
	JScrollPane scpan;
	String col[] = {"제목", "도서번호","가격", "저자", "출판사","대여여부"};
	DBMgr mgr = new DBMgr();
	ArrayList<BKBean> list;
	BKBean bean;
	
	public Update_book(){
		this.setTitle("도서정보 수정 페이지");
		init();
	}
	
	private void init(){
		Container con = this.getContentPane();
		pan.add(lab);
		pan.add(txtf);
		pan.add(bt);
		
		pan1.setLayout(new GridLayout(6, 1));
		pan1.add(lab1);
		pan1.add(txtf1);
		pan1.add(lab2);
		pan1.add(txtf2);
		pan1.add(lab3);
		pan1.add(txtf3);
		pan1.add(lab4);
		pan1.add(txtf4);
		pan1.add(lab5);
		pan1.add(txtf5);
		pan1.add(lab6);
		pan1.add(txtf6);
		
		pan2.add(bt1);
		pan2.add(bt2);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		con.add("North", pan);
		con.add("Center",pan1);
		con.add("South",pan2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")){
			String code = txtf.getText();
			list= mgr.update_book(code);
			txtf1.setText(list.get(0).getLib_code());
			txtf2.setText(list.get(0).getLib_name());
			txtf3.setText(list.get(0).getLib_price());
			txtf4.setText(list.get(0).getLib_author());
			txtf5.setText(list.get(0).getLib_publisher());
			txtf6.setText(list.get(0).getLib_state());
			
		}else if(e.getActionCommand().equals("수정")){
			String title = txtf2.getText();
			String code = txtf1.getText();
			String price = txtf3.getText();
			String auth = txtf4.getText();
			String publish = txtf5.getText();
			String state = txtf6.getText();
			mgr.update_book2(title, code, price, auth, publish, state);
			JOptionPane.showMessageDialog(this, "수정되었습니다");
			dispose();
		}else if(e.getActionCommand().equals("취소")){
			dispose();
		}
		
	}

}
