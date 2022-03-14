import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Scanner in1 = new Scanner(new File(in.next()));
        while (in1.hasNextLine())
            list.add(Integer.valueOf(in1.nextLine()));

        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        double mediumNum = Math.round(sum / list.size());
        int roundNum = 0;
        for (Integer integer : list) {
            roundNum += Math.abs(integer - mediumNum);
        }
        System.out.println(roundNum);

    }
}