package org.example;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketCount = 0;

       if(width > 0 || height > 0 || areaPerBucket > 0 || extraBuckets > 0){
           bucketCount =  (int) Math.round (width * height / areaPerBucket);
           return bucketCount + extraBuckets;
       } else {
           return -1;
       }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketCount = 0;

        if(width > 0 || height > 0 || areaPerBucket > 0){
            bucketCount =  (int) Math.round (width * height / areaPerBucket);
            return bucketCount;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketCount = 0;

        if(area > 0 || areaPerBucket > 0){
            bucketCount =  (int) Math.round (area / areaPerBucket);
            return bucketCount;
        } else {
            return -1;
        }
    }

}
