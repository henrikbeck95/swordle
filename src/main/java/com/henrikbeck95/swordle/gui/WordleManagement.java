package com.henrikbeck95.swordle.gui;

import java.util.ArrayList;

import com.henrikbeck95.library.common.search.regex.RegexArrayList;
import com.henrikbeck95.swordle.App;
import com.henrikbeck95.wordlist.wordle.Wordle;

public class WordleManagement {
	public static int validateIntegerFromString(int valueDefault, String wordLength) {
		if (wordLength != "") {
			try {
				valueDefault = Integer.parseUnsignedInt(wordLength);
			} catch (NumberFormatException e) {
				// System.out.println("Enter only numbers, please");
			} catch (Exception e) {
				//
			}
		}

		return valueDefault;
	}
	
	public static Wordle wordleGenerate(boolean accentuation, String wordLengthMinimum, String wordLengthMaximum,
			String wordDictionaryLanguage, String wordContent, String wordNotContent, String wordFinal) {
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		String dictionaryUrl = RegexArrayList.getStringContent(listDictionary, wordDictionaryLanguage);
		int wordLengthMinimumAux = validateIntegerFromString(1, wordLengthMinimum);
		int wordLengthMaximumAux = validateIntegerFromString(30, wordLengthMaximum);
		
		accentuation = ! accentuation;

		// @formatter:off
		/*
		// Debug the values
		System.out.println(
			"\nDebugging..." +
			"\naccentuation: " + accentuation +
			"\nwordLengthMinimum: " + wordLengthMinimumAux +
			"\nwordLengthMaximum: " + wordLengthMaximumAux +
			"\nwordDictionaryLanguage: " + dictionaryUrl +
			"\nwordContent: " + wordContent +
			"\nwordNotContent: " + wordNotContent +
			"\nwordFinal: " + wordFinal
		);
		 */
		// @formatter:ON

		// Build Wordle object with custom arguments
		return new Wordle(accentuation, wordLengthMinimumAux, wordLengthMaximumAux, dictionaryUrl, wordContent,
				wordNotContent, wordFinal);
	}
}