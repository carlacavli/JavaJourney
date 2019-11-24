package Day37.Example.Ex;

import Day37.Example.objects.Profile;
import Day37.Example.objects.User;

public class Ex3 {
    public static void main(String[] args) {


        User student = new User();
        student.login = "dos@techno.study";
        student.password = "123123qwe";

        Profile info = new Profile();
        info.address = "600 Getty";
        info.firstName = "Dos";
        info.lastName = "Dos";
        info.gender = "Male";
        info.phone = "+121568978";

        student.profile = info;
    }

}
