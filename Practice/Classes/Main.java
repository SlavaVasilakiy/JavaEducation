import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> good2count = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        for(;;)
        {
            String goodName = scanner.nextLine();

            if (goodName.equals("LIST")) {
                printMap(good2count);
                continue;
            }

            int count = 1;

            if(good2count.containsKey(goodName)) {
                count = good2count.get(goodName) + 1;
            }
            good2count.put(goodName, count);
        }
    }

    public static  void printMap(Map<String, Integer> map) {
        for(String key : map.keySet())
        {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
