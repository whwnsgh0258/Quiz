import java.util.Scanner;

public class Daily0611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별: ");
        String gender = sc.nextLine();
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("번호: ");
        String phoneNumber = sc.nextLine();
        System.out.print("주소: ");
        String address = sc.nextLine();
        System.out.print("취미: ");
        String hobby = sc.nextLine();
        MyInformation myInformation = new MyInformation(age, gender, name, phoneNumber, address, hobby);
        myInformation.printAge();
        myInformation.printGender();
        myInformation.printName();
        myInformation.printPhoneNumber();
        myInformation.printAddress();
        myInformation.printHobby();

        sc.close();
    }
}
