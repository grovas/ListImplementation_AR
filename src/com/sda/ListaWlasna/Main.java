package com.sda.ListaWlasna;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListImpl lista = new ListImpl();

        lista.addElement("test");
        lista.addElement("drugi test");
        lista.addElement("trzeci test");

        System.out.println(lista.toString());

        lista.printFromTheEnd();
        lista.printFromTheStart();

        lista.listSize();
        lista.removeElement("test");
    }
}
