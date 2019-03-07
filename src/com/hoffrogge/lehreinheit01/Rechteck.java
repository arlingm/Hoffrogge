package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;

	public Rechteck(int xKoordinate, int yKoordinate) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		/*
		 * Draws a line, using the current color, between the points (x1, y1) and (x2,
		 * y2) in this graphics context's coordinate system.
		 */

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 100, yKoordinate);
		graphics.drawLine(xKoordinate + 100, yKoordinate, xKoordinate + 100, yKoordinate + 100);
		graphics.drawLine(xKoordinate + 100, yKoordinate + 100, xKoordinate, yKoordinate + 100);
		graphics.drawLine(xKoordinate, yKoordinate + 100, xKoordinate, yKoordinate);
	}

}
