package com.clientcrash.jsnake;

public class TailPiece {
	public TailPiece master;
	public Position2D pos;
	public boolean ishead = false;
	public TailPiece(TailPiece master,Position2D pos) {
		this.master = master;
		this.pos = pos;
	}
	public TailPiece(Position2D pos) {
		this.ishead = true;
		this.pos=pos;
	}
	public void copyMasterPos() {
		this.pos = master.pos;
	}

}
