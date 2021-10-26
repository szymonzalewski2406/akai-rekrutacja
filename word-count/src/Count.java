import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {
    static void wordFinder(String[] array){
        Map<String, Integer> unsortedWords = new HashMap<>();
        ValueComparator vc = new ValueComparator(unsortedWords);
        TreeMap<String, Integer> sortedWords = new TreeMap<String, Integer>(vc);
        ArrayList<String> wordsAssist = new ArrayList<>();//arraylista wszystkich słówek
        for(int i=0; i<array.length; i++){
            String s = array[i];
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                wordsAssist.add(matcher.group().toLowerCase());
            }
        }
        for (String x: wordsAssist) {
            if (unsortedWords.containsKey(x))
                unsortedWords.put(x, unsortedWords.get(x) + 1);
            else
                unsortedWords.put(x, 1);
        }
        sortedWords.putAll(unsortedWords);
        for(int i=0;i<3;i++)
        {
            System.out.println("\""+new Vector(sortedWords.keySet()).get(i)+"\" - "+new Vector(sortedWords.values()).get(i));
        }
    }
}
