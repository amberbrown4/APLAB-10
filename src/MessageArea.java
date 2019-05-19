import javax.swing.*;
import java.awt.*;

public class MessageArea extends JPanel {

    public MessageArea(){
        this.setLayout(new BorderLayout());
        JButton jButton = new JButton("Send Message");
        this.add(jButton,BorderLayout.EAST);
        JTextField jTextField = new JTextField();
        this.add(jTextField,BorderLayout.CENTER);
    }
}
