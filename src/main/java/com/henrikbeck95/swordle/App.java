package com.henrikbeck95.swordle;

import java.util.ArrayList;

import com.henrikbeck95.swordle.cli.CommandLineInterfaceDisplay;
import com.henrikbeck95.swordle.gui.GraphicalUserInterface;
import com.henrikbeck95.wordlist.Wordlist;

public class App {
	public static void main(String[] args) {
		ArrayList<String> listDictionary = dictionaryListGenerate();

		// Temporary action in favor of args
		String[] arguments = new String[args.length + 0];
		// String[] arguments = new String[args.length + 1];

		switch (arguments.length) {
		case 0:
			GraphicalUserInterface.main(listDictionary, args);
			System.exit(0);
			break;
		default:
			CommandLineInterfaceDisplay.main(listDictionary);
			break;
		}
	}

	public static ArrayList<String> dictionaryListGenerate() {
		ArrayList<String> listDictionary = new ArrayList<String>();

		listDictionary.add(Wordlist.getResourcePath("english"));
		listDictionary.add(Wordlist.getResourcePath("portuguese"));

		return listDictionary;
	}
}