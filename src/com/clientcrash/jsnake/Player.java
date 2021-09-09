package com.clientcrash.jsnake;

import java.util.ArrayList;

public class Player {
	public ArrayList<TailPiece> tail;
	int nextxadd = 1;
	int nextyadd=0;
	public Player() {
		tail = new ArrayList<TailPiece>();
		tail.add(new TailPiece(new Position2D(1, 1)));

		tail.add(new TailPiece(tail.get(0),new Position2D(2, 1)));
	}
	void setNextMove(int x,int y){
		nextxadd=x;
		nextyadd=y;
	}
	public void move() {
		
		
		
		for(int i =tail.size()-1; i>0;i--) {
			//TODO: work backwards through the tail and call the copy parrent function on every piece
			if(tail.get(i).ishead) {
				tail.get(i).pos = new Position2D(tail.get(i).pos.x+nextxadd, tail.get(i).pos.y+nextyadd);
				
				
			}else {

				tail.get(i).copyMasterPos();
			}
		}
	}
}
