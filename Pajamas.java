// Kathy Zeng
// 2/25/21
// Pajamas.java
// Desciption: This program creates my pajama.

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pajamas
{
	public static void main(String[] args) 
	{
		Pajamas p = new Pajamas();
		p.makeIt();
	}
	
	// Creates a panel for my pajama.
	public void makeIt()
	{
		JFrame frame = new JFrame("PajamasPanel");
		frame.setSize(600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 700);
		PajamasPanel panelToAdd = new PajamasPanel(); // Adds the object.
		frame.getContentPane().add(panelToAdd);
		frame.setVisible(true);
	}
}

class PajamasPanel extends JPanel
{
	public PajamasPanel()
	{
		setBackground(Color.ORANGE); // Sets background color as orange.
	}
	
	// In paintComponent method, it draws my drawing of my pajama.
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawGrid(g); 
		// Draws a polygon of my pajama.
		int[] arr1 = {50, 220, 300, 375, 535, 460, 400, 400, 220, 220, 120}; 
		int[] arr2 = {225, 50, 100, 50, 200, 300, 200, 650, 650, 200, 290}; 
		g.setColor(Color.GREEN); // Sets color for a pajama as green.
		g.fillPolygon(arr1, arr2, 11);
		g.setColor(Color.BLACK); // Sets color as black for drawing lines.
		// All points to draw lines.
		g.drawLine(50, 225, 220, 50);
		g.drawLine(220, 50, 300, 100);
		g.drawLine(300, 100, 375, 50);
		g.drawLine(375, 50, 535, 200);
		g.drawLine(535, 200, 460, 300);
		g.drawLine(460, 300, 400, 200);
		g.drawLine(400, 200, 400, 650);
		g.drawLine(400, 650, 220, 650);
		g.drawLine(220, 650, 220, 200);
		g.drawLine(220, 200, 120, 290);
		g.drawLine(120, 290, 50, 225);
		// Nested for loops are for designing my pajama design vertically and
		// hortizonally. In both loops, they both have pink as squares, yellow
		// as circles, and black as rectangles. Draw black lines to make each one as
		// squares. 
		for(int y = 150; y < 200; y += 50)
		{
			for(int x = 125; x < 475; x += 50)
			{
				g.setColor(Color.PINK);
				g.fillRect(x, y, 50, 50);
				g.setColor(Color.YELLOW);
				g.fillOval(x, y, 50, 50);
				g.setColor(Color.BLACK);
				g.fillRect(x + 15, y + 20, 20, 10);
				g.setColor(Color.BLACK);
				g.drawRect(x, y, 50, 50);
			}
		}
		for(int y = 100; y < 650; y += 50)
		{
			for(int x = 275; x < 325; x += 50)
			{
				g.setColor(Color.PINK); 
				g.fillRect(x, y, 50, 50);
				g.setColor(Color.YELLOW);
				g.fillOval(x, y, 50, 50);
				g.setColor(Color.BLACK);
				g.fillRect(x + 15, y + 20, 20, 10);
				g.setColor(Color.BLACK);
				g.drawRect(x, y, 50, 50);
			}
		}

	}
	
	// Draws a grid so you can see the picture coordinates easier.
	public void drawGrid(Graphics g)
	{
		g.setColor(Color.LIGHT_GRAY);
		for(int i = 0; i <= 640; i += 20)
		{
			g.drawLine(i, 0, i, 440);
		}
		for(int i = 0; i <= 440; i += 20)
		{
			g.drawLine(0, i, 640, i);
		}
	}
}
