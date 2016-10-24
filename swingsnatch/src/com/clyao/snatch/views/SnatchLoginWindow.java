package com.clyao.snatch.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import com.clyao.snatch.mian.SnatchMain;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author clyao
 * @version 1.0v
 * @time 2016-10-21 15:00
 * @description 登陆窗口
 */
public class SnatchLoginWindow extends JFrame {

	private static final long serialVersionUID = 5861092169903097267L;
	private JPanel contentPane;
	private ImagebgJPanel toppanel;
	private JPanel loginpanel;
	private JLabel usernamelbl;
	private JLabel passwordlbl;
	private JTextField usernametf;
	private JPasswordField passwordpf;
	private JCheckBox autologinchckbx;
	private JCheckBox rememberpwchckbx;
	private JButton loginbtn;
	private JLabel registerlbl;
	private JLabel rpasswordlbl;

	public SnatchLoginWindow() {
		setTitle("登陆");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 320);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		toppanel = new ImagebgJPanel(getClass().getResourceAsStream("/images/login/top.9.png"));
		toppanel.setBorder(null);
		toppanel.setPreferredSize(new Dimension(400, 120));
		contentPane.add(toppanel, BorderLayout.NORTH);
		
		loginpanel = new JPanel();
		loginpanel.setBorder(null);
		contentPane.add(loginpanel, BorderLayout.CENTER);
		loginpanel.setLayout(null);
		
		usernamelbl = new JLabel();
		usernamelbl.setBounds(60, 20, 16, 16);
		usernamelbl.setIcon(new ImageIcon(getClass().getResource("/images/login/username.png")));
		loginpanel.add(usernamelbl);
		
		passwordlbl = new JLabel();
		passwordlbl.setBounds(60, 55, 16, 16);
		passwordlbl.setIcon(new ImageIcon(getClass().getResource("/images/login/password.png")));
		loginpanel.add(passwordlbl);
		
		registerlbl = new JLabel("免费注册");
		registerlbl.setBounds(290, 20, 55, 16);
		registerlbl.setForeground(new Color(30, 130, 189, 255));
		loginpanel.add(registerlbl);
		
		rpasswordlbl = new JLabel("找回密码");
		rpasswordlbl.setBounds(290, 55, 55, 16);
		loginpanel.add(rpasswordlbl);
		
		usernametf = new JTextField();
		usernametf.setBounds(85, 18, 200, 20);
		loginpanel.add(usernametf);
		usernametf.setColumns(10);
		
		passwordpf = new JPasswordField();
		passwordpf.setBounds(85, 53, 200, 20);
		loginpanel.add(passwordpf);
		
		autologinchckbx = new JCheckBox("自动登陆");
		autologinchckbx.setBorder(null);
		autologinchckbx.setAlignmentX(Component.CENTER_ALIGNMENT);
		autologinchckbx.setBounds(85, 80, 90, 23);
		loginpanel.add(autologinchckbx);
		
		rememberpwchckbx = new JCheckBox("记住密码");
		rememberpwchckbx.setBorder(null);
		rememberpwchckbx.setAlignmentX(Component.CENTER_ALIGNMENT);
		rememberpwchckbx.setHorizontalAlignment(SwingConstants.TRAILING);
		rememberpwchckbx.setBounds(195, 80, 90, 23);
		loginpanel.add(rememberpwchckbx);
		
		loginbtn = new JButton("登陆");
		loginbtn.setFocusPainted(false);
		loginbtn.setBounds(85, 120, 200, 25);
		loginbtn.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		loginpanel.add(loginbtn);
		loginbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SnatchMainWindow frame = new SnatchMainWindow();
				frame.setVisible(true);
				SnatchMain.frame.setVisible(false);
			}
		});
	}
	
}
