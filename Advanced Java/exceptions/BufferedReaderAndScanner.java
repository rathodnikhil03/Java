package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BufferRead {

    public void show() throws IOException {

        System.out.print("Enter the id : ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

    }
}

public class BufferedReaderAndScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BufferRead br = new BufferRead();

        try {

            br.show();

            number();

            System.out.print("Enter the name : ");
            String name = input.next();
            System.out.println(name);
            input.close();

        } catch (IOException e) {
            System.out.println("Something is worng" + e);
        }

    }

    static void number() throws IOException {

        System.out.print("Enter the number : ");
        int num = System.in.read();
        System.out.println(num);
    }
}