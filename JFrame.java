import javax.swing.*;

public class JFrame {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        // creating a new frame
        JFrame frame = new JFrame();
        // set frame title
        frame.setTitle("WPT-Frame");
        // setting frame size
        frame.setSize(420,420);
        // setting visibility
        frame.setVisible(true);

        // creating an image icon
        ImageIcon image = new ImageIcon("icon.jpg");
        // change icon of the frame
        frame.setIconImage(image.getImage());


    }
}
