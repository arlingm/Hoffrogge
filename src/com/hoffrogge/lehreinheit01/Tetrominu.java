package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;
import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.tetris.TetrominoI;
import com.hoffrogge.tetris.TetrominoJ;
import com.hoffrogge.tetris.TetrominoL;
import com.hoffrogge.tetris.TetrominoO;
import com.hoffrogge.tetris.TetrominoS;
import com.hoffrogge.tetris.TetrominoSpielstein;

public class Tetrominu implements TetrominoSpielstein {

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
		TetrominoI tetrominoI = new TetrominoI(0, 100, 50, 50);
		tetrominoI.zeichnen(graphics);
	}

	public void tetrominoI(Graphics graphics) {
		TetrominoT tetrominoT = new TetrominoT(200, 0, 50, 50);
		tetrominoT.zeichnen(graphics);
	}

	public void tetrominoO(Graphics graphics) {
		TetrominoJ tetrominoJ = new TetrominoJ(400, 0, 50, 50);
		tetrominoJ.zeichnen(graphics);
	}

	public void tetrominoJ(Graphics graphics) {
		TetrominoL tetrominoL = new TetrominoL(600, 0, 50, 50);
		tetrominoL.zeichnen(graphics);

	}

	public void tetrominoL(Graphics graphics) {
		TetrominoT tetrominoT = new TetrominoT(0, 200, 50, 50);
		tetrominoT.zeichnen(graphics);
	}

	public void tetrominoS(Graphics graphics) {
		TetrominoS tetrominoS = new TetrominoS(200, 200, 50, 50);
		tetrominoS.zeichnen(graphics);
	}

	public void tetrominoZ(Graphics graphics) {
		TetrominoO tetrominoO = new TetrominoO(400, 200, 50, 50);
		tetrominoO.zeichnen(graphics);
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

	@Override
	public int compareTo(TetrominoSpielstein o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHoechstesY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTiefstesY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getKanteLinksX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getKanteRechtsX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachUnten() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachRechts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachLinks() {

	}

	@Override
	public void rotiereNachLinks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotiereNachRechts() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean faelltAuf(TetrominoSpielstein tetrominoSpielstein) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TetrominoSpielstein> getViertelBloecke() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Farbe getFuellFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFuellFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}

}
