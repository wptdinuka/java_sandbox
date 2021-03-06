import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Email extends EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private  String email;
    private int mailboxCapacity = 1;
    private  int defaultPasswordLength = 10;
    private String alternateEmail;

    // constructor to receive  the first and last name

    public Email() {
        String firstName = JOptionPane.showInputDialog("Enter your first name");
        firstName = this.firstName;
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        lastName = this.lastName;

        JOptionPane.showMessageDialog(null, "Welcome to Wpt-Email-Creator\n"+ "Full Name " + this.firstName +" "+ this.lastName );
       



        //Call a method asking for the department - return the department
        this.department = setDepartment();
        JOptionPane.showMessageDialog(null,"Department " + department);

        // call a method for random password
        this.password = randomPassword(defaultPasswordLength);
        JOptionPane.showMessageDialog(null,"password - " + this.password);

        // combine element to generate email
         email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + department + "." + "wptcompany.com";
        JOptionPane.showMessageDialog(null,"Email - " +email);
    }
    
    
   

    // Ask for the Department

    private String setDepartment() {
        int depChoice = Integer.parseInt(JOptionPane.showInputDialog("Department Codes \n1 for Sales \n2 for Accounting \n3 for Devlopment \n0 for None \nSelect Department code :"));
        
        if ( depChoice == 1 ) {
            return "sales";
        } else if ( depChoice == 2 ) {
            return  "accon";
        } else if ( depChoice == 3 ) {
            return  "dev";
        } else  {
            return "";
        }

    }

    // Generate a random password
    private  String randomPassword( int length) {
        String passwordSet = "QWERTZUIOPASDFGHJKLYXCVBNM12345678$%?/??*#";
        char [] password = new char [length];
        for (int i=0; i<length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setM( int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternative email
    public void setAlternateEmail( String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get methods

    public int getMailboxCapacity() { return  mailboxCapacity; }
    public  String getAlternateEmail() { return  alternateEmail; }
    public  String getPassword() { return  password; }


    public String showInfo() {
        return  "Name " + firstName +" "+ lastName +
                "\nCompany-Email " + email +
                "\nMailbox Capacity " + mailboxCapacity + "gb";
    }

}
