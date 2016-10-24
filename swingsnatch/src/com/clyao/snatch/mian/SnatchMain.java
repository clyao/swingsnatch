package com.clyao.snatch.mian;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.plaf.InsetsUIResource;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import com.clyao.snatch.views.SnatchLoginWindow;

/**
 * @author clyao
 * @version 1.0v
 * @time 2016-10-21 15:00
 * @description 程序主入口
 */
public class SnatchMain {
	
	public static SnatchLoginWindow frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.setProperty("sun.java2d.noddraw", "true");
					BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
					BeautyEyeLNFHelper.launchBeautyEyeLNF();
					UIManager.put("RootPane.setupButtonVisible", false);
					UIManager.put("TabbedPane.tabAreaInsets", new InsetsUIResource(0,0,0,0));
					frame = new SnatchLoginWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
