package programming.functional.streamapi;

import java.util.stream.IntStream;

class JavaStream {
    public static void main(String[] args) {
        System.out.println("practice.JavaStream tutorialsF");
        printIntStream();
    }

    static void printIntStream() {
        IntStream intStream = IntStream.range(0, 10);
        intStream.forEach(System.out::println);
    }
}