package student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Login();
	}

	public static Login admin;
	private JPanel Jp1, Jp2, Jp3, Jp4;
	private JLabel Jlb1, Jlb2, Jlb3;
	public JRadioButton Jrb1, Jrb2;
	public static JTextField Jtf;
	private JPasswordField Jpf;
	public JButton Jb1, Jb2;

	public Login() {
		JPanel Jp1 = new JPanel();
		JPanel Jp2 = new JPanel();
		JPanel Jp3 = new JPanel();
		JPanel Jp4 = new JPanel();

		JLabel Jlb1 = new JLabel("用户类型：      ");
		JLabel Jlb2 = new JLabel("用户名：");
		JLabel Jlb3 = new JLabel("密    码：");

		Jrb1 = new JRadioButton("学生");
		Jrb2 = new JRadioButton("教师");

		ButtonGroup bg = new ButtonGroup();
		bg.add(Jrb1);
		bg.add(Jrb2);
		Jrb1.setSelected(true); // 设置按钮组 并且默认选中“学生”

		Jtf = new JTextField();
		Jpf = new JPasswordField();

		Jtf.setColumns(12);
		Jpf.setColumns(12);

		Jb1 = new JButton("登  录");
		Jb1.addActionListener(this); // 为按钮设置监听事件
		Jb2 = new JButton("取 消");
		Jb2.addActionListener(this); // 为按钮设置监听事件

		Jp1.add(Jlb1);
		Jp1.add(Jrb1);
		Jp1.add(Jrb2);

		Jp2.add(Jlb2);
		Jp2.add(Jtf);

		Jp3.add(Jlb3);
		Jp3.add(Jpf);

		Jp4.add(Jb1);
		Jp4.add(Jb2);

		this.add(Jp1); 
		this.add(Jp2);
		this.add(Jp3);
		this.add(Jp4);

		this.setTitle("学生管理系统 - 登录界面");
		this.setBounds(300, 200, 320, 240);
		this.setLayout(new GridLayout(4, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String username = Jtf.getText();
		String password = String.valueOf(Jpf.getPassword());
		// 得到文本框/密码框的值
		if (e.getSource() == Jb1) { // 判断输入的信息是否为空
			if (username.equals("") || password.equals("") || username == null
					|| password == null) { // 如果为空弹出提示信息，并且为文本框/密码框初始化
				JOptionPane.showMessageDialog(null, "请正确输入用户名/密码");
				Jtf.setText("");
				Jpf.setText("");
			} else { // 否则调入数据库进行验证
				Verify();
			}
		}
		if (e.getSource() == Jb2) { // 通过取消按钮判断用户是否退出
			int a = JOptionPane.showConfirmDialog(null, "请问是否退出程序？", "消息",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) { // 退出 整个系统
				this.dispose();
			} else { // 若不退出，为文本框/密码框初始化
				Jtf.setText("");
				Jpf.setText("");
			}
		}
	}

	// public boolean getJRadioButtonValue(){
	// return Jrb1.isSelected();
	// }
	private void Verify() { // 验证方法
							// TODO Auto-generated method stub
		String name = Jtf.getText();
		String password = String.valueOf(Jpf.getPassword());
		TestDB tb = new TestDB();
		ResultSet rs1 = tb
				.query("select Stu_Name,Stu_Password from Student_info where Stu_Name='"
						+ name + "'");
		ResultSet rs2 = tb
				.query("select Teacher_Name,Teacher_Password from Teacher_info where Teacher_Name='"
						+ name + "'");

		try {
			if (Jrb1.isSelected()) {
				if (rs1.next()) {
					if (rs1.getString("Stu_Password").equals(password)) {
						JOptionPane.showMessageDialog(null, "登录成功");
						this.dispose();
						new Studentmain();
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"登录失败！\n         请检查你的用户名/密码");
					Jtf.setText("");
					Jpf.setText("");
				}
			} else {
				if (rs2.next()) {
					if (rs2.getString("Teacher_Password").equals(password)) {
						JOptionPane.showMessageDialog(null, "登录成功！");
						this.dispose();
						new Teachermain();
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"登录失败！\n         请检查你的用户名/密码");
					Jtf.setText("");
					Jpf.setText("");
				}
			}

		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	}
}