package com.lambdaexpression;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		//window :object JFrame
		JFrame frame=new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		
		//crete button and add jframe
		
		JButton button=new JButton("Click Me !!");
		
		
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Click");
//				JOptionPane.showMessageDialog(null,"Hey , button click");
//				
//			}
//		});
		
		
		
		button.addActionListener(e ->{
			System.out.println("Button Click");
			JOptionPane.showMessageDialog(null,"Hey , button click");
		});
			
	
				
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
