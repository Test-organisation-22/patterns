package codeexamples.lambdas;

import java.io.IOException;
import java.io.OutputStream;

public interface MyInterface4 {

    void printIt(String text);

    default public void printTo(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Output Error");
        }
    }

    static void printToSOut(String s){
        System.out.println(s);
    }
}
