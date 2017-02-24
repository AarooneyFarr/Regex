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
			firstName = "[a-zA-Z]{2,30}";
			lastName = "[a-zA-Z.-,']{2,40}";
			phoneNumber = "[0-9-]{7,16}";
			email = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
					
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
		
		public void checkLastName(String name)
			{
				if(name.matches(lastName))
					{
						JOptionPane.showMessageDialog(appFrame, "This is a valid name");
					}
				else
					{
						JOptionPane.showMessageDialog(appFrame, "This is an invalid name");

					}
			}
		
		public void checkPhone(String phone)
			{
				if(phone.matches(phoneNumber))
					{
						JOptionPane.showMessageDialog(appFrame, "This is a valid phone number");
					}
				else
					{
						JOptionPane.showMessageDialog(appFrame, "This is an invalid phone number");

					}
			}
		
		public void checkEmail(String input)
			{
				if(input.matches(email))
					{
						JOptionPane.showMessageDialog(appFrame, "This is a valid email");
					}
				else
					{
						JOptionPane.showMessageDialog(appFrame, "This is an invalid email");

					}
			}
	}
