import java.util.*;
import java.io.*;
import java.io.Serializable;

class User implements Serializable {
    public String name;
    transient String password;

}

public class TransientKeyword{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        User user =new User();
        user.name=sc.next();
        user.password=sc.next();
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("TransientKeyword.txt"));
        objectOutputStream.writeObject(user);
        ObjectInputStream objectInputStream= new ObjectInputStream((new FileInputStream("TransientKeyword.txt")));
        User retrieved = (User) objectInputStream.readObject();
        System.out.println(retrieved.name);
        System.out.println(retrieved.password);

    }
}