package com.company;

public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        //width and height of the wall, area that can be covered with one bucket extra bucket

        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }

        double area = width * height;
       // System.out.println(area);
        double extra = extraBuckets*areaPerBucket;
        //System.out.println(extra);
        double cant=0;
        int i=1;
        while((cant+extra)< area){
            cant=(i*areaPerBucket);
           // System.out.println(cant);
            if((cant+extra)>= area){
                return i;
            }
            i++;
        }

        //int number of buckets that bob needs to buy
        return -1;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        //width and height of the wall, area that can be covered with one bucket extra bucket

        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }

        double area = width * height;
        //System.out.println(area);
        double extra = 0*areaPerBucket;
        //System.out.println(extra);
        double cant=0;

        int i=1;
        while((cant+extra)< area){
            cant=(i*areaPerBucket);
            // System.out.println(cant);
            if((cant+extra)>= area){
                return i;
            }
            i++;
        }

        //int number of buckets that bob needs to buy
        return -1;
    }

    public static int getBucketCount (double area, double areaPerBucket){
        //width and height of the wall, area that can be covered with one bucket extra bucket

        if(area<=0||areaPerBucket<=0){
            return -1;
        }

        //System.out.println(area);
        double extra = 0*areaPerBucket;
        //System.out.println(extra);
        double cant=0;

        int i=1;
        while((cant+extra) < area){
            cant =i*areaPerBucket;
            if((cant+extra)>= area){
                return i;
            }
            i++;
        }


        //int number of buckets that bob needs to buy
        return -1;
    }
}
