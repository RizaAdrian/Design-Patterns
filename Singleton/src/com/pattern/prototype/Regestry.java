package com.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Regestry {

    private static Map<String, Item> itemMap = new HashMap<>();

    public Regestry(){
        loadItems();
    }

    public Item createItem (String type) throws CloneNotSupportedException {
        Item item = (Item) itemMap.get(type).clone();
        return item;
    }

    public static void loadItems(){
        AudioBook audioBook = new AudioBook();
        audioBook.setTitle("The Da Vinci Code");
        audioBook.setPrice(12.5);
        audioBook.setRuntime("18 hours");
        itemMap.put("AudioBook1",audioBook);

        Book book = new Book();
        book.setTitle("Java Interview");
        book.setPrice(4.99);
        book.setNumberOfPages(112);

        itemMap.put("Book1", book);
    }
}
