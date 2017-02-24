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
			firstName = "^([a-zA-Z]{2,30})";
			lastName = "^([a-zA-Z.-,']{2,30})";
					
		}
		
		public void start()
		{
			checkName("Aasdfghmlaokingumbheiumdhsoidk");
			checkName("12345");
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
