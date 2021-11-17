import java.util.Scanner;

public class GoodMorning {
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                        22, 23, 25, 26, 28, 29, 33, 36, 39, 40,
                        44, 45, 46, 47, 48, 49, 50,
                        55, 56, 58, 59, 66, 69, 70,
                        77, 78, 79, 80, 88, 89, 99,
                100, 110,
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
            122, 123, 125, 126, 128, 129, 133, 136, 139, 140,
            144, 145, 146, 147, 148, 149, 150,
            155, 156, 158, 159, 166, 169, 170,
            177, 178, 179, 180, 188, 189, 199, 200};
        int temp;
        int diff;
        int closest;
        for(int i=0; i<n; i++)
        {
            temp = reader.nextInt();
            diff = temp - array[0];
            closest = array[0];
            for(int j=0; j<array.length; j++)
            {
                int abs = Math.abs(temp - array[j]);
                if(diff > abs)
                {
                    diff = abs;
                    closest = array[j];

                }

            }
            System.out.println(closest);
        }
    }
}
