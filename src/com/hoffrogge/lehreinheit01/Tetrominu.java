package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Tetrominu {

	private int xKoordinate;
	private int yKoordinate;
	private int gr��eX;
	private int gr��eY;

	public Tetrominu(int xKoordinate, int yKoordinate, int gr��eX, int gr��eY) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.gr��eX = gr��eX;
		this.gr��eY = gr��eY;
	}

	public void tetrominoT(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, gr��eX, gr��eY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + gr��eX, yKoordinate + gr��eY, gr��eX, gr��eY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + gr��eX, yKoordinate, gr��eX, gr��eY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + gr��eX * 2, yKoordinate, gr��eX, gr��eY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoI(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, gr��eX, gr��eY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + gr��eX, yKoordinate, gr��eX, gr��eY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + gr��eX * 2, yKoordinate, gr��eX, gr��eY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + gr��eX * 3, yKoordinate, gr��eX, gr��eY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoO(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, gr��eX, gr��eY);
		rechteck.zeichnen(graphics);
		;

		Rechteck rechteck2 = new Rechteck(xKoordinate + gr��eX, yKoordinate, gr��eX, gr��eY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate, yKoordinate + gr��eY, gr��eX, gr��eY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + gr��eX, yKoordinate + gr��eY, gr��eX, gr��eY);
		rechteck4.zeichnen(graphics);
	}

	public void tetrominoJ(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, gr��eX, gr��eY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + gr��eX, yKoordinate, gr��eX, gr��eY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + gr��eX * 2, yKoordinate, gr��eX, gr��eY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + gr��eX * 2, yKoordinate + gr��eX, gr��eX, gr��eY);
		rechteck4.zeichnen(graphics);

	}
}
