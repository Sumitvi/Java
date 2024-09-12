import java.util.*;
public class Trapedwater {

    public static int TappedRainwater(int height[]){

         // calculate left max height
        int LeftMax [] = new int [height.length];
        LeftMax[0] = height[0];

        for(int i=1;i<height.length;i++){
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }


        // calculate right max height
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];

        for(int i = height.length-2;i>=0;i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
       

        // Loop

        int Trapedwater = 0;

        for(int i=0;i<height.length;i++){
            int WaterLevel = Math.min(LeftMax[i],RightMax[i]);
            Trapedwater += WaterLevel - height[i];
        }


        return Trapedwater;
        // WaterLevel = Math.min(RightMax,LeftMax);
        // TrappedWater = WaterLevel-height;
    }

    public static void main(String[] args) {

        int height [] = {4,2,0,6,3,2,5};
        int waterlevel = TappedRainwater(height);

        System.out.println("Water Level Is " + waterlevel);


        
    }
    
}
