package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;

public class TetrominoL extends Tetrominu implements GeometrischeFigur {

	private int xKoordinate, yKoordinate, gr��eX, gr��eY;

	public TetrominoL(int xKoordinate, int yKoordinate, int gr��eX, int gr��eY) {
		super(xKoordinate, yKoordinate, gr��eX, gr��eY);
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		this.gr��eX = gr��eX;
		this.gr��eY = gr��eY;

	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Punkt getMittelPunkt() {
		// TODO Auto-generated method stub
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
