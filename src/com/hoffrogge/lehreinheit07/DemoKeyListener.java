package com.hoffrogge.lehreinheit07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class DemoKeyListener implements KeyListener {

	private JLabel textLabel;
	private int zahl1 = 0, zahl2 = 0, ges = 0, pressHaeufigkeit = 0;

	public DemoKeyListener(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int i = 0;
		ArrayList<String> tolleListe = new ArrayList<String>();
		gebeTasteAus(e, "gedrückt");

		try {
			tolleListe.add(String.valueOf(e.getKeyChar()));
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
			System.out.println("hi");
			System.out.println(String.valueOf(i));
		}

		// Enter
		if (KeyEvent.VK_ENTER == e.getKeyCode()) {
			pressHaeufigkeit++;
			if (pressHaeufigkeit == 1) {
				for (int l = 0; l < size(tolleListe); l++) {
					zahl1 += Integer.parseInt(tolleListe.get(l)) * Math.pow(10, (double) size(tolleListe) - l);
					System.out.println("Hi");
				}
				tolleListe = null;
			} else if (pressHaeufigkeit == 2) {
				for (int l = 0; l < size(tolleListe); l++) {
					zahl1 += Integer.parseInt(tolleListe.get(l)) * Math.pow(10, (double) size(tolleListe) - l);
				}
				ges = zahl1 + zahl2;
				System.out.println(String.valueOf(ges));
			}
		}
		/* Mit der Esc-Taste das Programm beenden */
		if (KeyEvent.VK_ESCAPE == e.getKeyCode())
			System.exit(0);
	}

	private int size(ArrayList<String> tolleListe) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gebeTasteAus(e, "losgelassen");
	}

	private void gebeTasteAus(KeyEvent e, String eventArt) {
		textLabel.setText("Taste " + e.getKeyChar() + " " + eventArt);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// nichts machen
	}
}