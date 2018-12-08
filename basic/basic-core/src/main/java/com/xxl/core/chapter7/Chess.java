package com.xxl.core.chapter7;

import static com.xxl.util.Print.print;

class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess chess = new Chess();
	}
}
