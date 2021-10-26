import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

public class Json {
    public static String parseAndGet(String json) {
        JSONArray books = new JSONArray(json);
        ArrayList<Double> ratingListRCM = new ArrayList<>();
        ArrayList<Double> ratingListKA = new ArrayList<>();
        ArrayList<Double> ratingListSP = new ArrayList<>();
        ArrayList<Double> ratingListOD = new ArrayList<>();
        ArrayList<Double> ratingListCN = new ArrayList<>();
        ArrayList<Double> ratingListAB = new ArrayList<>();
        ArrayList<Double> ratingListCW = new ArrayList<>();
        ArrayList<Double> ratingListCSH = new ArrayList<>();
        for (int i = 0; i < books.length(); i++) {
            JSONObject book = books.getJSONObject(i);
            String id = book.getString("id");
            String title = book.getString("title");
            String author = book.getString("author");
            double rating = book.getDouble("rating");
            if(author.equals("Robert C. Martin")) {
                ratingListRCM.add(rating);
            }
            if(author.equals("Karolina Antkowiak")) {
                ratingListKA.add(rating);
            }
            if(author.equals("Stephen Prata")){
                ratingListSP.add(rating);
            }
            if(author.equals("Oleh Dokuka")){
                ratingListOD.add(rating);
            }
            if(author.equals("Christopher Negus")){
                ratingListCN.add(rating);
            }
            if(author.equals("Alan Beaulieu")){
                ratingListAB.add(rating);
            }
            if(author.equals("Craig Walls")){
                ratingListCW.add(rating);
            }
            if(author.equals("Cay S. Horstmann")){
                ratingListCSH.add(rating);
            }
        }
        double averageKA=ratingListKA.get(0);
        double averageRCM=(ratingListRCM.get(0)+ratingListRCM.get(1)+ratingListRCM.get(2))/3;
        double averageSP=(ratingListSP.get(0)+ratingListSP.get(1))/2;
        double averageOD=ratingListOD.get(0);
        double averageCN=(ratingListCN.get(0)+ratingListCN.get(1))/2;
        double averageAB=(ratingListAB.get(0)+ratingListAB.get(1))/2;
        double averageCW=(ratingListCW.get(0)+ratingListCW.get(1)+ratingListCW.get(2))/3;
        double averageCSH=ratingListCSH.get(0);
        Map<String, Double> unsortedRatings = new HashMap<>();
        ValueComparator vc = new ValueComparator(unsortedRatings);
        TreeMap<String, Double> sortedRatings = new TreeMap<String, Double>(vc);
        unsortedRatings.put("Karolina Antkowiak",averageKA);
        unsortedRatings.put("Robert C. Martin",averageRCM);
        unsortedRatings.put("Stephen Prata",averageSP);
        unsortedRatings.put("Oleh Dokuka",averageOD);
        unsortedRatings.put("Christopher Negus",averageCN);
        unsortedRatings.put("Alan Beaulieu",averageAB);
        unsortedRatings.put("Craig Walls",averageCW);
        unsortedRatings.put("Cay S. Hortsmann",averageCSH);
        sortedRatings.putAll(unsortedRatings);
        System.out.println("Najwyższe średnie oceny");
        System.out.println("_______________________");
        for(int i=0;i<3;i++)
        {
            System.out.println(new Vector(sortedRatings.keySet()).get(i));
            System.out.println(new Vector(sortedRatings.values()).get(i));
        }
        return null;
    }
}