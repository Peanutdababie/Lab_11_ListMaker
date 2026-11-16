import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    static void main() {
        //declarations

            Scanner input = new Scanner(System.in);

            ArrayList<String> list = new ArrayList<>();

            boolean done = false;

        do{
            String userInput = SafeInput.getNonZeroLenString(input,"Welcome to the Menu! " +
                    "Please input A to add an item, D to delete an item, I to insert an item, P to print the list " +
                    ", or Q to quit.");


            if(userInput.equalsIgnoreCase("A")) //User selected add item
            {
                list.add(addItem(""));

                //System.out.println(list);
            } else if (userInput.equalsIgnoreCase("D")) {
               list.remove(SafeInput.getInt(input,"Using the item's number position, " +
                       "which item will you delete?"));

                //System.out.println(list);
            } else if (userInput.equalsIgnoreCase("I")) {

            } else if (userInput.equalsIgnoreCase("P")) {

            }else if (userInput.equalsIgnoreCase("Q")) {
                done = SafeInput.getYNConfirm(input,"Are you sure you want to quit?");
            }

        }while(done);
        System.out.println("Goodbye!");
    }

    public static String addItem(String item) {
        Scanner input = new Scanner(System.in);
        boolean done = false;

        do {
            item = SafeInput.getNonZeroLenString(input,"Please input the name of the item you want to be added.");

            System.out.println("You've just added " + item + ".");

             done = SafeInput.getYNConfirm(input,"Would you like to add another item?");

        }while (done);


        return item;
    }

    public static int deleteItem(int itemNum) {

        return itemNum;
    }

    public static int insertItem(int itemNum) {

        return itemNum;
    }

    public static String displayList(String item) {

        return item;
    }
}
