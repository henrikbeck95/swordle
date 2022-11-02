package com.henrikbeck95.swordle.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

import com.henrikbeck95.swordle.App;
import com.henrikbeck95.swordle.dictionary.DictionaryFile;
import com.henrikbeck95.swordle.dictionary.DictionaryFilterArray;
import com.henrikbeck95.wordlist.wordle.Wordle;

public class FXMLPanelController implements Initializable {
	@FXML
	private Tab Statistics;

	@FXML
	private AnchorPane anchorPane_statistics;

	@FXML
	private AnchorPane anchorPane_tab1;

	@FXML
	private AnchorPane anchorPane_tab1_buttons;

	@FXML
	private AnchorPane anchorPane_tab1_checkBoxs;

	@FXML
	private AnchorPane anchorPane_tab1_wordContent;

	@FXML
	private AnchorPane anchorPane_tab1_wordDoesNotContent;

	@FXML
	private AnchorPane anchorPane_tab1_wordLengthInterval;

	@FXML
	private AnchorPane anchorPane_tab1_wordPosition;

	@FXML
	private AnchorPane anchorPane_tab2;

	@FXML
	private AnchorPane anchorPane_tab2_buttons;

	@FXML
	private AnchorPane anchorPane_tab2_checkBoxs;

	@FXML
	private AnchorPane anchorPane_tab2_wordContent;

	@FXML
	private AnchorPane anchorPane_tab2_wordDoesNotContent;

	@FXML
	private AnchorPane anchorPane_tab2_wordLengthInterval;

	@FXML
	private AnchorPane anchorPane_tab2_wordPosition;

	@FXML
	private AnchorPane anchorPane_tab3;

	@FXML
	private AnchorPane anchorPane_tab3_buttons;

	@FXML
	private AnchorPane anchorPane_tab3_checkBoxs;

	@FXML
	private AnchorPane anchorPane_tab3_wordContent;

	@FXML
	private AnchorPane anchorPane_tab3_wordDoesNotContent;

	@FXML
	private AnchorPane anchorPane_tab3_wordLengthInterval;

	@FXML
	private AnchorPane anchorPane_tab3_wordPosition;

	@FXML
	private AnchorPane anchorPane_tab4;

	@FXML
	private AnchorPane anchorPane_tab4_buttons;

	@FXML
	private AnchorPane anchorPane_tab4_checkBoxs;

	@FXML
	private AnchorPane anchorPane_tab4_wordContent;

	@FXML
	private AnchorPane anchorPane_tab4_wordDoesNotContent;

	@FXML
	private AnchorPane anchorPane_tab4_wordLengthInterval;

	@FXML
	private AnchorPane anchorPane_tab4_wordPosition;

	@FXML
	private Button button_tab1_clear;

	@FXML
	private Button button_tab1_filter;

	@FXML
	private Button button_tab2_clear;

	@FXML
	private Button button_tab2_filter;

	@FXML
	private Button button_tab3_clear;

	@FXML
	private Button button_tab3_filter;

	@FXML
	private Button button_tab4_clear;

	@FXML
	private Button button_tab4_filter;

	@FXML
	private CheckBox checkBox_tab1_hasAccentuation;

	@FXML
	private CheckBox checkBox_tab1_isDone;

	@FXML
	private CheckBox checkBox_tab2_hasAccentuation;

	@FXML
	private CheckBox checkBox_tab2_isDone;

	@FXML
	private CheckBox checkBox_tab3_hasAccentuation;

	@FXML
	private CheckBox checkBox_tab3_isDone;

	@FXML
	private CheckBox checkBox_tab4_hasAccentuation;

	@FXML
	private CheckBox checkBox_tab4_isDone;

	@FXML
	private Label label_infoDeveloper;

	@FXML
	private Label label_tab1_wordContent;

	@FXML
	private Label label_tab1_wordDoesNotContent;

	@FXML
	private Label label_tab1_wordLengthInterval;

	@FXML
	private Label label_tab1_wordPosition;

	@FXML
	private Label label_tab2_wordContent;

	@FXML
	private Label label_tab2_wordDoesNotContent;

	@FXML
	private Label label_tab2_wordLengthInterval;

	@FXML
	private Label label_tab2_wordPosition;

	@FXML
	private Label label_tab3_wordContent;

	@FXML
	private Label label_tab3_wordDoesNotContent;

	@FXML
	private Label label_tab3_wordLengthInterval;

	@FXML
	private Label label_tab3_wordPosition;

	@FXML
	private Label label_tab4_wordContent;

	@FXML
	private Label label_tab4_wordDoesNotContent;

	@FXML
	private Label label_tab4_wordLengthInterval;

	@FXML
	private Label label_tab4_wordPosition;

	@FXML
	private Label label_tabStatistics_game1_wordsRestResult;

	@FXML
	private Label label_tabStatistics_game1_wordsRestTitle;

	@FXML
	private Label label_tabStatistics_game1_wordsTotalResult;

	@FXML
	private Label label_tabStatistics_game1_wordsTotalTitle;

	@FXML
	private Label label_tabStatistics_game2_wordsRestResult;

	@FXML
	private Label label_tabStatistics_game2_wordsRestTitle;

	@FXML
	private Label label_tabStatistics_game2_wordsTotalResult;

	@FXML
	private Label label_tabStatistics_game2_wordsTotalTitle;

	@FXML
	private Label label_tabStatistics_game3_wordsRestResult;

	@FXML
	private Label label_tabStatistics_game3_wordsRestTitle;

	@FXML
	private Label label_tabStatistics_game3_wordsTotalResult;

	@FXML
	private Label label_tabStatistics_game3_wordsTotalTitle;

	@FXML
	private Label label_tabStatistics_game4_wordsRestResult;

	@FXML
	private Label label_tabStatistics_game4_wordsRestTitle;

	@FXML
	private Label label_tabStatistics_game4_wordsTotalResult;

	@FXML
	private Label label_tabStatistics_game4_wordsTotalTitle;

	@FXML
	private Label label_tabStatistics_game1_percentage;

	@FXML
	private Label label_tabStatistics_game2_percentage;

	@FXML
	private Label label_tabStatistics_game3_percentage;

	@FXML
	private Label label_tabStatistics_game4_percentage;

	@FXML
	private TabPane tabPane;

	@FXML
	private Tab tab_tab1;

	@FXML
	private Tab tab_tab2;

	@FXML
	private Tab tab_tab3;

	@FXML
	private Tab tab_tab4;

	@FXML
	private TextArea textArea_tab1_results;

	@FXML
	private TextArea textArea_tab2_results;

	@FXML
	private TextArea textArea_tab3_results;

	@FXML
	private TextArea textArea_tab4_results;

	@FXML
	private TextField textField_tab1_wordContent;

	@FXML
	private TextField textField_tab1_wordDoesNotContent;

	@FXML
	private TextField textField_tab1_wordLengthIntervalMaximum;

	@FXML
	private TextField textField_tab1_wordLengthIntervalMinimum;

	@FXML
	private TextField textField_tab1_wordPosition;

	@FXML
	private TextField textField_tab2_wordContent;

	@FXML
	private TextField textField_tab2_wordDoesNotContent;

	@FXML
	private TextField textField_tab2_wordLengthIntervalMaximum;

	@FXML
	private TextField textField_tab2_wordLengthIntervalMinimum;

	@FXML
	private TextField textField_tab2_wordPosition;

	@FXML
	private TextField textField_tab3_wordContent;

	@FXML
	private TextField textField_tab3_wordDoesNotContent;

	@FXML
	private TextField textField_tab3_wordLengthIntervalMaximum;

	@FXML
	private TextField textField_tab3_wordLengthIntervalMinimum;

	@FXML
	private TextField textField_tab3_wordPosition;

	@FXML
	private TextField textField_tab4_wordContent;

	@FXML
	private TextField textField_tab4_wordDoesNotContent;

	@FXML
	private TextField textField_tab4_wordLengthIntervalMaximum;

	@FXML
	private TextField textField_tab4_wordLengthIntervalMinimum;

	@FXML
	private TextField textField_tab4_wordPosition;

	@FXML
	private TitledPane titledPane_tabStatistics_game1;

	@FXML
	private TitledPane titledPane_tabStatistics_game2;

	@FXML
	private TitledPane titledPane_tabStatistics_game3;

	@FXML
	private TitledPane titledPane_tabStatistics_game4;

	// Wordle

	private ArrayList<Wordle> customArrayListWordle;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		String dictionaryUrl = DictionaryFilterArray.getContent(listDictionary, "portuguese");

		// Initialize four null Wordle objects whose means one for each tab
		this.customArrayListWordle = new ArrayList<Wordle>();
		this.customArrayListWordle.add(new Wordle(false, 0, 0, dictionaryUrl, "", "", "?????".toCharArray()));
		this.customArrayListWordle.add(new Wordle(false, 0, 0, dictionaryUrl, "", "", "?????".toCharArray()));
		this.customArrayListWordle.add(new Wordle(false, 0, 0, dictionaryUrl, "", "", "?????".toCharArray()));
		this.customArrayListWordle.add(new Wordle(false, 0, 0, dictionaryUrl, "", "", "?????".toCharArray()));
	}

	// Migrate to MathPercentage class from library

	double calculatePercentageRest(int total, int current) {
		return 100 - calculatePercentage(total, current);
	}

	double calculatePercentage(double total, double current) {
		return current * 100 / total;
	}

	double calculatePercentage(int total, int current) {
		return (double) current * 100 / (double) total;
	}

	// Management Wordle tabs

	Wordle wordleGenerate(boolean accentuation, String wordLengthMinimum, String wordLengthMaximum,
			String wordDictionaryLanguage, String wordContent, String wordNotContent, String wordFinal) {
		// Validate the arguments

		int wordLengthMinimumAux = 1;
		int wordLengthMaximumAux = 30;

		// MUST BE IMPROVED BY CHECKING IF VARIABLE IS COMPATIBLE WITH NUMBER
		if (wordLengthMinimum != "") {
			try {
				wordLengthMinimumAux = Integer.parseUnsignedInt(wordLengthMinimum);
			} catch (NumberFormatException e) {
				// System.out.println("Enter only numbers, please");
			} catch (Exception e) {
				//
			}
		}

		// MUST BE IMPROVED BY CHECKING IF VARIABLE IS COMPATIBLE WITH NUMBER
		if (wordLengthMaximum != "") {
			try {
				wordLengthMaximumAux = Integer.parseUnsignedInt(wordLengthMaximum);
			} catch (NumberFormatException e) {
				// System.out.println("Enter only numbers, please");
			} catch (Exception e) {
				//
			}
		}
		
		// Get the dictionary path
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		String dictionaryUrl = DictionaryFilterArray.getContent(listDictionary, wordDictionaryLanguage);

		// @formatter:off
		/*
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
				wordNotContent, wordFinal.toCharArray());
	}

	@FXML
	void button_tab1_clear_action(ActionEvent event) {
		this.textArea_tab1_results.setText("");
		this.label_tabStatistics_game1_percentage.setText("0%");
		this.label_tabStatistics_game1_wordsTotalResult.setText("0");
		this.label_tabStatistics_game1_wordsRestResult.setText("0");
	}

	@FXML
	void button_tab1_filter_action(ActionEvent event) {
		int tabIndex = 0;
		this.button_tab1_filter.setText("Processing...");

		// Build Wordle
		boolean accentuation = this.checkBox_tab1_hasAccentuation.isSelected();
		String wordLengthMinimum = this.textField_tab1_wordLengthIntervalMinimum.getText();
		String wordLengthMaximum = this.textField_tab1_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab1_wordContent.getText();
		String wordNotContent = this.textField_tab1_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab1_wordPosition.getText();
		Wordle wordle = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage,
				wordContent, wordNotContent, wordFinal);

		// Insert the elements into ArrayList
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		int dictionaryLanguageIndex = DictionaryFilterArray.getContentIndex(listDictionary, wordDictionaryLanguage);
		this.getCustomArrayListWordle().set(tabIndex, wordle);

		// Calculate the operations
		String wordleResults = this.getCustomArrayListWordle().get(tabIndex).getArrayList().toString();
		int total = (int) DictionaryFile.getAmountOfLines(listDictionary.get(dictionaryLanguageIndex));
		int totalRest = this.getCustomArrayListWordle().get(tabIndex).getArrayList().size();
		double percentage = calculatePercentageRest(total, totalRest);

		// Update the label values
		this.label_tabStatistics_game1_percentage.setText(percentage + "%");
		this.label_tabStatistics_game1_wordsTotalResult.setText("" + total);
		this.label_tabStatistics_game1_wordsRestResult.setText("" + totalRest);
		this.textArea_tab1_results.setText(wordleResults);
		this.button_tab1_filter.setText("Filter");
	}

	@FXML
	void button_tab2_clear_action(ActionEvent event) {
		this.textArea_tab2_results.setText("");
		this.label_tabStatistics_game2_percentage.setText("0%");
		this.label_tabStatistics_game2_wordsTotalResult.setText("0");
		this.label_tabStatistics_game2_wordsRestResult.setText("0");
	}

	@FXML
	void button_tab2_filter_action(ActionEvent event) {
		int tabIndex = 1;
		this.button_tab2_filter.setText("Processing...");

		// Build Wordle
		boolean accentuation = this.checkBox_tab2_hasAccentuation.isSelected();
		String wordLengthMinimum = this.textField_tab2_wordLengthIntervalMinimum.getText();
		String wordLengthMaximum = this.textField_tab2_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab2_wordContent.getText();
		String wordNotContent = this.textField_tab2_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab2_wordPosition.getText();
		Wordle wordle = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage,
				wordContent, wordNotContent, wordFinal);

		// Insert the elements into ArrayList
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		int dictionaryLanguageIndex = DictionaryFilterArray.getContentIndex(listDictionary, wordDictionaryLanguage);
		this.getCustomArrayListWordle().set(tabIndex, wordle);

		// Calculate the operations
		String wordleResults = this.getCustomArrayListWordle().get(tabIndex).getArrayList().toString();
		int total = (int) DictionaryFile.getAmountOfLines(listDictionary.get(dictionaryLanguageIndex));
		int totalRest = this.getCustomArrayListWordle().get(tabIndex).getArrayList().size();
		double percentage = calculatePercentageRest(total, totalRest);

		// Update the label values
		this.label_tabStatistics_game2_percentage.setText(percentage + "%");
		this.label_tabStatistics_game2_wordsTotalResult.setText("" + total);
		this.label_tabStatistics_game2_wordsRestResult.setText("" + totalRest);
		this.textArea_tab2_results.setText(wordleResults);
		this.button_tab2_filter.setText("Filter");
	}

	@FXML
	void button_tab3_clear_action(ActionEvent event) {
		this.textArea_tab3_results.setText("");
		this.label_tabStatistics_game3_percentage.setText("0%");
		this.label_tabStatistics_game3_wordsTotalResult.setText("0");
		this.label_tabStatistics_game3_wordsRestResult.setText("0");
	}

	@FXML
	void button_tab3_filter_action(ActionEvent event) {
		int tabIndex = 2;
		this.button_tab3_filter.setText("Processing...");

		// Build Wordle
		boolean accentuation = this.checkBox_tab3_hasAccentuation.isSelected();
		String wordLengthMinimum = this.textField_tab3_wordLengthIntervalMinimum.getText();
		String wordLengthMaximum = this.textField_tab3_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab3_wordContent.getText();
		String wordNotContent = this.textField_tab3_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab3_wordPosition.getText();
		Wordle wordle = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage,
				wordContent, wordNotContent, wordFinal);

		// Insert the elements into ArrayList
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		int dictionaryLanguageIndex = DictionaryFilterArray.getContentIndex(listDictionary, wordDictionaryLanguage);
		this.getCustomArrayListWordle().set(tabIndex, wordle);

		// Calculate the operations
		String wordleResults = this.getCustomArrayListWordle().get(tabIndex).getArrayList().toString();
		int total = (int) DictionaryFile.getAmountOfLines(listDictionary.get(dictionaryLanguageIndex));
		int totalRest = this.getCustomArrayListWordle().get(tabIndex).getArrayList().size();
		double percentage = calculatePercentageRest(total, totalRest);

		// Update the label values
		this.label_tabStatistics_game3_percentage.setText(percentage + "%");
		this.label_tabStatistics_game3_wordsTotalResult.setText("" + total);
		this.label_tabStatistics_game3_wordsRestResult.setText("" + totalRest);
		this.textArea_tab3_results.setText(wordleResults);
		this.button_tab3_filter.setText("Filter");
	}

	@FXML
	void button_tab4_clear_action(ActionEvent event) {
		this.textArea_tab4_results.setText("");
		this.label_tabStatistics_game4_percentage.setText("0%");
		this.label_tabStatistics_game4_wordsTotalResult.setText("0");
		this.label_tabStatistics_game4_wordsRestResult.setText("0");
	}

	@FXML
	void button_tab4_filter_action(ActionEvent event) {
		int tabIndex = 3;
		this.button_tab4_filter.setText("Processing...");

		// Build Wordle
		boolean accentuation = this.checkBox_tab4_hasAccentuation.isSelected();
		String wordLengthMinimum = this.textField_tab4_wordLengthIntervalMinimum.getText();
		String wordLengthMaximum = this.textField_tab4_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab4_wordContent.getText();
		String wordNotContent = this.textField_tab4_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab4_wordPosition.getText();
		Wordle wordle = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage,
				wordContent, wordNotContent, wordFinal);

		// Insert the elements into ArrayList
		ArrayList<String> listDictionary = App.dictionaryListGenerate();
		int dictionaryLanguageIndex = DictionaryFilterArray.getContentIndex(listDictionary, wordDictionaryLanguage);
		this.getCustomArrayListWordle().set(tabIndex, wordle);

		// Calculate the operations
		String wordleResults = this.getCustomArrayListWordle().get(tabIndex).getArrayList().toString();
		int total = (int) DictionaryFile.getAmountOfLines(listDictionary.get(dictionaryLanguageIndex));
		int totalRest = this.getCustomArrayListWordle().get(tabIndex).getArrayList().size();
		double percentage = calculatePercentageRest(total, totalRest);

		// Update the label values
		this.label_tabStatistics_game4_percentage.setText(percentage + "%");
		this.label_tabStatistics_game4_wordsTotalResult.setText("" + total);
		this.label_tabStatistics_game4_wordsRestResult.setText("" + totalRest);
		this.textArea_tab4_results.setText(wordleResults);
		this.button_tab4_filter.setText("Filter");
	}

	// Getters and setters

	// @formatter:off
	private ArrayList<Wordle> getCustomArrayListWordle() { return customArrayListWordle; }
	// private void setCustomArrayListWordle(ArrayList<Wordle> customArrayListWordle) { this.customArrayListWordle = customArrayListWordle; }
	// @formatter:on
}