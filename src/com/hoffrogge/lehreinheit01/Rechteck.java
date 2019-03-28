package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;
	private int gr��eX;
	private int gr��eY;

	public Rechteck(int xKoordinate, int yKoordinate, int gr��eX, int gr��eY) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.gr��eX = gr��eX;
		this.gr��eY = gr��eY;
	}

	public void zeichnen(Graphics graphics) {

		/*
		 * Draws a line, using the current color, between the points (x1, y1) and (x2,
		 * y2) in this graphics context's coordinate system.
		 */

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + gr��eX, yKoordinate);
		graphics.drawLine(xKoordinate + gr��eX, yKoordinate, xKoordinate + gr��eX, yKoordinate + gr��eY);
		graphics.drawLine(xKoordinate + gr��eX, yKoordinate + gr��eY, xKoordinate, yKoordinate + gr��eY);
		graphics.drawLine(xKoordinate, yKoordinate + gr��eY, xKoordinate, yKoordinate);
		// graphics.fillRect(xKoordinate, yKoordinate, gr��eX, gr��eY);
	}

}
