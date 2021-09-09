package com.clientcrash.jsnake;

public class Position2D {
	int x;
	int y;
	public Position2D(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getPosAsPixel(String pos,int zlevel) {
		if(pos=="x") {return x*zlevel;}
		if(pos=="y") {return y*zlevel;}
		return -1;
	}
}
