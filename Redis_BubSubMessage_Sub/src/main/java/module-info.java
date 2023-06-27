module com.example.redis_bubsubmessage_sub {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires redis.clients.jedis;

    opens com.example.redis_bubsubmessage_sub to javafx.fxml;
    exports com.example.redis_bubsubmessage_sub;
}