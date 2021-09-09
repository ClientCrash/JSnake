package com.clientcrash.jsnake;

public class KeyboardMoveTranslator {
	static void up(Player p) {p.setNextMove(0, -1);};
	static void left(Player p) {p.setNextMove(-1, 0);};
	static void down(Player p) {p.setNextMove(0, 1);};
	static void right(Player p) {p.setNextMove(1, 0);};
	}
