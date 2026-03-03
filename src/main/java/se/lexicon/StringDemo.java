package se.lexicon;

public class StringDemo {
    static void main() {
ex2();
    }

    public static void ex1() {
        String message = "Java Programming is Fun!";
        System.out.println("--indexOf()--");
           int firstP = message.indexOf("P");
           System.out.println(firstP);

        int firstGram = message.indexOf("gram");
        int secondA = message.indexOf('a', 2);
        int missing = message.indexOf("Python");

        System.out.println("Where is 'gram'? " + firstGram);
        System.out.println("Where is the 2nd 'a'? " + secondA);
        System.out.println("Is 'Python' here? " + missing);

        // 2. substring() Examples (Overloaded)
        System.out.println("\n-- substring() --");
        String language = message.substring(0, 4); // start is included and end is excluded. java
        String topic = message.substring(5, 16);
        String remainder = message.substring(17);

        System.out.println("The language is: " + language);
        System.out.println("The topic is: " + topic);
        System.out.println("The rest is: " + remainder);

    }

    public static void ex2() {
        String oldWay = "This is the old way. " +
                "It requires concatenation " +
                "and manual newline characters.";

        // Text block
        String newWay = """
                This is a Text Block.
                It preserves the line breaks
                and makes the code look exactly like the output.
                """;

        System.out.println("--- OLD WAY ---");
        System.out.println(oldWay);
        System.out.println("\n--- NEW WAY ---");
        System.out.println(newWay);
    }



}
