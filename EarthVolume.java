class EarthVolume {
    public static void main(String[] args) {
    
        double radiusKm = 6378;
        
        double kmToMiles = 0.621371;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("Volume of Earth:");
        System.out.println("In Cubic Kilometers: " + volumeKm3 + " km³");
        System.out.println("In Cubic Miles: " + volumeMiles3 + " mi³");
    }
}
