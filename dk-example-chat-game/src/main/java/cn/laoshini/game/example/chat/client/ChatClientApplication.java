package cn.laoshini.game.example.chat.client;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 客户端程序启动类
 *
 * @author fagarine
 */
public class ChatClientApplication extends Application {

    private static String[] startArgs;

    public static void main(String[] args) {
        startArgs = args;
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String name = null;
        if (startArgs != null && startArgs.length > 0) {
            name = startArgs[0].trim();
        }
        ChatClientView view = new ChatClientView(name, primaryStage);
        view.showWindow();
    }
}
