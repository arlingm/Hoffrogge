package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;
import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.tetris.TetrominoI;
import com.hoffrogge.tetris.TetrominoJ;
import com.hoffrogge.tetris.TetrominoT;
import com.hoffrogge.tetris.TetrominoO;
import com.hoffrogge.tetris.TetrominoS;
import com.hoffrogge.tetris.TetrominoSpielstein;

public class Tetrominu implements TetrominoSpielstein {

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
		TetrominoI tetrominoI = new TetrominoI(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoI.zeichnen(graphics);
	}

	public void tetrominoI(Graphics graphics) {
		TetrominoT tetrominoT = new TetrominoT(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoT.zeichnen(graphics);
	}

	public void tetrominoO(Graphics graphics) {
		TetrominoJ tetrominoJ = new TetrominoJ(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoJ.zeichnen(graphics);
	}

	public void tetrominoJ(Graphics graphics) {
		TetrominoT tetrominoL = new TetrominoT(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoL.zeichnen(graphics);

	}

	public void tetrominoL(Graphics graphics) {
		TetrominoT tetrominoT = new TetrominoT(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoT.zeichnen(graphics);
	}

	public void tetrominoS(Graphics graphics) {
		TetrominoS tetrominoS = new TetrominoS(xKoordinate, xKoordinate, gr��eX, gr��eY);
		tetrominoS.zeichnen(graphics);
	}

	public void tetrominoZ(Graphics graphics) {
		TetrominoO tetrominoO = new TetrominoO(xKoordinate, xKoordinate, gr��eX, gr��eY);
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
