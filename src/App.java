import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class App {
    private JPanel mainPanel;
    private JButton submitButton;
    private JTextField nameField;
    private JTextField lastnameField;
    private JLabel registerLabel;
    private JLabel nameLabel;
    private JLabel lastnamesLabels;
    private JComboBox idField;
    private JTextField idNumberField;
    private JTextField phone;
    private JComboBox nationalityField;
    private JComboBox placeLiveField;
    private JTextField emailField;
    private JTextField confirmEmailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JCheckBox checkData;
    private JCheckBox checkTermAndConditions;
    private JLabel nameError;
    private JLabel lastnameError;
    private JLabel idError;
    private JLabel idNumberError;
    private JLabel placeLiveError;
    private JLabel phoneError;
    private JLabel nationalityError;
    private JLabel emailError;
    private JLabel confirmEmailError;
    private JLabel passwordError;
    private JLabel confirmPasswrodError;
    private Boolean hasError = false;
    private Boolean emailWroteError = false;
    public ArrayList<Person> arrPerson = new ArrayList<>();

    public App() {
        String selectLabel = "Seleccione";
        String ids[] = {selectLabel, "Cedula de ciudadania", "Cedula de extranjeria", "Pasaporte"};
        idField.addItem(ids[0]);
        idField.addItem(ids[1]);
        idField.addItem(ids[2]);
        idField.addItem(ids[3]);

        String places[] = {selectLabel,"Amazonas", "Antioquia", "Arauca", "Atlantico", "Bogota", "Bolivar", "Boyaca°", "Caldas", "Caqueta°", " Choco"};
        placeLiveField.addItem(places[0]);
        placeLiveField.addItem(places[1]);
        placeLiveField.addItem(places[2]);
        placeLiveField.addItem(places[3]);
        placeLiveField.addItem(places[4]);
        placeLiveField.addItem(places[5]);
        placeLiveField.addItem(places[6]);
        placeLiveField.addItem(places[7]);
        placeLiveField.addItem(places[8]);
        placeLiveField.addItem(places[9]);
        placeLiveField.addItem(places[10]);

        nationalityField.addItem(selectLabel);
        nationalityField.addItem("Colombiano (a)");
        nationalityField.addItem("Otro");

        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
//                Minimo dos digitos, no incluir numeros ni caracteres especiales
                if (!nameField.getText().matches("[a-zA-Z]{2,}")) {
                    hasError = true;
                    nameError.setText("El campo debe contener minimo dos digitos y no incluir numeros ni caracteres especiales");
                } else {
                    hasError = false;
                    nameError.setText("");
                }
            }
        });
        lastnameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!lastnameField.getText().matches("[a-zA-Z]{2,}")) {
                    hasError = true;
                    lastnameError.setText("El campo debe contener minimo dos digitos y no incluir numeros ni caracteres especiales");
                } else {
                    hasError = false;
                    lastnameError.setText("");
                }
            }
        });
        idNumberField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!idNumberField.getText().matches("^[0-9]{6,10}$")) {
                    hasError = true;
                    idNumberError.setText("El campo debe contener entre 6 y 10 digitos e incluir solo numeros");
                } else {
                    hasError = false;
                    idNumberError.setText("");
                }
            }
        });
        phone.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!phone.getText().matches("^[0-9]{9,}$")) {
                    hasError = true;
                    phoneError.setText("El campo debe contener minimo 9 digitos e incluir solo numeros");
                } else {
                    hasError = false;
                    phoneError.setText("");
                }
            }
        });
        emailField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!emailField.getText().matches("^\\S+@\\S+\\.\\S+$")) {
                    hasError = true;
                    emailError.setText("Verificar el correo elecronico ingresado");
                } else {
                    hasError = false;
                    emailError.setText("");
                }
            }
        });
        confirmEmailField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!confirmEmailField.getText().matches("^\\S+@\\S+\\.\\S+$")) {
                    hasError = true;
                    confirmEmailError.setText("Verificar el correo elecronico ingresado");
                } else {
                    hasError = false;
                    confirmEmailError.setText("");
                }
            }
        });
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!String.valueOf(passwordField.getPassword())
                        .matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")
                    ) {
                    hasError = true;
                    passwordError.setText("La contrase√±a debe tener al menos 8 caracteres, una minuscula, una mayuscula y un numero");
                } else {
                    hasError = false;
                    passwordError.setText("");
                }
            }
        });
        confirmPasswordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!String.valueOf(confirmPasswordField.getPassword())
                        .matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")
                ) {
                    hasError = true;
                    confirmPasswrodError.setText("La contrase√±a debe tener al menos 8 caracteres, una minuscula, una mayuscula y un numero");
                } else {
                    hasError = false;
                    confirmPasswrodError.setText("");
                }
            }
        });
        confirmPasswordField.addKeyListener(new KeyAdapter() {
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                if (String.valueOf(confirmPasswordField.getPassword()) != String.valueOf(passwordField.getPassword())){
//                    hasError = true;
//                    confirmPasswrodError.setText("Las contrase√±as deben coincidir");
//                }
//                if (emailField.getText() != confirmEmailField.getText()) {
//                    hasError = true;
//                    confirmEmailError.setText("Los correos no coinciden");
//                }

                System.out.println(passwordField.getPassword());
                System.out.println(confirmPasswordField.getPassword());
                if (hasError) {
                    JOptionPane.showMessageDialog(null,"Revisa el Formulario con los errores", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }else if(!emailField.getText().equals(confirmEmailField.getText())){
                    emailWroteError = true;
                    JOptionPane.showMessageDialog(null,"Los correos no coinciden", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }else if(passwordField.getPassword().length != confirmPasswordField.getPassword().length){
                    JOptionPane.showMessageDialog(null,"Las contraseÒas no coinciden", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Ingresado con exito");

                    Person person = new Person(nameField.getText(), lastnameField.getText(), idField.getSelectedItem().toString(),
                            idNumberField.getText(), placeLiveField.getSelectedItem().toString(), phone.getText(),
                            nationalityField.getSelectedItem().toString(), emailField.getText(), confirmEmailField.getText(),
                            passwordField.getPassword().toString(), confirmPasswordField.getPassword().toString(), emailWroteError);
                    TestPerson testPerson = new TestPerson();
                    testPerson.savePerson(person, arrPerson);
                    testPerson.showErrorWhileWroteEmail(arrPerson);
                    testPerson.showPersonWithDocumentTypeCEAndPas(arrPerson);
                    testPerson.showPromNationaOther(arrPerson);

                    nameField.setText("");
                    lastnameField.setText("");
                    idField.setSelectedIndex(0);
                    idNumberField.setText("");
                    placeLiveField.setSelectedIndex(0);
                    phone.setText("");
                    nationalityField.setSelectedIndex(0);
                    emailField.setText("");
                    confirmEmailField.setText("");
                    passwordField.setText("");
                    confirmPasswordField.setText("");
                    emailWroteError = false;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        JPanel mainPanel = new App().mainPanel;
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
