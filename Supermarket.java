


public class Supermarket {

     public static final float KILO_VALUE = 1600.5f;

      
     public float determineWeight(float cash){
            float weight = cash / KILO_VALUE;
	    return weight;
     }
		
}