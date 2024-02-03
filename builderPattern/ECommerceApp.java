import java.util.*;

public class ECommerceApp { //This is where customers/users create accounts
    public static void main(String[] args) {
        System.out.println("WELCOME TO E-COMMERCE APPLICATION!\n");

        List<User> userList = new ArrayList<>();

//--------------------~Creating Accounts goes here~-----------------//
        User user1 = new User.UserBuilder()
                .lastName("Belen")
                .firstName("Clark")
                .email("clarkbelen@gmail.com")
                .phone("09091234567")
                .address("QC")
                .age(20)
                .build();
        userList.add(user1);

        User user2 = new User.UserBuilder()
                .email("juand@gmail.com")
                .firstName("Juan")
                .lastName("Dela Cruz")
                .address("USA")
                .age(12)
                .build();
        userList.add(user2);

        User user3 = new User.UserBuilder()
                .lastName("Doe")
                .phone("83-652-601")
                .firstName("John")
                .build();
        userList.add(user3);


        User user4 = new User.UserBuilder()
                .lastName("Sanchez")
                .firstName("Jessica")
                .build();
        userList.add(user4);



//------------------~Displaying Accounts goes here~-----------------//

        System.out.println("--------------------------------");
        for(User user : userList){
            System.out.println("- USER'S INFORMATION -");
            System.out.println("First name: " + user.firstName);
            System.out.println("Last name: " + user.lastName);
            System.out.println("Age: " + ((user.age==null) ? "" : user.age));
            System.out.println("Address: " + user.address);
            System.out.println("Email: " + user.email);
            System.out.println("Phone: " + user.phone);
            System.out.print("Remarks: ");
            if ((user.firstName.isEmpty() || user.lastName.isEmpty()) ||
                    (user.email.isEmpty() && user.phone.isEmpty())) { //Real-life Validation check
                System.out.println("Invalid User\nFull name AND at least one contact detail are mandatory.");
            }
            else{
                System.out.println("Valid User");
            }
            System.out.println("--------------------------------");
        }
    }
}
