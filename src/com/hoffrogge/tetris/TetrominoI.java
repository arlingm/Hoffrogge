package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;
import com.hoffrogge.lehreinheit01.Tetrominu;

public class TetrominoI extends Tetrominu {

	private int xKoordinate, yKoordinate, größeX, größeY;

	public TetrominoI(int xKoordinate, int yKoordinate, int größeX, int größeY) {
		super(xKoordinate, yKoordinate, größeX, größeY);
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.größeX = größeX;
		this.größeY = größeY;

	}

	public void zeichnen(Graphics graphics) {
		Rechteck rechteck = new Rechteck(xKoordinate, yKoordinate, größeX, größeY);
		rechteck.zeichnen(graphics);

		Rechteck rechteck2 = new Rechteck(xKoordinate + größeX, yKoordinate, größeX, größeY);
		rechteck2.zeichnen(graphics);

		Rechteck rechteck3 = new Rechteck(xKoordinate + größeX * 2, yKoordinate, größeX, größeY);
		rechteck3.zeichnen(graphics);

		Rechteck rechteck4 = new Rechteck(xKoordinate + größeX * 3, yKoordinate, größeX, größeY);
		rechteck4.zeichnen(graphics);
	}

	public void bewegeNachRechts() {

		xKoordinate += größeX;
	}

	public void bewegeNachLinks() {

		xKoordinate -= größeX;
	}

	public void setXKoordinate(int xKoordinate) {
		this.xKoordinate = xKoordinate;
	}

	public int getXKoordinate() {
		return xKoordinate;
	}

	public void setYKoordinate(int yKoordinate) {
		this.yKoordinate = yKoordinate;
	}

	public int getYKoordinate() {
		return yKoordinate;
	}
}
