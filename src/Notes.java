import java.util.Arrays;
import java.util.Scanner;

public class Notes extends MyPhone{

   private static String[] notes = new String[100];

    private static int notesCount = 0;

    public static String[] getNotes() {
        return notes;
    }

    public static void setNotes(String[] notes) {
        Notes.notes = notes;
    }

    public static int getNotesCount() {
        return notesCount;
    }

    public static void setNotesCount(int notesCount) {
        Notes.notesCount = notesCount;
    }

    public void addNote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Записать заметку");
        String note = scanner.nextLine();
        notes[notesCount++] = note;
        System.out.println("Заметка добавлено!");
    }

    public void printNotes(){
        for (int i = 0; i < notesCount; i++) {
            System.out.println((i + 1 )+ "."+ notes[i]);

        }
    }

    public void deleteNote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую заметку удалить?");
        int indexDelete  = scanner.nextInt();
        if(indexDelete > 0 && indexDelete <= notesCount) {
            for (int i = indexDelete - 1; i < notesCount - 1; i++) {
                notes[i] = notes[i +1];

            }
            notesCount--;
            System.out.println("Удалено.");

        }else{
            System.out.println("Неправильный номер");
        }
    }
}
