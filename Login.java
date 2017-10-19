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

		JLabel Jlb1 = new JLabel("�û����ͣ�      ");
		JLabel Jlb2 = new JLabel("�û�����");
		JLabel Jlb3 = new JLabel("��    �룺");

		Jrb1 = new JRadioButton("ѧ��");
		Jrb2 = new JRadioButton("��ʦ");

		ButtonGroup bg = new ButtonGroup();
		bg.add(Jrb1);
		bg.add(Jrb2);
		Jrb1.setSelected(true); // ���ð�ť�� ����Ĭ��ѡ�С�ѧ����

		Jtf = new JTextField();
		Jpf = new JPasswordField();

		Jtf.setColumns(12);
		Jpf.setColumns(12);

		Jb1 = new JButton("��  ¼");
		Jb1.addActionListener(this); // Ϊ��ť���ü����¼�
		Jb2 = new JButton("ȡ ��");
		Jb2.addActionListener(this); // Ϊ��ť���ü����¼�

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

		this.setTitle("ѧ������ϵͳ - ��¼����");
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
		// �õ��ı���/������ֵ
		if (e.getSource() == Jb1) { // �ж��������Ϣ�Ƿ�Ϊ��
			if (username.equals("") || password.equals("") || username == null
					|| password == null) { // ���Ϊ�յ�����ʾ��Ϣ������Ϊ�ı���/������ʼ��
				JOptionPane.showMessageDialog(null, "����ȷ�����û���/����");
				Jtf.setText("");
				Jpf.setText("");
			} else { // ����������ݿ������֤
				Verify();
			}
		}
		if (e.getSource() == Jb2) { // ͨ��ȡ����ť�ж��û��Ƿ��˳�
			int a = JOptionPane.showConfirmDialog(null, "�����Ƿ��˳�����", "��Ϣ",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) { // �˳� ����ϵͳ
				this.dispose();
			} else { // �����˳���Ϊ�ı���/������ʼ��
				Jtf.setText("");
				Jpf.setText("");
			}
		}
	}

	// public boolean getJRadioButtonValue(){
	// return Jrb1.isSelected();
	// }
	private void Verify() { // ��֤����
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
						JOptionPane.showMessageDialog(null, "��¼�ɹ�");
						this.dispose();
						new Studentmain();
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"��¼ʧ�ܣ�\n         ��������û���/����");
					Jtf.setText("");
					Jpf.setText("");
				}
			} else {
				if (rs2.next()) {
					if (rs2.getString("Teacher_Password").equals(password)) {
						JOptionPane.showMessageDialog(null, "��¼�ɹ���");
						this.dispose();
						new Teachermain();
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"��¼ʧ�ܣ�\n         ��������û���/����");
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