package Piano;


import java.net.URL;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Piano extends Application {

    final URL resource = this.getClass().getResource("n1.wav");
    final AudioClip n1 = new AudioClip(resource.toString());
    final AudioClip n2 = new AudioClip(getClass().getResource("n2.wav").toString());
    final AudioClip n3 = new AudioClip(getClass().getResource("n3.wav").toString());
    final AudioClip n4 = new AudioClip(getClass().getResource("n4.wav").toString());
    final AudioClip n5 = new AudioClip(getClass().getResource("n5.wav").toString());
    final AudioClip n6 = new AudioClip(getClass().getResource("n6.wav").toString());
    final AudioClip n7 = new AudioClip(getClass().getResource("n7.wav").toString());
    final AudioClip n8 = new AudioClip(getClass().getResource("n8.wav").toString());
    final AudioClip n9 = new AudioClip(getClass().getResource("n9.wav").toString());
    final AudioClip n10 = new AudioClip(getClass().getResource("n10.wav").toString());
    final AudioClip n11 = new AudioClip(getClass().getResource("n11.wav").toString());
    final AudioClip n12 = new AudioClip(getClass().getResource("n12.wav").toString());
    Rectangle r = new Rectangle(270, 60, 60, 200);
    Rectangle ra = new Rectangle(314, 60, 25, 130);
    Rectangle r1 = new Rectangle(331, 60, 60, 200);
    Rectangle r1a = new Rectangle(382, 60, 25, 130);
    Rectangle r2 = new Rectangle(391, 60, 60, 200);
    Rectangle r3 = new Rectangle(452, 60, 60, 200);
    Rectangle r3a = new Rectangle(498, 60, 25, 130);
    Rectangle r4 = new Rectangle(515, 60, 60, 200);
    Rectangle r4a = new Rectangle(564, 60, 25, 130);
    Rectangle r5a = new Rectangle(630, 60, 25, 130);
    Rectangle r6 = new Rectangle(639, 60, 60, 200);
    Rectangle r5 = new Rectangle(577, 60, 60, 200);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLACK);
        ra.setFill(Color.BLACK);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);
        r1a.setFill(Color.BLACK);
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.BLACK);
        r3.setFill(Color.WHITE);
        r3.setStroke(Color.BLACK);
        r3a.setFill(Color.BLACK);
        r4.setFill(Color.WHITE);
        r4.setStroke(Color.BLACK);
        r4a.setFill(Color.BLACK);
        r5.setFill(Color.WHITE);
        r5.setStroke(Color.BLACK);
        r5a.setFill(Color.BLACK);
        r6.setFill(Color.WHITE);
        r6.setStroke(Color.BLACK);
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (t.getSource() == r) {
                    n1.play(1.0);
                } else if (t.getSource() == r1) {
                    n2.play(1.0);
                } else if (t.getSource() == r2) {
                    n3.play(1.0);
                } else if (t.getSource() == r3) {
                    n4.play(1.0);
                } else if (t.getSource() == r4) {
                    n5.play();
                } else if (t.getSource() == r5) {
                    n6.play(1.0);
                } else if (t.getSource() == r6) {
                    n7.play(1.0);
                } else if (t.getSource() == ra) {
                    n8.play(0.5);
                } else if (t.getSource() == r1a) {
                    n9.play(0.5);
                } else if (t.getSource() == r3a) {
                    n10.play(0.5);
                } else if (t.getSource() == r4a) {
                    n11.play(0.5);
                } else if (t.getSource() == r5a) {
                    n12.play(0.5);
                }
            }
        };
        r.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r4.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r5.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r6.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        ra.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r1a.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r3a.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r4a.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        r5a.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        root.getChildren().addAll(r, r1, r2, r3, r4, r5, r6, ra, r1a, r3a, r4a, r5a);
        final Scene scene = new Scene(root, 900, 600);
        PianOnKeyPress(scene);
        stage.setScene(scene);
        stage.setTitle("PIANO");
        stage.show();
    }

    private void PianOnKeyPress(Scene scene) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case A:
                        r.setFill(Color.RED);
                        n1.play();
                        break;
                    case S:
                        n2.play();
                        r1.setFill(Color.RED);
                        break;
                    case D:
                        r2.setFill(Color.RED);
                        n3.play();
                        break;
                    case F:
                        r3.setFill(Color.RED);
                        n4.play();
                        break;
                    case G:
                        r4.setFill(Color.RED);
                        n5.play();
                        break;
                    case H:
                        r5.setFill(Color.RED);
                        n6.play();
                        break;
                    case J:
                        r6.setFill(Color.RED);
                        n7.play();
                        break;
                    case W:
                        ra.setFill(Color.RED);
                        n8.play(0.5);
                        break;
                    case E:
                        r1a.setFill(Color.RED);
                        n9.play(0.5);
                        break;
                    case T:
                        r3a.setFill(Color.RED);
                        n10.play(0.5);
                        break;
                    case Y:
                        r4a.setFill(Color.RED);
                        n11.play(0.5);
                        break;
                    case U:
                        r5a.setFill(Color.RED);
                        n12.play(0.5);
                        break;
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent t) {
                switch (t.getCode()) {
                    case A:
                        r.setFill(Color.WHITE);
                        break;
                    case S:
                        r1.setFill(Color.WHITE);
                        break;
                    case D:
                        r2.setFill(Color.WHITE);
                        break;
                    case F:
                        r3.setFill(Color.WHITE);
                        break;
                    case G:
                        r4.setFill(Color.WHITE);
                        break;
                    case H:
                        r5.setFill(Color.WHITE);
                        break;
                    case J:
                        r6.setFill(Color.WHITE);
                        break;
                    case W:
                        ra.setFill(Color.BLACK);
                        break;
                    case E:
                        r1a.setFill(Color.BLACK);
                        break;
                    case T:
                        r3a.setFill(Color.BLACK);
                        break;
                    case Y:
                        r4a.setFill(Color.BLACK);
                        break;
                    case U:
                        r5a.setFill(Color.BLACK);
                        break;
                }
            }
        });
    }
}
