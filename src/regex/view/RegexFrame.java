package regex.view;

import javax.swing.JFrame;

import regex.controller.RegexController;

import java.awt.Color;

import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new RegexPanel(baseController);
		
		setupFrame(500,500);
		setupListeners();
	}
	
	private void setupFrame(int width, int height)
	{
		this.setContentPane(appPanel);
		this.setTitle("Base Frame");
		this.setSize(new Dimension(width, height));
		this.setVisible(true);
		this.setBackground(Color.GREEN);
	}
	
	private void setupListeners()
	{
		this.addWindowListener(new java.awt.event.WindowAdapter()
		{
			
		@Override
		public void windowClosing(java.awt.event.WindowEvent windowEvent)
		{
			System.exit(0);
		}
				
			
				
		});
	}
}