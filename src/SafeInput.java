import java.util.Scanner;
public class SafeInput {
    public static int getRangedInt(Scanner sc, String prompt, int low, int high) {
        int retInt = 0;
        boolean isValid = false;
        do {
            System.out.println("\n"+ prompt + " In the range [" + low + " - " + high + "]: ");

            while(!sc.hasNextInt()){
                System.out.println("[Error]: Invalid Number");
                System.out.println(prompt + " In the range [" + low + " - " + high + "]: ");
                sc.next();
            }
            retInt = sc.nextInt();
            isValid = retInt >= low && retInt <= high ? true : false;
            if(!isValid){
                System.out.println("[Error]: Integer out of range");
            }

        }while(!isValid);
        return retInt;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean isValid = false;
        String retString;
        do {
            System.out.println(prompt + ": ");
            retString = pipe.nextLine().trim().toLowerCase();
            if (retString.equals("y")) {
                isValid = true;
            } else if (retString.equals("n")) {
                isValid = true;
            }

        } while (!isValid);
        return retString.equals("y");
    }


}
