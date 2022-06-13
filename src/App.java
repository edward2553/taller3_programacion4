import javax.swing.*;

public class App extends JFrame {
    private JPanel mainPanel;
    private JButton submitButton;
    private JTextField nameField;
    private JTextField lastnameField;
    private JLabel registerLabel;
    private JLabel nameLabel;
    private JLabel lastnamesLabels;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField2;
    private JTextField textField4;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JCheckBox autorizoElTratamientoDeCheckBox;
    private JCheckBox aceptoLosTerminosYCheckBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        JPanel mainPanel = new App().mainPanel;
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
