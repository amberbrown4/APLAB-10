import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ParticipantsArea extends JPanel{
    private ArrayList<String> users;
    private JList<String> usersList;

    public ParticipantsArea(){
        this.setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("Online People");
        this.add(jLabel,BorderLayout.NORTH);
        usersList= new JList<String>();
        this.add(usersList,BorderLayout.CENTER);
        //usersList = new JList<>();
        users = new ArrayList<>();
    }
    public void addUser(String user){
        users.add(user);
        usersList.setListData(this.users.toArray(new String[users.size()]));
        this.setVisible(true);
    }
    public void removeUser(String user){
        users.remove(user);
        usersList.setListData(this.users.toArray(new String[users.size()]));
        this.setVisible(true);

    }
}
