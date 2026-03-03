package se.lexicon;

public class StringBuilderDemo {
    static void main() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append("!");
        System.out.println("After append:" + sb);

        sb.insert(6, "java");
        System.out.println("After insert: " + sb);

        // 4. DELETING
        sb.delete(11, 17);
        System.out.println("After delete: " + sb);

        // 5. REVERSING (Just for fun!)
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. CONVERTING BACK TO A NORMAL STRING
        String finalResult = sb.toString();
        System.out.println("Final String: " + finalResult);
    }
}
