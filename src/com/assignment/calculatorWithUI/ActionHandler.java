package com.assignment.calculatorWithUI;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	MyFrame cf ;
	public ActionHandler(MyFrame myFrame) {
		this.cf = myFrame;
	}

	public void actionPerformed(ActionEvent e) {

		
		int a = Integer.parseInt(cf.getOperend1Txt().getText());
		int b = Integer.parseInt(cf.getOperend2Txt().getText());
		int result;
		if(e.getActionCommand().equalsIgnoreCase("Add")) {
			
			result = a+b;
			cf.getAnswerLbl().setText("Answer = "+ result);
			
		}else if(e.getActionCommand().equalsIgnoreCase("Subtract")) {
			
			result = a-b;
			cf.getAnswerLbl().setText("Answer = "+ result);
		}else if(e.getActionCommand().equalsIgnoreCase("Multiplication")) {
			
			result = a*b;
			cf.getAnswerLbl().setText("Answer = "+ result);
		}else if(e.getActionCommand().equalsIgnoreCase("Division")) {
			
			result = a/b;
			cf.getAnswerLbl().setText("Answer = "+ result);
		}
	}


}
