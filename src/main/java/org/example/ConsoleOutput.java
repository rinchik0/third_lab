package org.example;

public class ConsoleOutput implements Output {
    @Override
    public void print(int number) {
        System.out.print(number);
    }

    @Override
    public void println(int number) {
        System.out.println(number);
    }

    @Override
    public void print(String line) {
        System.out.print(line);
    }

    @Override
    public void println(String line) {
        System.out.println(line);
    }
}
