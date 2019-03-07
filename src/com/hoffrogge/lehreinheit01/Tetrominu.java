package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Tetrominu {

	private int xKoordinate;
	private int yKoordinate;

	public Tetrominu(int K) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void quadratZeichnen(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + 100, yKoordinate + 100);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + 100, yKoordinate);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + 200, yKoordinate);
		rechteck4.zeichnen(graphics);
	}
}
