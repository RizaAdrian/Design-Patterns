package com.pattern.prototype;

public class PrototypeExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Regestry.loadItems();
        Regestry regestry = new Regestry();
        AudioBook audioBook = (AudioBook) regestry.createItem("AudioBook1");
        audioBook.setTitle("Hibernate high performance");

        System.out.println(audioBook);
        System.out.println(audioBook.getRuntime());
        System.out.println(audioBook.getTitle());
        System.out.println(audioBook.getRuntime());

        AudioBook secondAudioBook = (AudioBook) regestry.createItem("AudioBook1");
        secondAudioBook.setTitle("Spring Course");

        System.out.println(secondAudioBook);
        System.out.println(secondAudioBook.getRuntime());
        System.out.println(secondAudioBook.getTitle());
        System.out.println(secondAudioBook.getRuntime());
    }
}
