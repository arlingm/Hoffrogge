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

		Tetrominu tetrominu = new Tetrominu(100, 100);
		tetrominu.quadratZeichnen(graphics);

	}
}