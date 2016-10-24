package com.clyao.snatch.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;

import javax.swing.JRadioButtonMenuItem;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 * @author clyao
 * @version 1.0v
 * @time 2016-10-22 15:00
 * @description 程序主界面
 */
public class SnatchMainWindow extends JFrame {

	private static final long serialVersionUID = -1874397818734642058L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu filemn;
	private JMenuItem openmItem;
	private JMenuItem savemItem;
	private JMenuItem exitmItem;
	private JToolBar toolBar;
	private JPanel memupanel;
	private JButton newgroupsbtn;
	private JMenu stylemn;
	private JMenu helpmn;
	private JRadioButtonMenuItem oceanrdbtnmntm;
	private JRadioButtonMenuItem sapphirerdbtnmntm;
	private JMenuItem bbsmItem;
	private JMenuItem websitemItem;
	private JMenuItem updatemItem;
	private JMenuItem aboutmItem;
	private JPanel contentpanel;
	private JMenuItem usermanagermntm;
	private JMenuItem remotemanagermItem;
	private JMenuItem starttaskmItem;
	private JMenuItem stoptaskmItem;
	private JMenu toolsmn;
	private JRadioButtonMenuItem rubyradioButton;
	private JButton newtaskbtn;
	private JButton webconfigbtn;
	private JButton webmodulebtn;
	private JPanel snatchpanel;
	private JPanel settingpanel;
	private JButton starttaskbtn;
	private JButton stoptaskbtn;
	private JButton scheduletaskbtn;
	private JSplitPane splitPane;
	private JTree tree;
	private JTabbedPane tabbedPane;
	private JPanel operationpanel;
	private JScrollPane scrollPane;
	private JTable table;
	private ImagebgJPanel welcomepanel;
	private JLabel lblNewLabel;
	private CardLayout cardLayout;

	
	public SnatchMainWindow() {
		setTitle("采集器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 567);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memupanel = new JPanel();
		memupanel.setBorder(null);
		contentPane.add(memupanel, BorderLayout.NORTH);
		memupanel.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		memupanel.add(menuBar, BorderLayout.NORTH);
		
		filemn = new JMenu("文件");
		menuBar.add(filemn);
		
		openmItem = new JMenuItem("打开");
		filemn.add(openmItem);
		
		savemItem = new JMenuItem("保存");
		filemn.add(savemItem);
		filemn.addSeparator();
		
		exitmItem = new JMenuItem("退出");
		filemn.add(exitmItem);
		
		toolsmn = new JMenu("工具");
		menuBar.add(toolsmn);
		
		starttaskmItem = new JMenuItem("开始任务");
		toolsmn.add(starttaskmItem);
		
		stoptaskmItem = new JMenuItem("停止任务");
		toolsmn.add(stoptaskmItem);
		toolsmn.addSeparator();
		
		usermanagermntm = new JMenuItem("用户管理");
		toolsmn.add(usermanagermntm);
		
		remotemanagermItem = new JMenuItem("远程管理");
		toolsmn.add(remotemanagermItem);
		
		stylemn = new JMenu("风格");
		menuBar.add(stylemn);
		
		oceanrdbtnmntm = new JRadioButtonMenuItem("海洋");
		stylemn.add(oceanrdbtnmntm);
		
		rubyradioButton = new JRadioButtonMenuItem("红宝石");
		stylemn.add(rubyradioButton);
		
		sapphirerdbtnmntm = new JRadioButtonMenuItem("蓝宝石");
		stylemn.add(sapphirerdbtnmntm);
		
		helpmn = new JMenu("帮助");
		menuBar.add(helpmn);
		
		bbsmItem = new JMenuItem("访问论坛");
		helpmn.add(bbsmItem);
		
		websitemItem = new JMenuItem("访问主站");
		helpmn.add(websitemItem);
		
		updatemItem = new JMenuItem("检查更新");
		helpmn.add(updatemItem);
		helpmn.addSeparator();
		
		aboutmItem = new JMenuItem("关于我们");
		helpmn.add(aboutmItem);
		
		toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		memupanel.add(toolBar, BorderLayout.CENTER);
		toolBar.addSeparator();
		
		starttaskbtn = new JButton("开始任务");
		starttaskbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		starttaskbtn.setVerticalTextPosition(JButton.BOTTOM);
		starttaskbtn.setHorizontalTextPosition(JButton.CENTER);
		starttaskbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/starttask.png")));
		toolBar.add(starttaskbtn);
		
		stoptaskbtn = new JButton("停止任务");
		stoptaskbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		stoptaskbtn.setVerticalTextPosition(JButton.BOTTOM);
		stoptaskbtn.setHorizontalTextPosition(JButton.CENTER);
		stoptaskbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/stoptask.png")));
		toolBar.add(stoptaskbtn);
		
		scheduletaskbtn = new JButton("计划任务");
		scheduletaskbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		scheduletaskbtn.setVerticalTextPosition(JButton.BOTTOM);
		scheduletaskbtn.setHorizontalTextPosition(JButton.CENTER);
		scheduletaskbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/scheduletask.png")));
		toolBar.add(scheduletaskbtn);
		toolBar.addSeparator();
		
		newgroupsbtn = new JButton("新建分组");
		newgroupsbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		newgroupsbtn.setVerticalTextPosition(JButton.BOTTOM);
		newgroupsbtn.setHorizontalTextPosition(JButton.CENTER);
		newgroupsbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/newgroups.png")));
		toolBar.add(newgroupsbtn);
		
		newtaskbtn = new JButton("新建任务");
		newtaskbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		newtaskbtn.setVerticalTextPosition(JButton.BOTTOM);
		newtaskbtn.setHorizontalTextPosition(JButton.CENTER);
		newtaskbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/newtask.png")));
		toolBar.add(newtaskbtn);
		toolBar.addSeparator();
		
		webconfigbtn = new JButton("Web发布配置");
		webconfigbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		webconfigbtn.setVerticalTextPosition(JButton.BOTTOM);
		webconfigbtn.setHorizontalTextPosition(JButton.CENTER);
		webconfigbtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/webconfig.png")));
		toolBar.add(webconfigbtn);
		
		webmodulebtn = new JButton("Web发布模块");
		webmodulebtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		webmodulebtn.setVerticalTextPosition(JButton.BOTTOM);
		webmodulebtn.setHorizontalTextPosition(JButton.CENTER);
		webmodulebtn.setIcon(new ImageIcon(getClass().getResource("/images/snatch/webmodule.png")));
		toolBar.add(webmodulebtn);
		toolBar.addSeparator();
		
		contentpanel = new JPanel();
		cardLayout = new CardLayout(0, 0);
		contentpanel.setBorder(null);
		contentPane.add(contentpanel, BorderLayout.CENTER);
		contentpanel.setLayout(cardLayout);
		
		snatchpanel = new JPanel();
		snatchpanel.setBorder(null);
		contentpanel.add(snatchpanel, "snatchpanel");
		snatchpanel.setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		snatchpanel.add(splitPane);
		
		tree = new JTree();
		tree.setPreferredSize(new Dimension(150, 64));
		splitPane.setLeftComponent(tree);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane.setRightComponent(tabbedPane);
		
		welcomepanel = new ImagebgJPanel(getClass().getResourceAsStream("/images/snatch/home.9.png"));
		tabbedPane.addTab("欢迎页", new ImageIcon(getClass().getResource("/images/snatch/welcome.png")), welcomepanel, null);
		
		operationpanel = new JPanel();
		tabbedPane.addTab("运行管理", new ImageIcon(getClass().getResource("/images/snatch/operation.png")), operationpanel, null);
		operationpanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		operationpanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u6807\u9898\u4E00", "\u6807\u9898\u4E8C", "\u6807\u9898\u4E09", "\u6807\u9898\u56DB", "\u6807\u9898\u4E94"
			}
		));
		scrollPane.setViewportView(table);
		
		settingpanel = new JPanel();
		contentpanel.add(settingpanel, "settingpanel");
		
		lblNewLabel = new JLabel("New label");
		settingpanel.add(lblNewLabel);
	}
}
