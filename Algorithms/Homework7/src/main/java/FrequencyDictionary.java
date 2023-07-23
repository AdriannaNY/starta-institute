import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Привет мой мир";
        buildDictionary(text);
    }

        public static void buildDictionary(String text){
            text = text.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if ((ch >= 'а' && ch <= 'я') || ch == 'ё') {
                    map.compute(ch, (character, integer)
                            -> integer == null ? 1 : integer + 1);
                }
            }

            ArrayList<Map.Entry<Character, Integer>> entries =
                    new ArrayList<>(map.entrySet());
            entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
            for (Map.Entry<Character, Integer> entry : entries) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " time(s) in text");
            }
        }

    }

