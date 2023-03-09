package io.github.protocollaboratory.smsserversimulatorjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Panel panel = new Panel();
        Scene scene = new Scene(panel, PixelConst.WIDTH, PixelConst.HEIGHT);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());       //(3)

        stage.setTitle("Sms Server Simulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
