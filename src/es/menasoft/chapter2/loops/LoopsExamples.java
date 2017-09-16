package es.menasoft.chapter2.loops;

public class LoopsExamples {

    public void emptyForStatement() {
        for (; ; ) {
            System.out.println("Running!!");
        }
    }

    public static void main(String[] args) {

        LoopsExamples loopsExamples = new LoopsExamples();

        if (args == null || args.length == 0) {
            System.out.println("No examples");
            return;
        }

        switch (args[0]) {
            case "example1":
                loopsExamples.emptyForStatement();
                break;
        }
    }
}
