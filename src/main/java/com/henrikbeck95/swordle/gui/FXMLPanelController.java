package com.henrikbeck95.swordle.gui;

/*
	// FXMLPanelController
	
	// [JavaFX para iniciantes - #05 - Button e Label, entendendo a dinâmica](https://www.youtube.com/watch?v=XlTG2joTQbg&list=PLWd_VnthxxLejQ9CcHrsT5HCFn-10kquZ&index=5)
	
	@FXML
    void handleButtonAction(ActionEvent event) {
    	System.out.println("Hahaha");
    	textArea_tab1_results.setText("1234");
    	button_tab1_filter.setText("Clickado!");
    }
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

    @FXML
    void handleButtonAction(ActionEvent event) {
    	System.out.println("Hahaha");
    	textArea_tab1_results.setText("1234");
    	button_tab1_filter.setText("Clickado!");
    }
}