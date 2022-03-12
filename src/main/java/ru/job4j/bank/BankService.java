package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> list = new ArrayList<>();
        if (!users.containsKey(user)) {
            users.put(user, list);
        }
    }

    public void addAccount(String passport, Account account) {
        User client = findByPassport(passport);
        if (client != null && !users.get(client).contains(account)) {
            users.get(client).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User client = findByPassport(passport);
        if (client != null) {
            for (Account account : users.get(client)) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        if (account1 != null && account1.getBalance() >= amount) {
            account1.setBalance(account1.getBalance() - amount);
            account2.setBalance(account2.getBalance() + amount);
        }
        return rsl;
    }
}
