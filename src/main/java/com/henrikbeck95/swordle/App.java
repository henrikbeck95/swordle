package com.henrikbeck95.swordle;

import java.util.ArrayList;

import com.henrikbeck95.swordle.cli.CommandLineInterfaceDisplay;
import com.henrikbeck95.swordle.gui.GraphicalUserInterface;
import com.henrikbeck95.wordlist.Wordlist;

/*
 * Task list
 * 
 * - Issues
 * 1. [ ] Replace progressBar in favor of label for displaying the percentage values.
 * progressIndicator_tabStatistics_game1_percentage to label_tabStatistics_game1_percentage
 * 1. [ ] Fix the scroll bar on textArea to be vertical.
 * 
 * - Features
 * 1. [ ] Export the results to a plain text file.
 * 
 * - Refactory
 * 1. [ ] Use a shorter dictionary file for implementing JUnit5 tests to the Wordlist library project.
 * 1. [ ] Refactory this project some functions to the Wordlist library project.
 * 1. [ ] Refactory the Wordlist library project to others libraries projects.
 * 1. [ ] ???.
 */

public class App {
	public static void main(String[] args) {
		ArrayList<String> listDictionary = dictionaryListGenerate();

		String[] arguments = new String[args.length + 0]; // Temporary action in favor of args
//		String[] arguments = new String[args.length + 1]; // Temporary action in favor of args

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