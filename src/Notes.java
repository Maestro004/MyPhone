import java.util.Arrays;
import java.util.Scanner;

public class Notes extends MyPhone{

   private String text;

    public Notes() {
    }

    public static String[] name = {};

    public Notes(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;

    }
    public String[] notes () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Запишите заметки ");
        String soz = scanner.nextLine();
        name = Arrays.copyOf(name,name.length+1);
        name[name.length - 1] = soz;
        System.out.println(Arrays.toString(name));
        return name;

    }
}
