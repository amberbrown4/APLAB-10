import javax.swing.*;

public class ChatArea extends JTextArea {
    private static final int ROWS = 10, COLUMNS = 30;
    public ChatArea(){
        super(ROWS,COLUMNS);
        this.setEditable(false);
        this.setLineWrap(true);
    }
    public void addMessage(String userName,String textMessage){
        this.append(userName);
        this.append("   :   ");
        this.append(textMessage);
        this.append("\n");
        this.setVisible(true);
    }
}
