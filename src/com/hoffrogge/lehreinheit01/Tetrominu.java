package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Tetrominu {

	private int xKoordinate;
	private int yKoordinate;
	private int größeX;
	private int größeY;

	public Tetrominu(int xKoordinate, int yKoordinate, int größeX, int größeY) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.größeX = größeX;
		this.größeY = größeY;
	}

	public void tetrominoT(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, größeX, größeY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + größeX, yKoordinate + größeY, größeX, größeY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + größeX, yKoordinate, größeX, größeY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + größeX * 2, yKoordinate, größeX, größeY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoI(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, größeX, größeY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + größeX, yKoordinate, größeX, größeY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + größeX * 2, yKoordinate, größeX, größeY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + größeX * 3, yKoordinate, größeX, größeY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoO(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, größeX, größeY);
		rechteck.zeichnen(graphics);
		;

		Rechteck rechteck2 = new Rechteck(xKoordinate + größeX, yKoordinate, größeX, größeY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate, yKoordinate + größeY, größeX, größeY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + größeX, yKoordinate + größeY, größeX, größeY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoJ(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, größeX, größeY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + größeX, yKoordinate, größeX, größeY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + größeX * 2, yKoordinate, größeX, größeY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + größeX * 2, yKoordinate + größeX, größeX, größeY);
		rechteck4.zeichnen(graphics);

	}
}
