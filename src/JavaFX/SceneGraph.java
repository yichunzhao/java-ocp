package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SceneGraph extends Application implements EventHandler<ActionEvent> {
    private Button button;

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        button = new Button("My Button");
        button.setOnAction(this::handle);
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("My FX APP");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            System.out.println("my button is clicked");
        }

    }
}
