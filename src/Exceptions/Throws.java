package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader k = new FileReader(new File("c://abc.txt"));
    }
}

