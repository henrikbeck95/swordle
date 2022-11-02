package com.henrikbeck95.swordle.cli;

import java.util.ArrayList;

import com.henrikbeck95.swordle.dictionary.DictionaryFilterArray;
import com.henrikbeck95.wordlist.Wordlist;
import com.henrikbeck95.wordlist.wordle.Wordle;

public class CommandLineInterfaceDisplay {
	// @formatter:off
	/*
	 * Build Wordle object with custom arguments
	 * 
	 * boolean accentuation.
	 * int wordLengthMinimum
	 * int wordLengthMaximum
	 * String wordDictionaryLanguage
	 * String wordContent
	 * String wordNotContent
	 * char wordFinal[]
	 * 
	 * Build dictionary according to the language
	 * String dictionaryUrl = DictionaryFilterArray.getContent(listDictionary, "english");
	 * 
	 * Build instance example
	 * wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "", "", "?????".toCharArray()));
	 * wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "eil", "aurocpsvgmpgj", "?e?i?".toCharArray()));
	 */
	// @formatter:on

	public static void main(ArrayList<String> listDictionary) {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();

		String dictionaryUrl = DictionaryFilterArray.getContent(listDictionary, "portuguese");

		// Insert Wordle elements into ArrayList
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "", "", "?????".toCharArray()));

		// Display
		// sizes(wordles);
		values(wordles);
	}

	public static void sizes(ArrayList<Wordle> wordles) {
		Wordlist.displayAllWordleSizes(wordles);
	}

	public static void values(ArrayList<Wordle> wordles) {
		Wordlist.displayAllWordleValues(wordles);
	}
}