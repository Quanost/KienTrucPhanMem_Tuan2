package com.example.redis_bubsubmessage_sub;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {

    @FXML
    private Button btnSendSub;

    @FXML
    private TextArea txtAreaSub;

    @FXML
    private TextField txtMessageSub;
    private Jedis jedis;

    @FXML
    public void NhanMessage() {
        System.out.println("__");
         jedis = new Jedis("127.0.0.1",6379);
        System.out.println("Connection to server sucessfully");

        jedis.subscribe(new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                super.onMessage(channel, message);
                Platform.runLater(()->{
                    txtAreaSub.appendText(message);
                });
                System.out.println(message);
            }
        },"Test");

}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        jedis = new Jedis("127.0.0.1",6379);
        System.out.println("Connection to server sucessfully");

        jedis.subscribe(new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                super.onMessage(channel, message);
                Platform.runLater(()->{
                    txtAreaSub.appendText(message);
                });
                System.out.println("Message nhan duoc:"+message);
            }
        },"Test");

    }
}