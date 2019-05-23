public class Exercise1 {

    public boolean login(String username, String password) {

       if (username.length() == 0 || password.length() == 0) {
           return false;
       }
        if (username.length() > 30 || password.length() > 30) {
           return false;
        }
        return checkLogininDB(username, password);
    }


    public boolean checkLogininDB(String username, String password) {

        if (username == "user" && password == "pass")
            return true;
        else
            return false;
    }
}

