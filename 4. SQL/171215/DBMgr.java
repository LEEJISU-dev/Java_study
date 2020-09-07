import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

public class DBMgr extends Frame{
	DBCon conn;
	
	DBMgr(){
		conn = new DBCon();
	}
	
	public ArrayList<AdminBean> login(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<AdminBean> list = new ArrayList<AdminBean>();
		String sql = "select * from admin";
		AdminBean bean;
		
		try {
			
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				bean = new AdminBean();
				bean.setId(rs.getString(1));
				bean.setPw(rs.getString(2));
				list.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> allmb(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "select * from member";
		
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MbBean bean = new MbBean();
				bean.setMb_name(rs.getString(1));
				bean.setMb_num(rs.getString(2));
				bean.setMb_phone(rs.getString(3));
				bean.setMb_address(rs.getString(4));
				list.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				//conn은 계속 쓸거라서 안닫음
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> insertMB(String name, String number, String phone, String addr){
		Connection con = null;
		Statement stmt = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "insert into member values ('"+name+"','"+number+"','"+phone+"','"+addr+"')";
		try{
			con = conn.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "이미 있는 아이디 입니다");
		}finally{
			try{
				stmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> deleteMB(String num){
		Connection con = null;
		Statement stmt = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "delete from member where mb_num ='"+num+"'";
		
		try{
			con = conn.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> searchMB(String num){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "select * from member where mb_num ='"+num+"'";
		
		try{
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MbBean bean = new MbBean();
				bean.setMb_name(rs.getString(1));
				bean.setMb_num(rs.getString(2));
				bean.setMb_phone(rs.getString(3));
				bean.setMb_address(rs.getString(4));
				list.add(bean);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				stmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
}
