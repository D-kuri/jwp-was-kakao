package db;

import com.google.common.collect.Maps;
import model.user.User;

import java.util.Collection;
import java.util.Map;

public class DataBase {
    private static Map<String, User> users = Maps.newHashMap();

    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static User findUserById(String userId) {
        return users.get(userId);
    }

    public static void remove(String userId) {
        users.remove(userId);
    }

    public static Collection<User> findAll() {
        return users.values();
    }
}
