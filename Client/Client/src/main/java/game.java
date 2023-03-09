import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.function.Consumer;


public class game {
        @FXML
        private ListView<String> listViewClient;

        Integer playerPick = -1;
        Integer totalGuess = -1;
        MorraInfo message;
        Client connection;

        public void setTotalGuess(Integer num)
        {
                totalGuess = num;
        }

        public void setMorraInfo(MorraInfo data)
        {
                message = data;
        }

        public void addListViewClient(String text)
        {
                listViewClient.getItems().add(text);
        }

        public void setClient(Client clientConnection) {
                connection = clientConnection;
        }

        public void sendMorraInfo()
        {
                MorraInfo morraInfo = new MorraInfo();
                morraInfo.p1Guess = playerPick;
                connection.send(morraInfo);
        }
}

