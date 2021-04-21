package com.lab.model;

import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class SaveLoad {
    public static BookEntity[] load() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));
        return (BookEntity[]) ois.readObject();
    }

    public static void save(BookEntity[] storage) throws IOException, NullPointerException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
        oos.writeObject(storage);
        oos.close();
    }

    public static void saveSearchResult(String[] result) throws IOException {
        FileWriter writer = new FileWriter(new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath(), "saved_books.txt"), false);
        for (String line : result) {
            writer.append(line);
        }
        writer.flush();
    }
}
