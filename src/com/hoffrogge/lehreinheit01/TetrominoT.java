package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class TetrominoT extends Tetrominu {

	private int xKoordinate, yKoordinate, gr��eX, gr��eY;

	public TetrominoT(int xKoordinate, int yKoordinate, int gr��eX, int gr��eY) {
		super(xKoordinate, yKoordinate, gr��eX, gr��eY);
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.gr��eX = gr��eX;
		this.gr��eY = gr��eY;

	}

	public void zeichnen(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, gr��eX, gr��eY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + gr��eX, yKoordinate + gr��eY, gr��eX, gr��eY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + gr��eX, yKoordinate, gr��eX, gr��eY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + gr��eX * 2, yKoordinate, gr��eX, gr��eY);
		rechteck4.zeichnen(graphics);
	}

	public void bewegeNachRechts() {

		xKoordinate += gr��eX;
	}

	public void bewegeNachLinks() {

		xKoordinate -= gr��eX;
	}
}
