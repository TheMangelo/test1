module javafxapp {
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;

    exports javafxapp;

	opens javafxapp to javafx.fxml;
}