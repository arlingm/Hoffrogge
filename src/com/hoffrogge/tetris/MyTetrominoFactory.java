package com.hoffrogge.tetris;

import java.util.Random;

//gib der Klasse mit der Tastenkombination Alt+Shift+R einen Namen (MyTetrominoFactory markieren, dann die Tastenkombination)
public class MyTetrominoFactory implements TetrominoFactory {

	@Override
	public TetrominoTyp erstelleZufaelligenTetrominoTyp() {
		Random random = new Random();
		TetrominoJ j = new TetrominoJ(0, 0, 50, 50);
		int rand = random.nextInt(6);
		TetrominoTyp tetrominoTyp = TetrominoTyp.values()[rand];
		if (tetrominoTyp == null) {
			return TetrominoTyp.L;
		}
		return tetrominoTyp;
	}

	@Override
	public TetrominoSpielstein erstelleTetromino(TetrominoTyp tetrominoTyp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TetrominoSpielstein erstelleTetromino(TetrominoTyp typ, int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}