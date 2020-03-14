package com.zwk.timetable;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Tests {
	public Tests(){
		Frame frame = new Frame("GridBag");
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		Panel pannel = new Panel(layout);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1.0;
		Button button1 = new Button("Button1");
		layout.setConstraints(button1, constraints);
		pannel.add(button1);
		Button button2 = new Button("Button2");
		layout.setConstraints(button2, constraints);
		pannel.add(button2);
		Button button3 = new Button("Button3");
		layout.setConstraints(button3, constraints);
		pannel.add(button3);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		Button button4 = new Button("Button4");
		layout.setConstraints(button4, constraints);
		pannel.add(button4);
		constraints.weightx=0;
		Button button5 = new Button("Button5");
		layout.setConstraints(button5, constraints);
		pannel.add(button5);
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		Button button6 = new Button("Button6");
		layout.setConstraints(button6, constraints);
		pannel.add(button6);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		Button button7 = new Button("Button7");
		layout.setConstraints(button7, constraints);
		pannel.add(button7);
		constraints.gridwidth=1;
		constraints.gridheight=2;
		constraints.weighty=1.0;
		Button button8 = new Button("Button8");
		layout.setConstraints(button8, constraints);
		pannel.add(button8);
		constraints.weighty=0;
		constraints.gridwidth=GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		Button button9 = new Button("Button9");
		layout.setConstraints(button9, constraints);
		pannel.add(button9);
		Button button10 = new Button("Button10");
		layout.setConstraints(button10, constraints);
		pannel.add(button10);
		frame.add(pannel);
		frame.pack();
		frame.show();
	}
}
