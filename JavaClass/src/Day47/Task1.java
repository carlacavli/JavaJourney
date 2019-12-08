package Day47;

import Day47.Tasks.Task1.AbstractLogin;
import Day47.Tasks.Task1.AdminLogin;
import Day47.Tasks.Task1.ManagerLogin;
import Day47.Tasks.Task1.UserLogin;

public class Task1 {
    public static void main(String[] args) {
        AbstractLogin admin = new AdminLogin();
        AbstractLogin manager = new ManagerLogin();
        AbstractLogin user = new UserLogin();
        admin.testLogin();
        manager.testLogin();
        user.testLogin();

    }
}
