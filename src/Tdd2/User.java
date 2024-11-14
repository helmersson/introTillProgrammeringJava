package Tdd2;

public class User {

    private String userName;
    private String password;
    private String typeOfUser;
    private int logins;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        typeOfUser = "normal";
        logins = 0;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String newUserName) {
        if (newUserName.length() >= 4) {
            userName = newUserName;
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 7 && newPassword.length() <= 20 && newPassword.matches(".*[!$#&].*")) {
            password = newPassword;
        }
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String newTypeOfUser) {
        if (newTypeOfUser.equals("normal") || newTypeOfUser=="super" || newTypeOfUser=="admin") {
            typeOfUser = newTypeOfUser;
        }

    }
    public void login() {
        logins++;
        if(logins>=20) {
            typeOfUser = "gold member";
        }

        typeOfUser = "gold member";
    }
}
