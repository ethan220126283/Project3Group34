package za.ac.cput.classcommunicator.ui;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class libraryGUI extends JFrame {
    private JPanel pnlMain;
    private JPanel pnlView;
    private JTabbedPane tbpnlView;
    private JPanel pnlBookline;
    private JTable booklineTable;
    private JButton booklineReturn;
    private JButton borrowButton;
    private JTextField booklineSearchText;
    private JPanel pnlLibrarian;
    private JPanel pnlItem;
    private JPanel pnlMember;
    private JButton addLibrarianButton;
    private JButton deleteLibrarianButton;
    private JTextField librarianSearchText;
    private JTable librarianTable;
    private JButton addItemButton;
    private JButton deleteLibrarianButton1;
    private JButton addMemberButton;
    private JButton deleteMemberButton;
    private JTextField memberSearchText;
    private JTextField itemSearchText;
    private JTable memberTable;
    private JTable itemTable;

    public libraryGUI() {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMain);
        this.pack();
    }
}
