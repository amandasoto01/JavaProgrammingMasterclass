module academy.learnprogramming.ui {
    requires javafx.fxml;
    requires javafx.controls;
    requires academy.learnprogramming.db;

    exports academy.learningprogramming.ui to javafx.graphics;
    opens academy.learnprogramming.ui to javafx.fxml;
}