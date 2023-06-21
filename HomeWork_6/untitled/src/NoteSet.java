import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoteSet {

    Set<NoteBook> set; //объявляем о создании множество NoteBook

    //Конструктор на основании имеющегося множества
    public NoteSet(Set<NoteBook> set) {
        this.set = set;
    }

    public NoteSet() {
        this(new HashSet<>()); //вызываем конструктор NoteBookSet передаем в него new HashSet
    }

    public Set<NoteBook> getSet() { //возвращаем множество
        return set;
    }

    public void setSet(Set<NoteBook> set) { //устанавливает множество (замена)
        this.set = set;
    }

    public void addInSet(NoteBook noteBook) { //метод добавления
        set.add(noteBook);
    }

    public NoteBook find(NoteBook noteBookFilter) { //метод поиска

        for (NoteBook item : getSet()) {
            if (item.equals(noteBookFilter)) {
                return item;
            }

        }
        return null; // на случай если не обнаружено
    }

    @Override
    public String toString() {
        return "NoteSet{" +
                "set=" + set +
                '}';
    }
}
