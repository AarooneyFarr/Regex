package regex.controller;

import regex.view.*;
import java.util.regex.*;

import javax.swing.JOptionPane;


public class RegexController
	{
		private RegexPanel appPanel;
		private RegexFrame appFrame;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		
		
		public RegexController()
		{
			appFrame = new RegexFrame(this);
			appPanel = new RegexPanel(this);
			firstName = "(\\S)({2,20})";
			
		}
		
		public void start()
		{
			
		}
		
		public void checkName(String name)
		{
			if(name.matches(firstName))
				{
					JOptionPane.showMessageDialog(appFrame, "This is a valid name");
				}
			else
				{
					JOptionPane.showMessageDialog(appFrame, "This is an invalid name");

				}
		}
	}
