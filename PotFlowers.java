public class PotFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int flowerPlot) {

        if (flowerPlot>flowerbed.length){
            return false;
        }
        if(flowerbed.length == 1 && flowerPlot ==1 && flowerbed[0] == 0){
            return true;
        }
        if(flowerbed.length == 1 && flowerPlot ==1 && flowerbed[0] == 1){
            return false;
        }
        else {
            int nextElement =0;
            int previousElement = 0;

                for (int j=0; j<flowerbed.length && flowerPlot >=1;j++){
                    if (j==0 && flowerbed[j] == 0){
                        nextElement = j+1;
                    if (flowerbed[nextElement] == 0){
                        System.out.println("Place Flowers");
                        flowerbed[j]=1;
                        flowerPlot--;
                    }
                    } else if (j==flowerbed.length -1 && flowerbed[j] == 0) {
                        previousElement = j-1;
                        if (flowerbed[previousElement] == 0){
                            System.out.println("Place Flower");
                            flowerbed[j]=1;
                            flowerPlot--;
                        }
                    }
                    else {
                        if ((j !=0 && j != flowerbed.length -1) && flowerbed[j]==0){
                            nextElement = j +1;
                            previousElement = j-1;
                            if (flowerbed[nextElement]==0 && flowerbed[previousElement]==0){
                                System.out.println("Place Flower");
                                flowerbed[j]=1;
                                flowerPlot--;
                            }
                        }
                    }
                }


        }
        if (flowerPlot == 0){
            return true;
        }
        else {
            return  false;
        }

    }

    public static void main(String[] args){
        int[] flowers = {0,0,1,0,0};
        int plotFlower = 1;
        System.out.println(canPlaceFlowers(flowers, plotFlower));
    }

}
