import java.util.Scanner;

public class MyInformation {
    private int age;
    private String gender;
    private String name;
    private String phoneNumber;
    private String address;
    private String hobby;

    public MyInformation(int age, String gender, String name, String phoneNumber, String address, String hobby) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.hobby = hobby;
    }

    public void printAge() {
        if (age >= 18) {
            System.out.println("나이: 만" + age + "세 성인!");
        } else {
            System.out.println("나이: 만" + age + "세 응애!");
        }
    }

    public void printGender() {
        if (gender.equals("남") || gender.equals("male") || gender.equals("남자")) {
            System.out.println("성별: " + gender);
        } else if (gender.equals("여") || gender.equals("female") || gender.equals("여자")){
            System.out.println("성별: " + gender);
        }else {
            System.out.println("??");
        }
    }

    public void printName() {
        System.out.println("이름: " + name);
    }

    public void printPhoneNumber() {
        System.out.println("전화 번호: " + phoneNumber);
    }

    public void printAddress() {
        System.out.println("주소: " + address);
    }

    public void printHobby() {
        System.out.println("취미: " + hobby);
    }
}
