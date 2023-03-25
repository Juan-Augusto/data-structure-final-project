import java.util.Date;
import java.util.Scanner;

public class Contact {
    int code;
    String name, phoneNumber, birthDate, email, cellphone;
    public static int stringToNumber(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digitValue = c - 'a' + 1;
            num = num + digitValue;
        }
        return num;
    }

    public Contact( String name, String phoneNumber, String birthDate, String email, String cellphone) {
        this.code = stringToNumber(name);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
