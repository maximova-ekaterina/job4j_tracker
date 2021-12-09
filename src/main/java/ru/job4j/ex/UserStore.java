package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login)
            throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = users[i];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User is not found");
        }
        return rsl;
    }

    public static boolean validate(User user)
        throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid User");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Rainhold Messner", true)
        };
        try {
            User user = findUser(users, "Rainhold Messner");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            ex.printStackTrace();
            System.out.println("User is not valid");
        } catch (UserNotFoundException ec) {
            ec.printStackTrace();
            System.out.println("User not found");
        }
    }
}
