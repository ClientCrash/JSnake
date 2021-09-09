package com.clientcrash.jsnake;

import java.util.ArrayList;

public class Player {
	public ArrayList<Position2D> positions;
	int nextxadd = 1;
	int nextyadd=0;
	public Player() {
		positions = new ArrayList<Position2D>();
		positions.add(new Position2D(0, 0));
		positions.add(new Position2D(-1, 0));
		positions.add(new Position2D(-2, 0));
	}
	void setNextMove(int x,int y){
		nextxadd=x;
		nextyadd=y;
	}
	public void move() {
		
		
		
		for(int i =0; i<positions.size();i++) {
			if(i==0) {
				positions.set(0, new Position2D(positions.get(0).x+nextxadd,positions.get(0).y+nextyadd));
			}else {
				//shift all positions != 0 to the position "in front" of them
			positions.set(i, positions.get(i-1));
			}
		}
	}
}
