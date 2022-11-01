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
 * 1. [ ] Fix the scroll bar on textArea to be vertical.
 * 1. [ ] Remove the GraphicalUserInterface.display() method.
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

		String[] arguments = new String[args.length + 2]; // Temporary action in favor of args

		switch (arguments.length) {
		case 0:
			CommandLineInterfaceDisplay.main(listDictionary);
			break;
		case 1:
			// Doing some tests
			System.out.println(1.0 - 0.0003514119502981272);
			break;
		default:
			GraphicalUserInterface.main(listDictionary, args);
			System.exit(0);
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