package com.clientcrash.jsnake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Snake");
		AdvacedPanel panel = new AdvacedPanel(new GameWindowStorage(40));
		frame.add(panel);
		frame.setBounds(0, 0, 800, 800);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		 frame.addKeyListener(new KeyListener() {
		        @Override
		        public void keyTyped(KeyEvent e) {
		        }

		        @Override
		        public void keyPressed(KeyEvent e) {
		            switch(e.getKeyChar()){
		            case('w'):
		            	KeyboardMoveTranslator.up(panel.player);
		            	break;
		            case('a'):

		            	KeyboardMoveTranslator.left(panel.player);
		            	break;
		            case('s'):

		            	KeyboardMoveTranslator.down(panel.player);
		            	break;
		            case('d'):

		            	KeyboardMoveTranslator.right(panel.player);
		            	break;
		            }
		        }

		        @Override
		        public void keyReleased(KeyEvent e) {
		        }
		    });
		
		
		
		
		frame.show();
		
	}

}
