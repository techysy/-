package student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Teachermain extends JFrame implements ActionListener {

	JPanel Jp1, Jp2, Jp3, Jp4, Jp5, Jp6, Jp7, Jp8, Jp9;
	JLabel Title, Jlb0, Jlb1, Jlb2, Jlb3, Jlb4, Jlb5, Jlb6;
	JRadioButton Jrb1, Jrb2;
	JTextField Jtf0, Jtf1, Jtf2, Jtf3, Jtf4, Jtf5, Jtf6;
	JButton Jb11, Jb12, Jb21, Jb22, Jb31, Jb32, Jb41, Jb42, Jb51, Jb52;

	JMenuBar Jmb;
	JMenu Jm1, Jm2, Jm3, Jm4, Jm5, Jm6;
	JMenuItem Jm11, Jm12, Jm21, Jm22, Jm31, Jm32, Jm41, Jm42, Jm51, Jm52, Jm61,
			Jm62;

	public static void main(String[] args) {
//		new Teachermain();   测试专用
	}

	public Teachermain() { // 构造方法

		JMenuBar Jmb = new JMenuBar();

		JMenu Jm1 = new JMenu("文件");
		JMenu Jm2 = new JMenu("查询");
		JMenu Jm3 = new JMenu("修改");
		JMenu Jm4 = new JMenu("添加");
		JMenu Jm5 = new JMenu("删除");
		JMenu Jm6 = new JMenu("帮助");

		Jm11 = new JMenuItem("返回");
		Jm11.addActionListener(this);
		Jm12 = new JMenuItem("退出");
		Jm12.addActionListener(this);
		Jm21 = new JMenuItem("查询学生信息");
		Jm21.addActionListener(this);
		Jm22 = new JMenuItem("查询学生成绩");
		Jm22.addActionListener(this);
		Jm31 = new JMenuItem("修改学生信息");
		Jm31.addActionListener(this);
		Jm32 = new JMenuItem("修改学生成绩");
		Jm32.addActionListener(this);
		Jm41 = new JMenuItem("添加学生信息");
		Jm41.addActionListener(this);
		Jm42 = new JMenuItem("添加学生成绩");
		Jm42.addActionListener(this);
		Jm51 = new JMenuItem("删除学生信息");
		Jm51.addActionListener(this);
		Jm52 = new JMenuItem("删除学生成绩");
		Jm52.addActionListener(this);
		Jm61 = new JMenuItem("帮助文档");
		Jm61.addActionListener(this);
		Jm62 = new JMenuItem("关于软件");
		Jm62.addActionListener(this);
		Jmb.add(Jm1);
		Jmb.add(Jm2);
		Jmb.add(Jm3);
		Jmb.add(Jm4);
		Jmb.add(Jm5);
		Jmb.add(Jm6);

		Jm1.add(Jm11);
		Jm1.add(Jm12);
		Jm2.add(Jm21);
		Jm2.add(Jm22);
		Jm3.add(Jm31);
		Jm3.add(Jm32);
		Jm4.add(Jm41);
		Jm4.add(Jm42);
		Jm5.add(Jm51);
		Jm5.add(Jm52);
		Jm6.add(Jm61);
		Jm6.add(Jm62);

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

		Jb11 = new JButton("按钮11");
		Jb11.addActionListener(this);
		Jb12 = new JButton("按钮12");
		Jb12.addActionListener(this);
		Jb21 = new JButton("按钮21");
		Jb21.addActionListener(this);
		Jb22 = new JButton("按钮22");
		Jb22.addActionListener(this);
		Jb31 = new JButton("按钮31");
		Jb31.addActionListener(this);
		Jb32 = new JButton("按钮32");
		Jb32.addActionListener(this);
		Jb41 = new JButton("按钮41");
		Jb41.addActionListener(this);
		Jb42 = new JButton("按钮42");
		Jb42.addActionListener(this);
		Jb51 = new JButton("按钮51");
		Jb51.addActionListener(this);
		Jb52 = new JButton("按钮52");
		Jb52.addActionListener(this);

		Jlb0 = new JLabel("标签0");
		Jlb1 = new JLabel("标签1");
		Jlb2 = new JLabel("标签2");
		Jlb3 = new JLabel("标签3");
		Jlb4 = new JLabel("标签4");
		Jlb5 = new JLabel("标签5");
		Jlb6 = new JLabel("标签6");

		Jtf0 = new JTextField(12);
		Jtf1 = new JTextField(10);
		Jtf2 = new JTextField(10);
		Jtf3 = new JTextField(10);
		Jtf4 = new JTextField(10);
		Jtf5 = new JTextField(10);
		Jtf6 = new JTextField(10);

		Jb11.setText("查  询");
		Jb12.setText("查  询");
		Jb21.setText("修  改");
		Jb22.setText("修  改");
		Jb31.setText("添  加");
		Jb32.setText("添  加");
		Jb41.setText("删  除");
		Jb42.setText("删  除");
		Jb51.setText("重  置");
		Jb52.setText("返  回");

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

		this.setTitle("学生管理系统 - 教师端");
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

	public void visibleJPanel() { // 显示Jp9以外所有JPanel
		Jp1.setVisible(true);
		Jp2.setVisible(true);
		Jp3.setVisible(true);
		Jp4.setVisible(true);
		Jp5.setVisible(true);
		Jp6.setVisible(true);
		Jp7.setVisible(true);
		Jp8.setVisible(true);
	}

	public void addJPanel() {// 添加控件到JPanel
		Jp1.add(Title);
		Jp2.add(Jlb0);
		Jp2.add(Jtf0);
		Jp3.add(Jb11);
		Jp3.add(Jb12);
		Jp3.add(Jb21);
		Jp3.add(Jb22);
		Jp3.add(Jb31);
		Jp3.add(Jb32);
		Jp3.add(Jb41);
		Jp3.add(Jb42);
		Jp3.add(Jb51);
		Jp3.add(Jb52);
		Jp4.add(Jlb1);
		Jp4.add(Jtf1);
		Jp5.add(Jlb2);
		Jp5.add(Jtf2);
		Jp6.add(Jlb3);
		Jp6.add(Jtf3);
		Jp7.add(Jlb4);
		Jp7.add(Jtf4);
		Jp8.add(Jlb5);
		Jp8.add(Jtf5);
		Jp9.add(Jlb6);
		Jp9.add(Jtf6);
	}

	public void xsxx() {// 设置学生信息相关标签
		Jlb0.setText("请输入学号：    ");
		Jlb0.setToolTipText("请输入学号!");
		Jlb1.setText("姓名：    ");
		Jlb2.setText("民族：    ");
		Jlb3.setText("性别：    ");
		Jlb4.setText("生日：    ");
		Jlb5.setText("班级：    ");
		Jlb6.setText("密码：    ");
		Jp9.setVisible(false); // 隐藏Jp9
	}

	public void xscj() { // 设置学生成绩相关标签
		Jlb0.setText("请输入学号：    ");
		Jlb0.setToolTipText("请输入学号!");
		Jlb1.setText("姓名：    ");
		Jlb2.setText("高数：    ");
		Jlb3.setText("Java：    ");
		Jlb4.setText("Html：    ");
		Jlb5.setText("  P S ：    ");
		Jp9.setVisible(false); // 隐藏Jp9
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

			Jb11.setVisible(true);
			Jb12.setVisible(false);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xsxx();// 设置学生信息标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm22) {
			Title.setText("查询学生成绩");

			Jb11.setVisible(false);
			Jb12.setVisible(true);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xscj();// 设置学生成绩标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}
		if (e.getSource() == Jm31) {
			Title.setText("修改学生信息");

			Jb11.setVisible(true);
			Jb12.setVisible(false);
			Jb21.setVisible(true);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xsxx();// 设置学生信息标签
			Jp9.setVisible(true); // 显示Jp9
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm32) {
			Title.setText("修改学生成绩");

			Jb11.setVisible(false);
			Jb12.setVisible(true);
			Jb21.setVisible(false);
			Jb22.setVisible(true);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xscj();// 设置学生成绩标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm41) {
			Title.setText("添加学生信息");

			Jb11.setVisible(false);
			Jb12.setVisible(false);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(true);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xsxx();// 设置学生信息标签
			Jp9.setVisible(true); // 显示Jp9
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm42) {
			Title.setText("添加学生成绩");

			Jb11.setVisible(false);
			Jb12.setVisible(false);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(true);
			Jb41.setVisible(false);
			Jb42.setVisible(false);

			this.xscj();// 设置学生成绩标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}
		if (e.getSource() == Jm51) {
			Title.setText("删除学生信息");

			Jb11.setVisible(true);
			Jb12.setVisible(false);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(true);
			Jb42.setVisible(false);

			this.xsxx();// 设置学生信息标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm52) {
			Title.setText("删除学生成绩");

			Jb11.setVisible(false);
			Jb12.setVisible(true);
			Jb21.setVisible(false);
			Jb22.setVisible(false);
			Jb31.setVisible(false);
			Jb32.setVisible(false);
			Jb41.setVisible(false);
			Jb42.setVisible(true);

			this.xscj();// 设置学生成绩标签
			this.ClearTextField(); // 清空文本框数据
			this.visibleJPanel(); // 显示Jp9以外所有JPanel
			this.addJPanel();// 添加控件到JPanel
		}

		if (e.getSource() == Jm62) {
			JOptionPane
					.showMessageDialog(null,
							"            学生管理系统-教师端\n            版本：V1.0.0\n            作者：余师洋");
		}
		// 通过不同按钮时间来实现功能
		if (e.getSource() == Jb11) {// 查询学生信息
			String name = Jtf0.getText();
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "请输入学号查询 ！");
			} else {
				TestDB db = new TestDB();
				ResultSet rs = db
						.query("Select * from Student_info where Stu_ID='"
								+ Jtf0.getText() + "'");
				try {
					while (rs.next()) {
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
		}

		if (e.getSource() == Jb12) {// 查询学生成绩事件
			String name = Jtf0.getText();
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "请输入学号查询 ！");
			} else {
				TestDB db = new TestDB();
				ResultSet rs = db
						.query("Select * from Student_cj where Stu_ID='"
								+ Jtf0.getText() + "'");
				try {
					while (rs.next()) {
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
		}
		if (e.getSource() == Jb21) {// 修改学生信息事件
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
					+ "' where Stu_ID='"
					+ Jtf0.getText() + "'");

			JOptionPane.showMessageDialog(null, "已成功修改信息");
		}
		if (e.getSource() == Jb22) {// 修改学生成绩事件
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_cj ");
			db.add_update_delete("update Student_cj set " 
					+ "Stu_Name='"
					+ Jtf1.getText() 
					+ "',Stu_Math='" 
					+ Jtf2.getText() 
					+ "',Stu_Java='"
					+ Jtf3.getText() 
					+ "',Stu_Html='" 
					+ Jtf4.getText()
					+ "',Stu_PS='" 
					+ Jtf5.getText() 
					+ "' where Stu_ID='"
					+ Jtf0.getText() 
					+ "'");

			JOptionPane.showMessageDialog(null, "已成功修改成绩");
		}
		if (e.getSource() == Jb31) {// 添加学生信息事件
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_info ");
			db.add_update_delete("insert into Student_info(Stu_ID,Stu_Name,Stu_Nation,Stu_Sex,Stu_Birthday,Stu_Class,Stu_Password)values('"
					+ Jtf0.getText()
					+ "','"
					+ Jtf1.getText()
					+ "','"
					+ Jtf2.getText()
					+ "','"
					+ Jtf3.getText()
					+ "','"
					+ Jtf4.getText()
					+ "','"
					+ Jtf5.getText()
					+ "','"
					+ Jtf6.getText() + "')");

			JOptionPane.showMessageDialog(null, "已成功添加信息");
		}
		if (e.getSource() == Jb32) {// 添加学生成绩事件
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_cj ");
			db.add_update_delete("insert into Student_cj(Stu_ID,Stu_Name,Stu_Math,Stu_Java,Stu_Html,Stu_Ps)values('"
					+ Jtf0.getText()
					+ "','"
					+ Jtf1.getText()
					+ "','"
					+ Jtf2.getText()
					+ "','"
					+ Jtf3.getText()
					+ "','"
					+ Jtf4.getText() 
					+ "','" 
					+ Jtf5.getText() 
					+ "')");

			JOptionPane.showMessageDialog(null, "已成功添加成绩");
		}
		if (e.getSource() == Jb41) {// 删除学生信息事件
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_info ");
			db.add_update_delete("delete from Student_info where Stu_ID='"
					+ Jtf0.getText() + "' ");

			JOptionPane.showMessageDialog(null, "已成功删除信息");

		}
		if (e.getSource() == Jb42) { // 删除学生成绩事件
			TestDB db = new TestDB();
			ResultSet rs = db.query("Select * from Student_cj ");
			db.add_update_delete("delete from Student_cj where Stu_ID='"
					+ Jtf0.getText() + "' ");

			JOptionPane.showMessageDialog(null, "已成功删除成绩");

		}

		if (e.getSource() == Jb51) {// 清空文本框数据事件
			this.ClearTextField();
			JOptionPane.showMessageDialog(null, "重置成功");
		}

		if (e.getSource() == Jb52) {// 是否隐藏全部控件事件
			int a = JOptionPane.showConfirmDialog(null, "请问是否回到主界面？", "消息",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				this.Invisible(); // 隐藏控件
			}
		}

	}

}
