import javax.swing.*;
import java.awt.*;

public class ChatRoomGUI extends JFrame {
    private String userName;
    private String textMessage;
    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;
    private ChatArea chatBox;
    private JPanel totalPanel;
    private MessageArea messageArea;
    private ParticipantsArea participantsArea;

    public ChatRoomGUI() {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle(WINDOWS_TITLE);
        //this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);
        chatBox = new ChatArea();
        totalPanel = new JPanel();
        messageArea = new MessageArea();
        participantsArea = new ParticipantsArea();
        totalPanel.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        totalPanel.add(participantsArea, BorderLayout.WEST);
        totalPanel.add(messageArea, BorderLayout.SOUTH);
        totalPanel.add(chatBox, BorderLayout.CENTER);
       // this.add(new JScrollPane(chatBox), BorderLayout.CENTER);
        this.setContentPane(totalPanel);
        this.setVisible(true);
    }

    public void addMessage(String userName, String textMessage) {
        chatBox.addMessage(userName,textMessage);
        chatBox.setVisible(true);
    }

    public void addNewParticipant(String username) {
        participantsArea.addUser(username);
    }
    public void removeParticipant(String username){
        participantsArea.removeUser(username);
    }
}
