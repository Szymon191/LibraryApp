package libraryapp.libraryapp.users;

import java.util.ArrayList;

public  class  User {

    public static ArrayList<User> users = new ArrayList<>();
    private String name;
    private String surname;
    private String email;
    private String tel_nr;
    private String nickname;
    private String password;

    public User(String name, String surname, String email, String tel_nr, String nickname, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.tel_nr = tel_nr;
        this.nickname = nickname;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getTel_nr() {
        return tel_nr;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", tel_nr='" + tel_nr + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
