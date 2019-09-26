package com.geekbrains.dz3;

public class Printer {
    private static final Object monitor = new Object();
    int max;
    String currentString = "Ping ";

    public Printer(int max) {
        this.max = max;
    }

    private void printPing() {
        synchronized (monitor) {
            try {
                for(int i = 0; i < max; i++) {
                    while(!currentString.equals("Ping ")) {
                        monitor.wait();
                    }
                    System.out.print(currentString);
                    currentString = "pong";
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printPong() {
        synchronized (monitor) {
            try {
                for(int i = 0; i < max; i++) {
                    while(!currentString.equals("pong")) {
                        monitor.wait();
                    }
                    System.out.println(currentString);
                    currentString = "Ping ";
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final Printer printer = new Printer(10);
        new Thread(printer::printPing).start();
        new Thread(printer :: printPong).start();
    }
}
