package com.henrikbeck95.swordle;

import java.util.ArrayList;

import com.henrikbeck95.swordle.cli.CommandLineInterfaceDisplay;
import com.henrikbeck95.swordle.gui.GraphicalUserInterface;
import com.henrikbeck95.wordlist.Wordlist;

public class App {
	public static void main(String[] args) {
		ArrayList<String> listDictionary = dictionaryListGenerate();

		String[] arguments = new String[args.length + 1]; // Remove this soon in favor of args

		if (arguments.length == 0) {
			CommandLineInterfaceDisplay.main(listDictionary);
		} else {
			GraphicalUserInterface.main(listDictionary, args);
			System.exit(0);
		}
	}

	public static ArrayList<String> dictionaryListGenerate() {
		ArrayList<String> listDictionary = new ArrayList<String>();

		listDictionary.add(Wordlist.getResourcePath("english"));
		listDictionary.add(Wordlist.getResourcePath("portuguese"));

		return listDictionary;
	}
}