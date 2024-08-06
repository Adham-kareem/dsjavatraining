import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> myfriends = new HashMap<>();
        //adding the friends name with age
        myfriends.put("a",21);
        myfriends.put("b",22);
        myfriends.put("c",23);
        myfriends.put("d",19);
        myfriends.put("a",2);
        System.out.println(myfriends);
        for (String name : myfriends.keySet()){
            System.out.println(name);
        }

        for(int age : myfriends.values()){
            System.out.println(age);
        }
        //to access the specific value from hashmap
        System.out.println(myfriends.get("b"));

    }
}
