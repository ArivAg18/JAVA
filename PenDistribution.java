class PenDistribution {
    public static void main(String[] args) {
        // Total pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens
        int remainingPens = totalPens % totalStudents;

        // Display the result in a single print statement
        System.out.println("Total Pens: " + totalPens + 
                           "\nTotal Students: " + totalStudents + 
                           "\nEach student gets: " + pensPerStudent + " pens" + 
                           "\nRemaining pens: " + remainingPens);
    }
}
