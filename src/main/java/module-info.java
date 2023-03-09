module io.github.protocollaboratory.smsserversimulatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    opens io.github.protocollaboratory.smsserversimulatorjavafx to javafx.fxml;
    exports io.github.protocollaboratory.smsserversimulatorjavafx;
}