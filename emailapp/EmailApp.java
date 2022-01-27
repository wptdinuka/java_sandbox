import javax.swing.JOptionPane;

public class EmailApp {

    public static void main(String[] args) {
	       Email email1 = new Email();
   // Email email2 = new Email("Ado", "Macn");

        JOptionPane.showMessageDialog(null,email1.showInfo());

    }
}
