import java.util.Objects;

public class NoteBook {
    // Создаем поля классов
    private String name;
    private Integer ramMemory;
    private Integer hardDrive;
    private String operatingSystem;
    private String color;


    //Создаем конструктор, который принимает в себя аргументы
    public NoteBook(String name, Integer ramMemory, Integer hardDrive, String operatingSystem, String color) {
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.name = name;
    }

    public NoteBook(Integer ramMemory, Integer hardDrive, String operatingSystem, String color) {
        this("",ramMemory, hardDrive, operatingSystem, color);

    }

    public Integer getRamMemory() {
        return ramMemory;
    }

    public Integer getHardDrive() {
        return hardDrive;

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor(){
        return color;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRamMemory(Integer ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof NoteBook)){
            return false;
        }
        NoteBook noteBook = (NoteBook) obj; //операция приведения типа obj в NoteBook
        return getRamMemory().equals(noteBook.getRamMemory())
                && getHardDrive().equals(noteBook.getHardDrive())
                && getOperatingSystem().equals(noteBook.getOperatingSystem())
                && getColor().equals(noteBook.getColor());

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ramMemory, hardDrive, operatingSystem, color);

    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", ramMemory=" + ramMemory +
                ", hardDrive=" + hardDrive +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
