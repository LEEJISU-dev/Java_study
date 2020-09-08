import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Delete_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("도서 삭제");
	JPanel pan = new JPanel();
	
	JLabel lab1 = new JLabel("도서번호");
	JTextField txtf = new JTextField(10);
	JPanel cpan = new JPanel();
	
	JButton bt = new JButton("삭제");
	JButton bt1 = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BKBean> list;
	
	public Delete_book(){
		this.setTitle("도서삭제");
		init();
	}
	
	private void init(){
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.white);
		pan.add(lab);

		bt.addActionListener(this);
		bt1.addActionListener(this);
		cpan.add(lab1);
		cpan.add(txtf);
		span.add(bt);
		span.add(bt1);
		
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", span);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("삭제")){
			String code = txtf.getText();
			list = mgr.deletebk(code);
			JOptionPane.showMessageDialog(this, "처리되었습니다");
			dispose();
		}else if(e.getActionCommand().equals("취소")){
			dispose();
			txtf.setText(" ");
		}
		
	}
}
