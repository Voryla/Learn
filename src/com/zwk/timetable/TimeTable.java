package com.zwk.timetable;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TimeTable extends JFrame {
	public TimeTable(){
		this.setBounds((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()-700,0,700,800);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//	this.setUndecorated(true);
		addTimeTable();
		this.setVisible(true);
	}
	private void addTimeTable(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		JPanel jPanel=new JPanel();
		jPanel.setBounds(01,-10,this.getWidth(),this.getHeight());
		jPanel.setLayout(gridBagLayout);
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		JButton button1=new JButton("b1");
		gridBagLayout.setConstraints(button1,constraints);
		jPanel.add(button1);
		JButton button2=new JButton("b2");
		gridBagLayout.setConstraints(button2,constraints);
		jPanel.add(button2);
		constraints.gridwidth=GridBagConstraints.REMAINDER;
		JButton button5=new JButton("b5");
		constraints.weightx=0;
		gridBagLayout.setConstraints(button5,constraints);
		jPanel.add(button5);
		JButton button6=new JButton("b5");
		constraints.weightx=0;
		gridBagLayout.setConstraints(button6,constraints);
		jPanel.add(button6);
		JButton button7=new JButton("b5");
		constraints.weightx=0;
		gridBagLayout.setConstraints(button7,constraints);
		jPanel.add(button7);
		constraints.anchor=GridBagConstraints.NORTHWEST;
		JButton button8=new JButton("b5");
		constraints.weightx=0;
		gridBagLayout.setConstraints(button8,constraints);
		jPanel.add(button8);
		this.add(jPanel);
	}
}
