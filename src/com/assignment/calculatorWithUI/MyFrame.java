package com.assignment.calculatorWithUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyFrame extends Frame {
	
private TextField operend1Txt;
	
	private TextField operend2Txt;
	
	private Label answerLbl;
	
	public MyFrame() {
		setBounds(100,100,500,450);
		setTitle("Calculator Pro");
		setVisible(true);
		this.setLayout(null);
		
		answerLbl = new Label();
		answerLbl.setBounds(20,80,150,20);
		add(answerLbl);
	
		
		Label operend1Lbl = new Label("Number 1");
		operend1Lbl.setBounds(20,40,100,20);
		add(operend1Lbl);
		
		operend1Txt = new TextField();
		operend1Txt.setBounds(140,40,80,20);
		add(operend1Txt);
		
		
		Label operend2Lbl = new Label("Number 2");
		operend2Lbl.setBounds(240,40,100,20);
		add(operend2Lbl);
		
		operend2Txt = new TextField();
		operend2Txt.setBounds(360,40,80,20);
		add(operend2Txt);
		
		Button addButton = new Button("Add");
		addButton.setBounds(20,120,80,30);
		add(addButton);
		addButton.addActionListener(new ActionHandler(this));
		
		Button subtractButton = new Button("Subtract");
		subtractButton.setBounds(120,120,80,30);
		add(subtractButton);
		subtractButton.addActionListener(new ActionHandler(this));
		
		Button multiplyButton = new Button("Multiplication");
		multiplyButton.setBounds(220, 120, 100, 30);
		add(multiplyButton);
		multiplyButton.addActionListener(new ActionHandler(this));
		
		Button divideButton = new Button("Division");
		divideButton.setBounds(340, 120, 80, 30);
		add(divideButton);
		divideButton.addActionListener(new ActionHandler(this));
		
			
		// close the Calculator
		this.addWindowListener(new WindowAdapter() {
		 @Override
		public void windowClosing(WindowEvent e) {
			 MyFrame cf = (MyFrame)e.getSource();
			 cf.dispose();
		 }
		});
	}

	public TextField getOperend1Txt() {
		return operend1Txt;
	}

	public void setOperend1Txt(TextField operend1Txt) {
		this.operend1Txt = operend1Txt;
	}

	public TextField getOperend2Txt() {
		return operend2Txt;
	}

	public void setOperend2Txt(TextField operend2Txt) {
		this.operend2Txt = operend2Txt;
	}

	public Label getAnswerLbl() {
		return answerLbl;
	}

	public void setAnswerLbl(Label answerLbl) {
		this.answerLbl = answerLbl;
	}

}
