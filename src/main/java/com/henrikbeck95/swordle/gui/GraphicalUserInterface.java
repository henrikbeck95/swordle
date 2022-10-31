package com.henrikbeck95.swordle.gui;

import java.io.IOException;
import java.util.ArrayList;

import com.henrikbeck95.wordlist.wordle.Wordle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application {
	private ArrayList<String> listDictionary;
	private ArrayList<Wordle> wordles;
	
	public static void main(ArrayList<String> listDictionary, String[] args) {
		launch(args);
	}

	public static void display(ArrayList<Wordle> wordles) {
		for (int i = 0; i < wordles.size(); i++) {
			wordles.get(i).display();
			System.out.println("---###---");
		}
	}
	
	public void buildWordle(){
		// Build Wordle and insert the elements into ArrayList
		this.wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "poerd", "", "?????".toCharArray()));
		this.wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "poerd", "", "?????".toCharArray()));
		this.wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "a", "", "?m?d?".toCharArray()));
		this.wordles.add(new Wordle(false, 5, 5, listDictionary.get(1), "oip", "aureclvgm", "????s".toCharArray()));
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			int width = 440; // 430
			int height = 405; // 400

			// String filepath = "./display/gui/view/painel.fxml";
			// String filepath = "./display/gui/FXMLPanel.fxml";
			// String filepath = "./painel.fxml";
			String filepath = "./FXMLPanel.fxml";
			Pane root = FXMLLoader.load(getClass().getResource(filepath));
			Scene scene = new Scene(root, width, height);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Swordle");
			primaryStage.show();
			primaryStage.setFullScreen(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}