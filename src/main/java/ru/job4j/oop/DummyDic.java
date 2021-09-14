package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String sentence = "Неизвестное слово. " + eng;
        System.out.println(sentence);
        return sentence;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        word.engToRus("Name");
    }
}
