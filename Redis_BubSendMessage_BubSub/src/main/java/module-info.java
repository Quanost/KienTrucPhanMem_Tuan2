module com.example.redis_bubsendmessage_bubsub {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires redis.clients.jedis;

    opens com.example.redis_bubsendmessage_bubsub to javafx.fxml;
    exports com.example.redis_bubsendmessage_bubsub;
}