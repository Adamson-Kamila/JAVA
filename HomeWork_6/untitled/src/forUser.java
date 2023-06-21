import java.util.Locale;
import java.util.Scanner;

public class forUser {
    private NoteBook noteBook;

    public forUser() {
        this.noteBook = new NoteBook(null, null, null, null);
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBook noteBook) {
        this.noteBook = noteBook;
    }

    public NoteBook findNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ramMemory ");
        Integer memory = scanner.nextInt();
        getNoteBook().setRamMemory(memory);

        System.out.println("Введите hardDrive ");
        Integer drive = scanner.nextInt();
        getNoteBook().setHardDrive(drive);


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите operatingSystem ");
        String system = scanner1.nextLine();
        getNoteBook().setOperatingSystem(system.toLowerCase());

        System.out.println("Введите color ");
        String col = scanner1.nextLine();
        getNoteBook().setColor(col.toLowerCase());
        scanner1.close();



        return getNoteBook();
    }






}








