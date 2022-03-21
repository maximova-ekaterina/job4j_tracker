package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель банковской системы
 * @author EKATERINA MAKSIMOVA
 * @version 1.0
 */
public class BankService {
    /**
     * Класс имеет поле, которое содержит всех пользователей.
     * системы с привязанными к ним счетами.
     * Хранение пользователя и его реквизитов осуществляется
     * в коллекции типа HashMap.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его
     * в систему хранения.
     * При добавлении пользователя к нему по умолчанию добавляется
     * пустой список.
     * В методе есть проверка на отсутствие
     * добавляемого пользователя в системе.
     * @param user пользователь, который добавляется в систему.
     */
    public void addUser(User user) {
        List<Account> list = new ArrayList<>();
        users.putIfAbsent(user, list);
    }

    /**
     * Метод добавляет новый счет к пользователю.
     * В методе есть проверка на существование пользователя
     * в системе и отсутствии у него добавляемого счета.
     * @param passport паспорт пользователя, к которому добавляется
     *                 счет.
     * @param account новый счет пользователя.
     */
    public void addAccount(String passport, Account account) {
        User client = findByPassport(passport);
        if (client != null && !users.get(client).contains(account)) {
            users.get(client).add(account);
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     * @param passport паспорт пользователя.
     * @return возвращает пользователя и null если пользователь
     * не найден.
     */
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

    /**
     * Метод ищет пользователя по реквизитам.
     * В методе есть проверка на наличие искомого пользователя
     * в системе.
     * @param passport паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return возвращает реквизиты, либо null если
     * реквизиты не найдены.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User client = findByPassport(passport);
        if (client != null) {
            for (Account account : users.get(client)) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод осуществляет перечисление денег с одного
     * счета на другой.
     * В методе есть проверка на наличие счета, с которого переводят деньги
     * и конечного счета. А также на достаточность средств
     * для перевода на счете, с которого осуществляется перевод.
     * @param srcPassport паспорт пользователя, со счета которого
     *                    осуществляется перевод.
     * @param srcRequisite реквизиты пользователя, со счета которого
     *                     осуществляется перевод.
     * @param destPassport паспорт пользователя, на счет которого
     *                     осуществляется перевод.
     * @param destRequisite реквизиты пользователя, на счет которого
     *                      осуществляется перевод.
     * @param amount количество переводимых денег.
     * @return возвращает true если перевод произошел успешно
     * и false если счёт не найден или не хватает денег на счёте.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
        }
        return rsl;
    }
}
