import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Map<Integer, List<Integers>> newMap = new Map<>(20, new ArrayList<Integers>(Arrays.asList(new Integers("1"))));
        newMap.addEntry(30, new ArrayList<Integers>(Arrays.asList(new Integers("2"))));
        newMap.addEntry(40, new ArrayList<Integers>(Arrays.asList(new Integers("3"))));
        newMap.addEntry(50, new ArrayList<Integers>(Arrays.asList(new Integers("4"))));
        newMap.addEntry(60, new ArrayList<Integers>(Arrays.asList(new Integers("5"))));
        newMap.viewMap();
        newMap.removeEntry(30);
        newMap.viewMap();
        newMap.removeByKey(60);
        newMap.viewKeys();
       newMap.viewValuesList();
        newMap.viewMap();

        Map<String, Integer> newMap1 = new Map<>("20", 1);
        newMap1.addEntry("30", 2);
        newMap1.addEntry("40", 3);
        newMap1.addEntry("50", 4);
        newMap1.addEntry("60", 5);
        newMap1.viewMap();
        newMap1.removeEntry("20");
        newMap1.viewMap();
        newMap1.removeByKey("30");
        newMap1.viewKeys();
        newMap1.viewValuesList();
        newMap1.viewMap();

    }


    /*Якщо я правильно зрузмів завдання. Ми в List<Integer> не можемо передати стрінговий обьект, але ми можемо його
    * перетворити до потрібного. Якщо буде введено стрічку накшталт "21" або "3" то проблем не буде, але при  "ф21"
    * виникне NumberFormatException
    */

    public static class Integers {
        Integer integer;

        public Integers(String integer) {
            this.integer = Integer.parseInt(integer);
        }

        public Integer getInteger() {
            return integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }

        @Override
        public String toString() {
            return integer.toString();
        }
    }


}
