package es.menasoft.chapter2.switches;

import java.util.Arrays;
import java.util.Objects;

public class Switches {


    public void extrangeExample() {
        int dayOfWeek = 5;
        System.out.println("======= Extrange Example: " + dayOfWeek + " =======");
        extrangeExampleSwitch(dayOfWeek);

        dayOfWeek = 0;
        System.out.println("======= Extrange Example: " + dayOfWeek + " =======");
        extrangeExampleSwitch(dayOfWeek);

        dayOfWeek = 6;
        System.out.println("======= Extrange Example: " + dayOfWeek + " =======");
        extrangeExampleSwitch(dayOfWeek);
    }

    private void extrangeExampleSwitch(int value) {
        switch (value) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }


    public static void main(String[] args) {

        Switches switches = new Switches();

        if (args == null || args.length == 0) {
            System.out.println("No example selected");
            return;
        }

        switch (args[0]) {
            case "example1":
                switches.extrangeExample();
                break;
            case "example2":
                break;
            default:
                break;
        }

    }
}
