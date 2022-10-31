package com.henrikbeck95.swordle.gui;

import java.util.ArrayList;

import com.henrikbeck95.swordle.App;
import com.henrikbeck95.swordle.dictionary.DictionaryFilterArray;
import com.henrikbeck95.wordlist.wordle.Wordle;

/*
 * import java.net.URL;
 * import java.util.ResourceBundle;
 * import javafx.fxml.Initializable;
 * 
 * public class FXMLPanelController implements Initializable {}
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

public class FXMLPanelController {

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
    private ProgressIndicator progressIndicator_tabStatistics_game1_percentage;

    @FXML
    private ProgressIndicator progressIndicator_tabStatistics_game2_percentage;

    @FXML
    private ProgressIndicator progressIndicator_tabStatistics_game3_percentage;

    @FXML
    private ProgressIndicator progressIndicator_tabStatistics_game4_percentage;

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

    // Management tabs
    
    String wordleGenerate(boolean accentuation, String wordLengthMinimum, String wordLengthMaximum, String wordDictionaryLanguage, String wordContent, String wordNotContent, String wordFinal){
    	// Validate the arguments
    	
    	int wordLengthMinimumAux = 20;
    	int wordLengthMaximumAux = 25;
    	
    	// MUST BE IMPROVED BY CHECKING IF VARIABLE IS COMPATIBLE WITH NUMBER  
    	if (wordLengthMinimum != "") {
    		wordLengthMinimumAux = Integer.parseUnsignedInt(wordLengthMinimum);
    	}
    	
    	// MUST BE IMPROVED BY CHECKING IF VARIABLE IS COMPATIBLE WITH NUMBER  
    	if (wordLengthMaximum != "") {
    		wordLengthMaximumAux = Integer.parseUnsignedInt(wordLengthMaximum);
    	}
    	
    	if (wordDictionaryLanguage != "") {
    		wordDictionaryLanguage = this.textField_tab1_wordContent.getText();
    	} else {
    		wordDictionaryLanguage = "portuguese";
    	}
    	
    	if (wordContent != "") {
    		wordContent = this.textField_tab1_wordContent.getText();
    	}
    	
    	if (wordNotContent != "") {
    		wordNotContent = this.textField_tab1_wordDoesNotContent.getText();
    	}
    	
    	if (wordFinal != "") {
    		wordFinal = this.textField_tab1_wordPosition.getText();
    	}
    	
    	// Get the dictionary path
    	ArrayList<String> listDictionary = App.dictionaryListGenerate();
    	String dictionaryUrl = DictionaryFilterArray.getContent(listDictionary, wordDictionaryLanguage);
    	
    	// Build Wordle object with custom arguments
    	Wordle wordle = new Wordle(accentuation, wordLengthMinimumAux, wordLengthMaximumAux, dictionaryUrl, wordContent, wordNotContent, wordFinal.toCharArray());
    	
    	return wordle.getArrayList().toString();
    }

    @FXML
    void button_tab1_clear_action(ActionEvent event) {
    	this.textArea_tab1_results.setText("");
    }
    
    @FXML
    void button_tab1_filter_action(ActionEvent event) {
    	this.button_tab1_filter.setText("Processing...");
    	
    	boolean accentuation = this.checkBox_tab1_hasAccentuation.isSelected();
    	String wordLengthMinimum = this.textField_tab1_wordLengthIntervalMaximum.getText();
		String wordLengthMaximum = this.textField_tab1_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab1_wordContent.getText();
		String wordNotContent = this.textField_tab1_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab1_wordPosition.getText();
    	
    	String aux = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage, wordContent, wordNotContent, wordFinal);
    	
    	this.textArea_tab1_results.setText(aux);
    	this.button_tab1_filter.setText("Filter");
    }

    @FXML
    void button_tab2_clear_action(ActionEvent event) {
    	this.textArea_tab2_results.setText("");
    }

    @FXML
    void button_tab2_filter_action(ActionEvent event) {
    	this.button_tab2_filter.setText("Processing...");
    	
    	boolean accentuation = this.checkBox_tab2_hasAccentuation.isSelected();
    	String wordLengthMinimum = this.textField_tab2_wordLengthIntervalMaximum.getText();
		String wordLengthMaximum = this.textField_tab2_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab2_wordContent.getText();
		String wordNotContent = this.textField_tab2_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab2_wordPosition.getText();
    	
    	String aux = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage, wordContent, wordNotContent, wordFinal);
    	
    	this.textArea_tab2_results.setText(aux);
    	this.button_tab2_filter.setText("Filter");
    }

    @FXML
    void button_tab3_clear_action(ActionEvent event) {
    	this.textArea_tab3_results.setText("");
    }

    @FXML
    void button_tab3_filter_action(ActionEvent event) {
    	this.button_tab3_filter.setText("Processing...");
    	
    	boolean accentuation = this.checkBox_tab3_hasAccentuation.isSelected();
    	String wordLengthMinimum = this.textField_tab3_wordLengthIntervalMaximum.getText();
		String wordLengthMaximum = this.textField_tab3_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab3_wordContent.getText();
		String wordNotContent = this.textField_tab3_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab3_wordPosition.getText();
    	
    	String aux = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage, wordContent, wordNotContent, wordFinal);
    	
    	this.textArea_tab3_results.setText(aux);
    	this.button_tab3_filter.setText("Filter");
    }

    @FXML
    void button_tab4_clear_action(ActionEvent event) {
    	this.textArea_tab4_results.setText("");
    }

    @FXML
    void button_tab4_filter_action(ActionEvent event) {
    	this.button_tab4_filter.setText("Processing...");
    	
    	boolean accentuation = this.checkBox_tab4_hasAccentuation.isSelected();
    	String wordLengthMinimum = this.textField_tab4_wordLengthIntervalMaximum.getText();
		String wordLengthMaximum = this.textField_tab4_wordLengthIntervalMaximum.getText();
		String wordDictionaryLanguage = "portuguese";
		String wordContent = this.textField_tab4_wordContent.getText();
		String wordNotContent = this.textField_tab4_wordDoesNotContent.getText();
		String wordFinal = this.textField_tab4_wordPosition.getText();
    	
    	String aux = wordleGenerate(accentuation, wordLengthMinimum, wordLengthMaximum, wordDictionaryLanguage, wordContent, wordNotContent, wordFinal);
    	
    	this.textArea_tab4_results.setText(aux);
    	this.button_tab4_filter.setText("Filter");
    }
    
    // Management statistics
    
    // ???
}