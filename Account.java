public class Account {
    String firstname, lastname;
    String email, password;
    int smartaccess, savings;

    Account(String f, String l, String e, String p) {
        firstname = f;
        lastname = l;
        email = e;
        password = p;
    }

    public String getemail(){
        return email;
    }
    public String getPassword() {
        return password;
    }
}
