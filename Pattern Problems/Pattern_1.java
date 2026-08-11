/* Pattern - 1
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * *  */

class Pattern_1 {
    public static void main(String[] args) {
        int n = 5; // numbers of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner Loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}