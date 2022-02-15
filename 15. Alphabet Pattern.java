public class Fun_Codes {
    static void alphabetPattern(int N)

    {
        int i, j;
        int Top=1, Bottom= 1, Diagonal = N - 1;
        for (i = 0; i < N; i++)
        System.out.print (Top++ + " ");

        System.out.println();
        for (i = 1; i < N - 1; i++)
        {
            // Spaces for the diagonals
            for ( j = 0;
                 j < 2 * (N-i - 1);
                 j++)
                 System.out.print(" ");
            System.out.print(Diagonal--);

            System.out.println();
        }

        // Loop for printing the last row
        for (i = 0; i < N; i++)
            System.out.print(Bottom++ + " ");
    }

    // Driver Code
    public static void main(String args[])
    {
        // Number of rows
        int N = 5;
        alphabetPattern (N);

    }
}
