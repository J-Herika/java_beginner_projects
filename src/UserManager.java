import java.util.ArrayList;
import java.util.HashMap;

public class UserManager {
    private ArrayList<String> bannedNames = new ArrayList<>();
    private HashMap<Integer, String> activeUsers = new HashMap<>();

    public UserManager() {
        // Pre-fill banned list
        bannedNames.add("admin");
        bannedNames.add("null");
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

    public void getUser(int id) {
        // Your logic here...
    }
}
