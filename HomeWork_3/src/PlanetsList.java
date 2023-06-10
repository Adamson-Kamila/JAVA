import java.util.*;

public class PlanetsList {
    public static void main(String[] args) {
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */
        List<String>list = listPlanets(20);
        System.out.println(list);
        Map<String, Integer> countMap = countPlanets(list);
        System.out.println("Количество повторений каждой планеты: ");
        for (Map.Entry<String, Integer>entry:countMap.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }


    }
    static List<String> listPlanets(int size){
        List<String>planets = new ArrayList<>();
        Random random = new Random();
        String[] planet = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        for (int i = 0; i < size; i++) {
           int index = random.nextInt(planet.length);
           planets.add(planet[index]);
        }
        return planets;
    }
    static Map<String, Integer> countPlanets(List<String>list){
        Map<String, Integer> countMap = new HashMap<>();
        for (String planet: list) {
            int count = countMap.getOrDefault(planet, 0);
            countMap.put(planet, ++count);
        }
        return countMap;
    }

}
