package lesson12.task2;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

//        Найти маршрут из заданного списка билетов
//        Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//
//        Выход:
//        Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London

        Map<String, String> map = new HashMap<>();
        map.put("Berlin", "London");
        map.put("Tokyo", "Seoul");
        map.put("Mumbai", "Berlin");
        map.put("Seoul", "Mumbai");

        // define start point
        String startCity = getStartCity(map);

        // define exit point
        System.out.println(getRoute(map, startCity));
    }


        public static String getStartCity(Map<String, String> map) {
            for (String city : map.keySet()) {
                if (!map.values().contains(city)) {
                    return city;
                }
            }
            return null;
        }

        public static String getRoute(Map<String, String> map, String startCity) {
            String tmp;
            StringBuilder sb = new StringBuilder();
            while (map.get(startCity) != null) {
                tmp = map.get(startCity); // landing city
                sb.append(startCity).append(" -> ").append(tmp).append(", ");
                startCity = tmp;
            }
            sb.setLength(sb.length() - 2); // delete last ", "
        // Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London
        return sb.toString();
        }


    }
