import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Face extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon glasses;
    ImageIcon neutral;
    ImageIcon thinking;
    ImageIcon woozy;

    Face(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.addMouseListener(this);

        glasses = new ImageIcon("glasse.png");
        neutral = new ImageIcon("neutral.png");
        thinking = new ImageIcon("thinking.png");
        woozy = new ImageIcon("woozy.png");

        label.setIcon(glasses);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setIcon(woozy);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        label.setIcon(neutral);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You entered the component");
        label.setIcon(thinking);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the component");
        label.setIcon(glasses);
    }

}