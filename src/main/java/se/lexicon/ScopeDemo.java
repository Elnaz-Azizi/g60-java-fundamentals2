package se.lexicon;

public class ScopeDemo {

    // 1. CLASS-LEVEL SCOPE (Fields)
    int classVariable = 10;

    /**
     * This method shows how local variables work.
     * Think of it like a private conversation: what happens inside stays inside.
     */
    public void myMethod(int parameter) {
        // 2. METHOD-LEVEL SCOPE (Local Variable)
        int methodVariable = 20;

        System.out.println("Method variable: " + methodVariable);
        System.out.println("Class variable: " + classVariable);

        // 3. BLOCK-LEVEL SCOPE
        if (methodVariable > 10) {
            int blockVariable = 30;
            System.out.println("Inside the block: " + blockVariable);
        }

       // System.out.println(blockVariable);
    }
}
