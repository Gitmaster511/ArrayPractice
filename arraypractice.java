/*  Java double Array Example
    Save with file name DoubleArray.java    */
   
    public class arraypractice
    {
      public static void main(String args[])
      {
        //JAVA DOUBLE ARRAY DECLARATION
        double a[];
        double sum = 0;
        //MEMORY ALLOCATION FOR JAVA DOUBLE ARRAY
        a = new double[8];
        //ASSIGNING ELEMENTS TO JAVA DOUBLE ARRAY
        a[0] = 12.34;
        a[1] = 14.55;
        a[2] = 17.44;
        a[3] = 34.33;
        a[4] = 44.51;
        a[5] = 49.22;
        a[6] = 22.02;
        a[7] = 25.02;
        //JAVA DOUBLE ARRAY OUTPUT
        System.out.println("Java double Array Example");
        for(int i=0;i<a.length;i++)
        {
          System.out.println("Prices : " + a[i]);
          sum = sum + a[i];
        }
        //  double asd = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7];
        System.out.println("The sum is: " + sum); 
        System.out.println("The average is: " + sum/8 ); 
    } 
}