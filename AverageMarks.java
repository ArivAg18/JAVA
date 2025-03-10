 class AverageMarks {
    public static void main(String[] args) {
        // Sam's marks in PCM
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Total subjects
        int totalSubjects = 3;

        // Ccalculate average percentage
        double average = (maths + physics + chemistry) / (double) totalSubjects;

        System.out.println("Sam's average percentage in PCM: " + average + "%");
    }
}
