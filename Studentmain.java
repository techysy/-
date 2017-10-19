package student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Studentmain extends JFrame implements ActionListener {

	JPanel Jp1, Jp2, Jp3, Jp4, Jp5, Jp6, Jp7, Jp8, Jp9;
	JLabel Title, Jlb0, Jlb1, Jlb2, Jlb3, Jlb4, Jlb5, Jlb6;
	JTextField Jtf0, Jtf1, Jtf2, Jtf3, Jtf4, Jtf5, Jtf6;
	JButton Jb0, Jb1, Jb2;
	JMenuBar Jmb;
	JMenu Jm1, Jm2, Jm3, Jm4, Jm5, Jm6;
	JMenuItem Jm11, Jm12, Jm21, Jm22, Jm31, Jm41, Jm42;

	public static void main(String[] args) {
	// new Studentmain(); // 测试专用
	}

	public Studentmain() { // 构造方法

		JMenuBar Jmb = new JMenuBar();

		JMenu Jm1 = new JMenu("文件");
		JMenu Jm2 = new JMenu("查询");
		JMenu Jm3 = new JMenu("修改");
		JMenu Jm4 = new JMenu("帮助");

		Jm11 = new JMenuItem("返回");
		Jm11.addActionListener(this);
		Jm12 = new JMenuItem("退出");
		Jm12.addActionListener(this);
		Jm21 = new JMenuItem("查询学生信息");
		Jm21.addActionListener(this);
		Jm22 = new JMenuItem("查询学生成绩");
		Jm22.addActionListener(this);
		Jm31 = new JMenuItem("修改学生密码");
		Jm31.addActionListener(this);
		Jm41 = new JMenuItem("帮助文档");
		Jm41.addActionListener(this);
		Jm42 = new JMenuItem("关于软件");
		Jm42.addActionListener(this);
		Jmb.add(Jm1);
		Jmb.add(Jm2);
		Jmb.add(Jm3);
		Jmb.add(Jm4);

		Jm1.add(Jm11);
		Jm1.add(Jm12);
		Jm2.add(Jm21);
		Jm2.add(Jm22);
		Jm3.add(Jm31);
		Jm4.add(Jm41);
		Jm4.add(Jm42);

		Jp1 = new JPanel();
		Jp2 = new JPanel();
		Jp3 = new JPanel();
		Jp4 = new JPanel();
		Jp5 = new JPanel();
		Jp6 = new JPanel();
		Jp7 = new JPanel();
		Jp8 = new JPanel();
		Jp9 = new JPanel();

		Title = new JLabel("标题");

		Jlb0 = new JLabel("标签");
		Jtf0 = new JTextField(10);

		Jb0 = new JButton("按钮1");
		Jb0.addActionListener(this);
		Jb1 = new JButton("按钮2");
		Jb1.addActionListener(this);
		Jb2 = new JButton("按钮3");
		Jb2.addActionListener(this);


		Jlb0 = new JLabel("标签0");
		Jlb1 = new JLabel("标签1");
		Jlb2 = new JLabel("标签2");
		Jlb3 = new JLabel("标签3");
		Jlb4 = new JLabel("标签4");
		Jlb5 = new JLabel("标签5");
		Jlb6 = new JLabel("标签6");

		Jtf0 = new JTextField(10);
		Jtf1 = new JTextField(10);
		Jtf2 = new JTextField(10);
		Jtf3 = new JTextField(10);
		Jtf4 = new JTextField(10);
		Jtf5 = new JTextField(10);
		Jtf6 = new JTextField(10);

		Jb0.setText("修  改");
		Jb1.setText("清  空");
		Jb2.setText("返  回");

		this.add(Jp1);
		this.add(Jp2);
		this.add(Jp3);
		this.add(Jp4);
		this.add(Jp5);
		this.add(Jp6);
		this.add(Jp7);
		this.add(Jp8);
		this.add(Jp9);

		this.Invisible();

		this.setTitle("学生管理系统 - 学生端");
		this.setBounds(400, 200, 640, 480);
		this.setJMenuBar(Jmb);
		this.setLayout(new GridLayout(9, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void ClearTextField() { // 清空文本框数据
		Jtf0.setText("");
		Jtf1.setText("");
		Jtf2.setText("");
		Jtf3.setText("");
		Jtf4.setText("");
		Jtf5.setText("");
		Jtf6.setText("");
	}

	public void Invisible() { // 隐藏所有JPanel
		Jp1.setVisible(false);
		Jp2.setVisible(false);
		Jp3.setVisible(false);
		Jp4.setVisible(false);
		Jp5.setVisible(false);
		Jp6.setVisible(false);
		Jp7.setVisible(false);
		Jp8.setVisible(false);
		Jp9.setVisible(false);
	}

	public void visibleJPanel() { // 显示Jp8、9以外所有JPanel
		Jp1.setVisible(true);
		Jp2.setVisible(true);
		Jp3.setVisible(true);
		Jp4.setVisible(true);
		Jp5.setVisible(true);
		Jp6.setVisible(true);
		Jp7.setVisible(true);
	}

	public void addJPanel() {// 添加控件到JPanel
		Jp1.add(Title);
		Jp2.add(Jlb0);
		Jp2.add(Jtf0);
		Jp3.add(Jlb1);
		Jp3.add(Jtf1);
		Jp4.add(Jlb2);
		Jp4.add(Jtf2);
		Jp5.add(Jlb3);
		Jp5.add(Jtf3);
		Jp6.add(Jlb4);
		Jp6.add(Jtf4);
		Jp7.add(Jlb5);
		Jp7.add(Jtf5);
		Jp8.add(Jlb6);
		Jp8.add(Jtf6);
		Jp9.add(Jb0);
		Jp9.add(Jb1);
		Jp9.add(Jb2);
		Jp9.add(Jb0);
		Jp9.add(Jb1);
		Jp9.add(Jb2);

	}

	public void xsxx() {// 设置学生信息相关标签
		Jlb0.setText("学号：    ");
		Jlb0.setToolTipText("请输入学号!");
		Jlb1.setText("姓名：    ");
		Jlb2.setText("民族：    ");
		Jlb3.setText("性别：    ");
		Jlb4.setText("生日：    ");
		Jlb5.setText("班级：    ");
		Jlb6.setText("密码：    ");
		Jp9.setVisible(false); // 隐藏Jp9
		Jtf0.setEnabled(false);
		Jtf1.setEnabled(false);
		Jtf2.setEnabled(false);
		Jtf3.setEnabled(false);
		Jtf4.setEnabled(false);
		Jtf5.setEnabled(false);
	}

	public void xscj() { // 设置学生成绩相关标签
		Jlb0.setText("学号：    ");
		Jlb0.setToolTipText("学号!");
		Jlb1.setText("姓名：    ");
		Jlb2.setText("高数：    ");
		Jlb3.setText("Java：    ");
		Jlb4.setText("Html：    ");
		Jlb5.setText("  P S ：    ");
		Jp8.setVisible(false);// 隐藏Jp8
		Jp9.setVisible(false); // 隐藏Jp9
		Jtf0.setEnabled(false);
		Jtf1.setEnabled(false);
		Jtf2.setEnabled(false);
		Jtf3.setEnabled(false);
		Jtf4.setEnabled(false);
		Jtf5.setEnabled(false);
	}
	
	public void dbf(){//
		String name = Login.Jtf.getText();
		TestDB db = new TestDB();
		ResultSet rs = db.query("Select * from Student_info where Stu_Name='"
				+ name + "'");
		try {
			while (rs.next()) {
				Jtf0.setText(rs.getString(1));
				Jtf1.setText(rs.getString(2));
				Jtf2.setText(rs.getString(3));
				Jtf3.setText(rs.getString(4));
				Jtf4.setText(rs.getString(5));
				Jtf5.setText(rs.getString(6));
				Jtf6.setText(rs.getString(7));
				
				JOptionPane.showMessageDialog(null, "查询信息成功");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 通过不同子菜单项显示控件
		if (e.getSource() == Jm11) { // 跳转到登陆界面
			int a = JOptionPane.showConfirmDialog(null, "请问是否返回登陆界面？", "消息",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				this.dispose();
				new Login();
			}
		}

		if (e.getSource() == Jm12) {
			int a = JOptionPane.showConfirmDialog(null, "请问是否退出程序？", "消息",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) { // 退出 整个系统
				this.dispose();
			}
		}

		if (e.getSource() == Jm21) {
			Title.setText("查询学生信息");
			Jp8.setVisible(false);
			this.xsxx();// 设置学生信息标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp8、9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
			
			this.dbf();//获取学生信息表并赋值给文本框
		}

		if (e.getSource() == Jm22) {
			Title.setText("查询学生成绩");
			this.xscj();// 设置学生成绩标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp8、9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel

			String name = Login.Jtf.getText();
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_cj where Stu_Name='"
					+ name + "'");
			try {
				while (rs.next()) {
					Jtf0.setText(rs.getString(1));
					Jtf1.setText(rs.getString(2));
					Jtf2.setText(rs.getString(3));
					Jtf3.setText(rs.getString(4));
					Jtf4.setText(rs.getString(5));
					Jtf5.setText(rs.getString(6));
					JOptionPane.showMessageDialog(null, "查询成绩成功");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == Jm31) {
			Title.setText("修改学生密码");

			

			this.xsxx();// 设置学生信息标签
			Jp8.setVisible(true); // 显示Jp8
			Jp9.setVisible(true); // 显示Jp9
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
			this.dbf();//获取学生信息表并赋值给文本框
		}
		if (e.getSource() == Jm42) {
			JOptionPane
					.showMessageDialog(null,
							"            学生管理系统-学生端\n            版本：V1.0.1\n            作者：余师洋");
		}
		if (e.getSource() == Jb0) {// 修改学生信息事件
			String name = Login.Jtf.getText();
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_info ");
			db.add_update_delete("update Student_info set " 
					+ "Stu_Name='"
					+ Jtf1.getText() 
					+ "',Stu_Nation='" 
					+ Jtf2.getText()
					+ "',Stu_Sex='" 
					+ Jtf3.getText() 
					+ "',Stu_Birthday='"
					+ Jtf4.getText() 
					+ "',Stu_Class='" 
					+ Jtf5.getText()
					+ "',Stu_Password='" 
					+ Jtf6.getText() 
					+ "' where Stu_Name='"
					+ name + "'");

			JOptionPane.showMessageDialog(null, "已成功修改信息");
		}

		if (e.getSource() == Jb2) {// 是否隐藏全部控件事件
			int a = JOptionPane.showConfirmDialog(null, "请问是否回到主界面？", "消息",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				this.Invisible(); // 隐藏控件
			}
		}

	}

}
