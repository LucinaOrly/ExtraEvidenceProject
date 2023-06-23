public class FormalObservation extends Application {
	@Override
	public void start(Stage stage) throws exception {
		Parent root = FXMLLoader.load(getClass().getResource("FormalObservation.fxml"));

		Scene scene = new Scene(root);
		stage.setTitel("Tip Calculator");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
