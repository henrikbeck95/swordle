package com.henrikbeck95.swordle.dictionary;

import java.util.ArrayList;

/*
 * Migrate this classes to the library project
 */

public class DictionaryFilterArray {
	public static int getContentIndex(ArrayList<String> arrayList, String word) {
		int index = -1;

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).matches(".*" + word + ".*") == true) {
				index = i;
				break;
			}
		}

		return index;
	}

	public static String getContent(ArrayList<String> arrayList, String word) {
		int index = DictionaryFilterArray.getContentIndex(arrayList, "portuguese");

		return arrayList.get(index);
	}
}