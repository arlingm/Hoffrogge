package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;

public class TetrominoO extends Tetrominu implements GeometrischeFigur {

	private int xKoordinate, yKoordinate, größeX, größeY;
	private Punkt mittelpunkt;

	public TetrominoO(int xKoordinate, int yKoordinate, int größeX, int größeY) {
		super(xKoordinate, yKoordinate, größeX, größeY);
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.größeX = größeX;
		this.größeY = größeY;

	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;

	}

	@Override
	public Punkt getMittelPunkt() {
		mittelpunkt = größeX;

		return null;
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Farbe getLinienFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void zeichnen(Graphics graphics) {
		// TODO Auto-generated method stub

	}

}
