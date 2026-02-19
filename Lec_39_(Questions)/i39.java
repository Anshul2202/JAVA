public class i39 {

    public static void main(String arr[]) {

        int result = getBucketCount(4, 4, 2, 4);
        System.out.println(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extra) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid input!");
            return -1;
        }

        double areaOfWall = width * height;

        int totalBucket = (int) (areaOfWall / areaPerBucket);

        int buyBucket = totalBucket - extra;

        return buyBucket;

    }
}