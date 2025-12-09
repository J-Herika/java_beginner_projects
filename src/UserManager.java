import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserManager {
    private final ArrayList<String> bannedNames = new ArrayList<>();
    private final HashMap<Integer, String> activeUsers = new HashMap<>();

    public UserManager() {
        // Pre-fill banned list
        bannedNames.add("admin");
        bannedNames.add("null");
        bannedNames.add("root");

        updateBannedUsers();
    }

    public void registerUser(int id, String name) {
        // 1. Check if banned (using .contains)
        if (bannedNames.contains(name)) {
            System.out.println("Error: " + name + " is a banned username.");
            return;
        }

        // 2. Check if ID already exists (using .containsKey)
        if (activeUsers.containsKey(id)) {
            System.out.println("Error: ID " + id + " is already taken.");
            return;
        }

        // 3. Save to "Database"
        activeUsers.put(id, name);
        System.out.println("Success: Registered " + name);
    }

    public void updateBannedUsers(){
        bannedNames.clear();
        File file = new File("banned.txt");
        try(Scanner reader = new Scanner(file)){

            while(reader.hasNextLine()){
                String data = reader.nextLine();
                bannedNames.add(data);
            }

        } catch (FileNotFoundException e) {
            IO.println("ERROR: couldn't find file.\n" + e);
        }
    }

    public void banUser(int id){
        if(activeUsers.containsKey(id)){
            try(FileWriter fileWriter = new FileWriter("banned.txt",true)){
                fileWriter.write(activeUsers.get(id)+"\n");
                IO.println(activeUsers.get(id) + " is banned.");
            } catch (IOException e) {
                IO.println("Error: couldn't read file \n" + e);
            }
        }
        updateBannedUsers();
    }

    public ArrayList getBannedUsers(){
        return bannedNames;
    }

    public void removeBannedUsers(){
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<String> tempListNames = new ArrayList<>();
        for(int id : activeUsers.keySet()){
            if(bannedNames.contains(activeUsers.get(id))) {
                tempList.add(id);
                tempListNames.add(activeUsers.get(id));
            }
        }
        IO.print("Removed these banned users: ");
        for(String name : tempListNames){
            IO.print(" " + name + ",");
        }

        for(int id : tempList){
            activeUsers.remove(id);
        }
    }




    public void getUser(int id) {
        // Your logic here...
        if(activeUsers.containsKey(id)) IO.println(activeUsers.get(id));
        else IO.print("Error User is not registered.");
    }
}
