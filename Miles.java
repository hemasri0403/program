import java.lang.System;
public class Miles {
    public static void main(String[] args) {
        
                double radius = 6378;
                double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
                double volumeMiles3 = volumeKm3 * 0.239913; //  1 km^3 = 0.239913 miles^3
                
                System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
        
    }
    
}
