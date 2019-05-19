public class Main {
    public static void main(String[] args) {

        UserNameFrame userNameFrame = new UserNameFrame();
        ChatRoomGUI chatRoomGUI = new ChatRoomGUI();
        chatRoomGUI.addMessage("ih","hi");
        chatRoomGUI.addNewParticipant("mina");
        chatRoomGUI.addNewParticipant("ahmad");
        chatRoomGUI.removeParticipant("mina");
        chatRoomGUI.setVisible(true);
        }
}
