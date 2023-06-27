package com.example.redis_bubsendmessage_bubsub;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Button btnSend;

    @FXML
    private TextArea txtAre;

    @FXML
    private TextField txtMessage;




   public void SendMessage(ActionEvent event){
       Jedis jedis = new Jedis("127.0.0.1",6379);
//       System.out.println("Connection to server sucessfully");
//
//       jedis.set("message-send", txtMessage.getText());
//        // Get the stored data and print it
//       txtMessage.setText("");
//        System.out.println("Send data successfully");

      jedis.publish("Test",txtMessage.getText());
      txtAre.appendText(txtMessage.getText()+"\n");
      txtMessage.setText("");
      System.out.println("Send message");



   }

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//       try{
//           Jedis jedis = new Jedis("127.0.0.1",6379);
//           System.out.println("Connection to server sucessfully");
//
//           jedis.subscribe(new JedisPubSub() {
//               @Override
//               public void onMessage(String channel, String message) {
//                   super.onMessage(channel, message);
//                   Platform.runLater(()->{
//                       txtAre.appendText(message);
//                   });
//                   System.out.println("Message nhan duoc:"+message);
//               }
//           },"Test");
//
//
//       }catch (Exception exception){
//           System.out.println(exception);
//       }
//
//    }
}

