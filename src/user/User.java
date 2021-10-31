package user;

public class User {

    private String userName;
    private String password;

    public User(String myUserName, String myPassword) {
        userName = myUserName;
        password = myPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void updateUserName(String newUserName) {

        if(newUserName.length()>=4) {
            userName = newUserName;
        }

    }

    public void updatePassword(String newPassword) {


        if(newPassword.length()>=7 && newPassword.length()<21) {
            password = newPassword;
        }
    }
}
