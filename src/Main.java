import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input = ""; //Todo: Insert String to sort!
        input = input.toLowerCase();
        ArrayList<String> output = new ArrayList<String>();
        String[] save = input.split(" ");
        String text;

        Arrays.sort(save);

        output.add(save[0]);

        for(int i = 1; i < save.length; i++) {

            text = save[i];
            boolean test = false;

            for (String s : output) {

                if (s.equals(text)) {

                    test = true;

                    break;
                }

            }

            if(!test){

                output.add(text);

            }

        }

        for(String outtxt : output){

            System.out.println(outtxt);

        }

    }
}
