package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

/*
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * @formatter:off
 *  
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 *  
 * @formater:on 
 */
public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Tetrominu tetrominu = new Tetrominu(0, 0, 50, 50);
		tetrominu.tetrominoT(graphics);
		Tetrominu tetrominu2 = new Tetrominu(200, 0, 50, 50);
		tetrominu2.tetrominoO(graphics);
		Tetrominu tetrominu3 = new Tetrominu(400, 400, 50, 50);
		tetrominu3.tetrominoI(graphics);
		Tetrominu tetrominu4 = new Tetrominu(200, 200, 50, 50);
		tetrominu4.tetrominoJ(graphics);

		// zeichnet ein Dreieck
		// new Dreieck(200, 200).zeichnen(graphics);

		// zeichnet ein gleichseitiges Dreieck
		// new GleichseitigesDreieck(300, 300).zeichnen(graphics);
	}
}
