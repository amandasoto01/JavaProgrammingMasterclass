package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int samllCount, int goal){
        //big flour bags 5kilos
        //small flour bags 1kilo
        //goal the goal amount of kilos of flour
        int b=0;
        int s=0;
        if(goal < 1 || bigCount < 0 || samllCount < 0) {
            return false;
        }

        if((bigCount+samllCount)==goal){
            return true;
        }else if(( (bigCount*5) +samllCount)>=goal){
            if(bigCount > 0){
                for(int i=1; i<=bigCount; i++){
                    b += (i*5);
                    if(samllCount > 0){
                        for(int j=1; j<=samllCount; j++){
                            s=(j);
                            System.out.println(j+ " goal - "+goal + " b " + b + " s "+ s + " "+ (goal-(b+s)));

                            if((goal-(b+s))>=0 && (b+s)>=goal){
                                System.out.println("goal - "+goal + " b " + b + " s "+ s + " "+ (goal-(b+s)));
                                return true;
                            }
                        }
                    }

                    if( b == goal){
                        return true;
                    }
                    s=0;
                    b=0;
                }
            }else if(bigCount == 0){
                for(int k=1; k<samllCount; k++){
                    s+=k;
                    if((goal - s) >= 0){
                        return true;
                    }
                }
            }

            return false;
        }

        return false;
    }
}
