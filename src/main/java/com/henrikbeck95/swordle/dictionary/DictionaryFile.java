package com.henrikbeck95.swordle.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Migrate this classes to the library project
 */

public class DictionaryFile {
	public static int getAmountOfLines(String filePath) {
		Path path = Paths.get(filePath);
		int lines = 0;

		try {
			lines = (int) Files.lines(path).count();

			return lines;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
}