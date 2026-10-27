public class AcademicEvaluator {
    public static void main(String[] args) {
        
        double gwa =87;
        int lowestGrade =85;
        System.out.println("Status with Honors:");
        if (gwa >=90.0) {
           if (lowestGrade >=85) {
            if (gwa >95.0) {
System.out.println("With High Honors");
             } else if (gwa >= 92.0) {
System.out.println("With Honors");
             } else {
System.out.println("Regular Passing Grade");
             }
           } else {
System.out.println("Disqualified due to grade below minimum requirment");
             }
           } else {
              System.out.println("Failing Grade");                                          
        }
    }
}       