module hellojavafx {
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires javafx.controls;

    exports hellojavafx;

	opens hellojavafx to javafx.fxml;
}