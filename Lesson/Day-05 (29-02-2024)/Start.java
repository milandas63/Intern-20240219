package com.cal.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start {

	public static void main(String[] args) {
		JFrame f = new JFrame("Calendar");

		f.setLayout(new BorderLayout());
			JLabel lblMonthYear = new JLabel("FEBRUARY 2024", JLabel.CENTER);
			f.add(lblMonthYear, BorderLayout.NORTH);
			lblMonthYear.setFont(new Font("Arial",Font.BOLD,24));
			lblMonthYear.setForeground(Color.blue);
			lblMonthYear.setBackground(Color.lightGray);
			lblMonthYear.setBorder(BorderFactory.createRaisedBevelBorder());
			lblMonthYear.setOpaque(true);

			JPanel pnlBody = new JPanel(new GridLayout(6,7));
			f.add(pnlBody, BorderLayout.CENTER);
			String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
			JButton btnDummy;
			for(int i=0; i<days.length; i++) {
				btnDummy = new JButton(days[i]);
				btnDummy.setForeground(Color.black);
				btnDummy.setBorder(BorderFactory.createRaisedBevelBorder());
				pnlBody.add(btnDummy);
			}
			for(int i=1; i<=29; i++) {
				btnDummy = new JButton(String.valueOf(i));
				btnDummy.setBackground(Color.white);
				pnlBody.add(btnDummy);
			}
			btnDummy = new JButton("");
			pnlBody.add(btnDummy);
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(200, 200, 500, 400);
		f.setVisible(true);
	}

}
