package Ex171201;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 메뉴
*/
public class Ex171201_3 extends JFrame implements ActionListener, ItemListener{
	private JMenuBar mb;
	private JMenu menu, smenu;
	private JMenuItem mi1, mi2, smi1, smi2;
	private JRadioButtonMenuItem rb1, rb2;
	private JCheckBoxMenuItem cbm1, cbm2; 
	
	Ex171201_3(){
		//메뉴바 생성
		mb = new JMenuBar();
		
		//첫번째 메뉴를 생성
		menu = new JMenu("1");
		menu.setMnemonic(KeyEvent.VK_F);
		mb.add(menu);
		
		//메뉴 항목 생성
		mi1 = new JMenuItem("메뉴 항목 1", KeyEvent.VK_1);
		
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));//단축키 표시
		mi1.addActionListener(this);
		menu.add(mi1);
		
		ImageIcon icon = new ImageIcon("icon.png");
		mi2 = new JMenuItem("메뉴 항목 2", icon);
		menu.add(mi2);
		
		
		//라디오 버튼 메뉴 항목들을 생성해서 메뉴에 추가
		menu.addSeparator();//선그어서 분리
		ButtonGroup group = new ButtonGroup();
		rb1 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 1");
		rb1.setSelected(true);
		group.add(rb1);
		menu.add(rb1);
		
		rb2 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 2");
		group.add(rb2);
		menu.add(rb2);
		
		//체크박스 메뉴 항목들 생성해서 메뉴에 추가
		menu.addSeparator();
		cbm1 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 1");
		menu.add(cbm1);
		cbm2 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 2");
		menu.add(cbm2);
		
		//서브 메뉴 생성
		menu.addSeparator();
		smenu = new JMenu("서브메뉴");
		smi1 = new JMenuItem("서브 메뉴 항목 1");
		smenu.add(smi1);
		smi2 = new JMenuItem("서브 메뉴 항목 2");
		smenu.add(smi2);
		
		menu.add(smenu);
		
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		Ex171201_3 f =new Ex171201_3();
		f.setTitle("Menu Test");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {}
	@Override
	public void itemStateChanged(ItemEvent arg0) {}

}
