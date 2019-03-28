package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;
	private int größeX;
	private int größeY;

	public Rechteck(int xKoordinate, int yKoordinate, int größeX, int größeY) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.größeX = größeX;
		this.größeY = größeY;
	}

	public void zeichnen(Graphics graphics) {

		/*
		 * Draws a line, using the current color, between the points (x1, y1) and (x2,
		 * y2) in this graphics context's coordinate system.
		 */

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + größeX, yKoordinate);
		graphics.drawLine(xKoordinate + größeX, yKoordinate, xKoordinate + größeX, yKoordinate + größeY);
		graphics.drawLine(xKoordinate + größeX, yKoordinate + größeY, xKoordinate, yKoordinate + größeY);
		graphics.drawLine(xKoordinate, yKoordinate + größeY, xKoordinate, yKoordinate);
		// graphics.fillRect(xKoordinate, yKoordinate, größeX, größeY);
	}

}
