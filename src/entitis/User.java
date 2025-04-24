package entitis;

public class User {

    public String login;
    public String key;
    public int options;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setOptions(int options){
        this.options += options;

        if (options == 1){
            System.out.println(key);
        }
        else if (options == 2) {
            System.out.println(login);
        }
    }

}
