import com.jfinal.server.undertow.UndertowServer;
import config.JfinalConfig;

public class Start {
    public static void main(String[] args) {
        UndertowServer.start(JfinalConfig.class, 80, true);
    }
}
