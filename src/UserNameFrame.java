import javax.swing.*;
import java.awt.*;

public class UserNameFrame extends JFrame {
    private static final String BTN_TXT = " Start Chatting ...";
    private static final String LABEL_TXT = " Choose Your UserName ";
    private static final int WIDTH = 300, HEIGHT = 100;

    JTextField jTextField;
    JButton jButton;

    public UserNameFrame() throws HeadlessException {
        super();
        this.setLayout(new BorderLayout());
        JLabel label = new JLabel(LABEL_TXT);
        add(label,BorderLayout.PAGE_START);
        jTextField = new JTextField();
        add(jTextField, BorderLayout.CENTER);
        jButton = new JButton(BTN_TXT);
        add(jButton , BorderLayout.PAGE_END);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        pack();

    }

}
