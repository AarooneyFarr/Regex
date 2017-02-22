package regex.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import regex.controller.RegexController;
import regex.model.*;

public class RegexPanel extends JPanel
	{
		private JTextField nameField;
		private JTextField lastNameField;
		private JTextField phoneField;
		private JTextField emailField;
		private JLabel nameLabel;
		private JLabel lastNameLabel;
		private JLabel phoneLabel;
		private JLabel emailLabel;
		private JButton submitButton;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;

		public RegexPanel(RegexController baseController)
			{
				firstName = "";
				lastName = "";
				email = "";
				phoneNumber = "";
				
				nameField = new JTextField();
				lastNameField = new JTextField();
				phoneField = new JTextField();
				emailField = new JTextField();

				nameLabel = new JLabel("First Name: ");
				lastNameLabel = new JLabel("Last Name: ");
				phoneLabel = new JLabel("Phone number: ");
				emailLabel = new JLabel("Email: ");

				submitButton = new JButton("Enter");

				setupPanel();
				setupLayout();
				setupListeners();
			}

		public void setupPanel()
			{
				setLayout(null);
				this.add(emailField);
				this.add(emailLabel);
				this.add(lastNameField);
				this.add(lastNameLabel);
				this.add(nameField);
				this.add(nameLabel);
				this.add(phoneField);
				this.add(phoneLabel);
				this.add(submitButton);

			}

		public void setupLayout()
			{
				this.setBackground(Color.GREEN);

				nameField.setBounds(135, 41, 129, 23);
				lastNameField.setBounds(135, 105, 129, 23);
				phoneField.setBounds(135, 169, 129, 23);
				emailField.setBounds(95, 233, 169, 23);
				nameLabel.setBounds(25, 41, 98, 23);
				lastNameLabel.setBounds(25, 105, 98, 23);
				phoneLabel.setBounds(25, 169, 98, 23);
				emailLabel.setBounds(25, 233, 98, 23);
				submitButton.setBounds(299, 41, 98, 215);

			}

		public void setupListeners()
			{
				nameField.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								firstName = nameField.getText();
							}
					});
				lastNameField.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								lastName = lastNameField.getText();
							}
					});
				phoneField.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								phoneNumber = phoneField.getText();
							}
					});
				emailField.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								email = emailField.getText();
							}
					});
				submitButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								firstName = nameField.getText();
								lastName = lastNameField.getText();
								phoneNumber = phoneField.getText();
								email = emailField.getText();

							}
					});
			}

		
		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public String getPhoneNumber()
			{
				return phoneNumber;
			}

		public void setPhoneNumber(String phoneNumber)
			{
				this.phoneNumber = phoneNumber;
			}

		public String getEmail()
			{
				return email;
			}

		public void setEmail(String email)
			{
				this.email = email;
			}

		
		
	}
