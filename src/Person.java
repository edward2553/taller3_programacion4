public class Person {
    private String name;
    private String lastName;
    private String documentType;
    private String document;
    private String place;
    private String phone;
    private String nacionality;
    private String email;
    private String confirmEmail;
    private String password;
    private String confirmPassword;
    private Boolean emailWroteError;

    public Person(){

    }

    public Person(String name, String lastName, String documentType, String document, String place, String phone,
                  String nacionality, String email, String confirmEmail, String password,
                  String confirmPassword, Boolean emailWroteError) {
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.document = document;
        this.place = place;
        this.phone = phone;
        this.nacionality = nacionality;
        this.email = email;
        this.confirmEmail = confirmEmail;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.emailWroteError = emailWroteError;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Boolean getEmailWroteError() {
        return emailWroteError;
    }

    public void setEmailWroteError(Boolean emailWroteError) {
        this.emailWroteError = emailWroteError;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", document='" + document + '\'' +
                ", place='" + place + '\'' +
                ", phone='" + phone + '\'' +
                ", nacionality='" + nacionality + '\'' +
                ", email='" + email + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", emailWroteError=" + emailWroteError +
                '}';
    }
}
