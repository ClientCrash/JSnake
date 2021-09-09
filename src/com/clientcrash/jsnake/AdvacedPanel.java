package com.clientcrash.jsnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AdvacedPanel extends JPanel{
	public GameWindowStorage wstore;
	public AdvacedPanel(GameWindowStorage storage) {
		this.wstore=storage;
	}
	int ticks = 0;
	long lasttime = 0;
	public Player player = new Player();
	private void update() {
		//TICK METHOD 10 TIMES A SECOND
		if(   ((System.nanoTime() - lasttime)/100000000)   >= 4) {
			tick();
			lasttime = System.nanoTime();
		}
		//OTHER UPDATE STUFF
		
		
	}
	
	private void tick() {
		ticks+=1;
		player.move();
	}
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		update();
		Graphics2D g2 = (Graphics2D) g;
		
		
		//Background
		g2.setColor(Color.DARK_GRAY);
		g2.fillRect(0, 0, getWidth(), getHeight());
		// Player
		for(Position2D pos : player.positions) {
			g2.setColor(Color.red);
			g2.fillRect(pos.getPosAsPixel("x",wstore.zoomlevel),pos.getPosAsPixel("y",wstore.zoomlevel) , wstore.zoomlevel, wstore.zoomlevel);
		}
		repaint();
	}
	
}
