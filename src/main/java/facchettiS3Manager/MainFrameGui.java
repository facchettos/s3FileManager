package facchettiS3Manager;

import javax.swing.*;
import java.awt.*;

public class MainFrameGui {

        static Color colors[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
                Color.MAGENTA };
        static S3Panel s3Panel = new S3Panel();

        public MainFrameGui(){
            JFrame frame = new JFrame("AWS manager");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1500,1000);
            frame.add(s3Panel.panel);
            frame.setVisible(true);
        }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(MainFrameGui::new);
    }


}
