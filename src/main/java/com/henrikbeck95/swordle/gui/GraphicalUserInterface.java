package com.henrikbeck95.swordle.gui;

import java.util.ArrayList;

import com.henrikbeck95.wordlist.wordle.Wordle;

public class GraphicalUserInterface {
	public static void main(ArrayList<String> listDictionary) {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();

		// Insert Wordle elements into ArrayList
		wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "poerd", "", "?????".toCharArray()));
		wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "poerd", "", "?????".toCharArray()));
		wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "a", "", "?m?d?".toCharArray()));
		wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "oip", "aureclvgm", "????s".toCharArray()));

		display(wordles);
	}

	public static void display(ArrayList<Wordle> wordles) {
		for (int i = 0; i < wordles.size(); i++) {
			wordles.get(i).display();
			System.out.println("---###---");
		}
	}
}