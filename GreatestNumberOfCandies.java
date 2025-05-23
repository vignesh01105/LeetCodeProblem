import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {

    // Learn how to get max element using Stream.

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> candiesResult = new ArrayList<>();
        System.out.println(Arrays.stream(candies));

        for (int i =0; i<candies.length; i++){
            int addExtraCandy = candies[i] + extraCandies;
            if (addExtraCandy >= Arrays.stream(candies).max().getAsInt()){
                candiesResult.add(true);
            }
            else {
                candiesResult.add(false);
            }

        }

            System.out.println(candiesResult);
            return candiesResult;
    }

    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWithCandies(candies,extraCandies);
    }
}
