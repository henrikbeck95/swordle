package com.henrikbeck95.swordle.gui;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application {
	public static void main(ArrayList<String> listDictionary, String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			int screenWidth = 440; // 430
			int screenHeight = 405; // 400

			String filepath = "./FXMLPanel.fxml";
			Pane root = FXMLLoader.load(getClass().getResource(filepath));
			Scene scene = new Scene(root, screenWidth, screenHeight);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Swordle");
			primaryStage.show();
			primaryStage.setFullScreen(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}