import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Capybar> capybarList = new ArrayList<>();
        capybarList.add(new Capybar());

        Map<String,Capybar> capybarMap = new HashMap<>();
        capybarMap.put("Maciek",new Capybar());
        capybarMap.get("Maciek");

        Set<Capybar> capybarSet = new HashSet<>();
        capybarSet.add(new Capybar());
        List<Integer> numerki = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,5,7,7,7));
        System.out.println(returnDuplicates(numerki));
        System.out.println(deleteDuplicates(numerki));

    }

    public static Set returnDuplicates(List<Integer> integerList){
        Set<Integer> noDuplicates = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer integer : integerList) {
            if(!noDuplicates.add(integer)){
                duplicates.add(integer);

            }
        }
        return duplicates;
    }
    public static List deleteDuplicates(List<Integer> integerList){
        Set<Integer> noDuplicates = new HashSet<>();
        List<Integer> finalList = new ArrayList<>();
        for (Integer integer : integerList) {
            if(noDuplicates.add(integer)){
                finalList.add(integer);
            }

        }
        return finalList;
    }
}