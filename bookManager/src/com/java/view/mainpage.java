package com.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage extends JFrame {

	private JPanel contentPane;
  private JDesktopPane table=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainpage() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u57FA\u672C\u6570\u636E\u7EF4\u62A4");
		menu.setIcon(new ImageIcon(mainpage.class.getResource("/images/base.png")));
		menuBar.add(menu);
		
		JMenu menu_2 = new JMenu("\u56FE\u4E66\u7C7B\u5225\u7BA1\u7406");
		menu_2.setIcon(new ImageIcon(mainpage.class.getResource("/images/bookTypeManager.png")));
		menu.add(menu_2);
		
		JMenuItem menuItem_1 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookadd bookadd=new bookadd();
				bookadd.setVisible(true);
				table.add(bookadd);
			}
		});
		menuItem_1.setIcon(new ImageIcon(mainpage.class.getResource("/images/add.png")));
		menu_2.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u7EF4\u62A4");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookmanager bookmanager=new bookmanager();
				bookmanager.setVisible(true);
				table.add(bookmanager);
				
				
			}
		});
		menuItem_2.setIcon(new ImageIcon(mainpage.class.getResource("/images/modify.png")));
		menu_2.add(menuItem_2);
		
		JMenu mnNewMenu = new JMenu("\u56FE\u4E66\u7BA1\u7406");
		mnNewMenu.setIcon(new ImageIcon(mainpage.class.getResource("/images/bookManager.png")));
		menu.add(mnNewMenu);
		
		JMenuItem menuItem_3 = new JMenuItem("\u56FE\u4E66\u6DFB\u52A0");
		menuItem_3.setIcon(new ImageIcon(mainpage.class.getResource("/images/add.png")));
		mnNewMenu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u56FE\u4E66\u7EF4\u62A4");
		menuItem_4.setIcon(new ImageIcon(mainpage.class.getResource("/images/modify.png")));
		mnNewMenu.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "确认退出");
				if(a==0){dispose();}
			}
		});
		menuItem_5.setIcon(new ImageIcon(mainpage.class.getResource("/images/exit.png")));
		menu.add(menuItem_5);
		
		JMenu menu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menu_1.setIcon(new ImageIcon(mainpage.class.getResource("/images/about.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutour aboutour=new aboutour();
				aboutour.setVisible(true);
				table.add(aboutour);
				
				
			}
		});
		menuItem.setIcon(new ImageIcon(mainpage.class.getResource("/images/about.png")));
		menu_1.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table = new JDesktopPane();
		contentPane.add(table, BorderLayout.CENTER);
		//设置jf最大化
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
