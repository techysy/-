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
	// new Studentmain(); // ����ר��
	}

	public Studentmain() { // ���췽��

		JMenuBar Jmb = new JMenuBar();

		JMenu Jm1 = new JMenu("�ļ�");
		JMenu Jm2 = new JMenu("��ѯ");
		JMenu Jm3 = new JMenu("�޸�");
		JMenu Jm4 = new JMenu("����");

		Jm11 = new JMenuItem("����");
		Jm11.addActionListener(this);
		Jm12 = new JMenuItem("�˳�");
		Jm12.addActionListener(this);
		Jm21 = new JMenuItem("��ѯѧ����Ϣ");
		Jm21.addActionListener(this);
		Jm22 = new JMenuItem("��ѯѧ���ɼ�");
		Jm22.addActionListener(this);
		Jm31 = new JMenuItem("�޸�ѧ������");
		Jm31.addActionListener(this);
		Jm41 = new JMenuItem("�����ĵ�");
		Jm41.addActionListener(this);
		Jm42 = new JMenuItem("�������");
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

		Title = new JLabel("����");

		Jlb0 = new JLabel("��ǩ");
		Jtf0 = new JTextField(10);

		Jb0 = new JButton("��ť1");
		Jb0.addActionListener(this);
		Jb1 = new JButton("��ť2");
		Jb1.addActionListener(this);
		Jb2 = new JButton("��ť3");
		Jb2.addActionListener(this);


		Jlb0 = new JLabel("��ǩ0");
		Jlb1 = new JLabel("��ǩ1");
		Jlb2 = new JLabel("��ǩ2");
		Jlb3 = new JLabel("��ǩ3");
		Jlb4 = new JLabel("��ǩ4");
		Jlb5 = new JLabel("��ǩ5");
		Jlb6 = new JLabel("��ǩ6");

		Jtf0 = new JTextField(10);
		Jtf1 = new JTextField(10);
		Jtf2 = new JTextField(10);
		Jtf3 = new JTextField(10);
		Jtf4 = new JTextField(10);
		Jtf5 = new JTextField(10);
		Jtf6 = new JTextField(10);

		Jb0.setText("��  ��");
		Jb1.setText("��  ��");
		Jb2.setText("��  ��");

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

		this.setTitle("ѧ������ϵͳ - ѧ����");
		this.setBounds(400, 200, 640, 480);
		this.setJMenuBar(Jmb);
		this.setLayout(new GridLayout(9, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void ClearTextField() { // ����ı�������
		Jtf0.setText("");
		Jtf1.setText("");
		Jtf2.setText("");
		Jtf3.setText("");
		Jtf4.setText("");
		Jtf5.setText("");
		Jtf6.setText("");
	}

	public void Invisible() { // ��������JPanel
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

	public void visibleJPanel() { // ��ʾJp8��9��������JPanel
		Jp1.setVisible(true);
		Jp2.setVisible(true);
		Jp3.setVisible(true);
		Jp4.setVisible(true);
		Jp5.setVisible(true);
		Jp6.setVisible(true);
		Jp7.setVisible(true);
	}

	public void addJPanel() {// ��ӿؼ���JPanel
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

	public void xsxx() {// ����ѧ����Ϣ��ر�ǩ
		Jlb0.setText("ѧ�ţ�    ");
		Jlb0.setToolTipText("������ѧ��!");
		Jlb1.setText("������    ");
		Jlb2.setText("���壺    ");
		Jlb3.setText("�Ա�    ");
		Jlb4.setText("���գ�    ");
		Jlb5.setText("�༶��    ");
		Jlb6.setText("���룺    ");
		Jp9.setVisible(false); // ����Jp9
		Jtf0.setEnabled(false);
		Jtf1.setEnabled(false);
		Jtf2.setEnabled(false);
		Jtf3.setEnabled(false);
		Jtf4.setEnabled(false);
		Jtf5.setEnabled(false);
	}

	public void xscj() { // ����ѧ���ɼ���ر�ǩ
		Jlb0.setText("ѧ�ţ�    ");
		Jlb0.setToolTipText("ѧ��!");
		Jlb1.setText("������    ");
		Jlb2.setText("������    ");
		Jlb3.setText("Java��    ");
		Jlb4.setText("Html��    ");
		Jlb5.setText("  P S ��    ");
		Jp8.setVisible(false);// ����Jp8
		Jp9.setVisible(false); // ����Jp9
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
				
				JOptionPane.showMessageDialog(null, "��ѯ��Ϣ�ɹ�");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// ͨ����ͬ�Ӳ˵�����ʾ�ؼ�
		if (e.getSource() == Jm11) { // ��ת����½����
			int a = JOptionPane.showConfirmDialog(null, "�����Ƿ񷵻ص�½���棿", "��Ϣ",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				this.dispose();
				new Login();
			}
		}

		if (e.getSource() == Jm12) {
			int a = JOptionPane.showConfirmDialog(null, "�����Ƿ��˳�����", "��Ϣ",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) { // �˳� ����ϵͳ
				this.dispose();
			}
		}

		if (e.getSource() == Jm21) {
			Title.setText("��ѯѧ����Ϣ");
			Jp8.setVisible(false);
			this.xsxx();// ����ѧ����Ϣ��ǩ
			this.ClearTextField(); // ����ı�������
			this.visibleJPanel(); // ��ʾJp8��9��������JPanel
			this.addJPanel();// ��ӿؼ���JPanel
			
			this.dbf();//��ȡѧ����Ϣ����ֵ���ı���
		}

		if (e.getSource() == Jm22) {
			Title.setText("��ѯѧ���ɼ�");
			this.xscj();// ����ѧ���ɼ���ǩ
			this.ClearTextField(); // ����ı�������
			this.visibleJPanel(); // ��ʾJp8��9��������JPanel
			this.addJPanel();// ��ӿؼ���JPanel

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
					JOptionPane.showMessageDialog(null, "��ѯ�ɼ��ɹ�");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == Jm31) {
			Title.setText("�޸�ѧ������");

			

			this.xsxx();// ����ѧ����Ϣ��ǩ
			Jp8.setVisible(true); // ��ʾJp8
			Jp9.setVisible(true); // ��ʾJp9
			this.ClearTextField(); // ����ı�������
			this.visibleJPanel(); // ��ʾJp9��������JPanel
			this.addJPanel();// ��ӿؼ���JPanel
			this.dbf();//��ȡѧ����Ϣ����ֵ���ı���
		}
		if (e.getSource() == Jm42) {
			JOptionPane
					.showMessageDialog(null,
							"            ѧ������ϵͳ-ѧ����\n            �汾��V1.0.1\n            ���ߣ���ʦ��");
		}
		if (e.getSource() == Jb0) {// �޸�ѧ����Ϣ�¼�
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

			JOptionPane.showMessageDialog(null, "�ѳɹ��޸���Ϣ");
		}

		if (e.getSource() == Jb2) {// �Ƿ�����ȫ���ؼ��¼�
			int a = JOptionPane.showConfirmDialog(null, "�����Ƿ�ص������棿", "��Ϣ",
					JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				this.Invisible(); // ���ؿؼ�
			}
		}

	}

}
