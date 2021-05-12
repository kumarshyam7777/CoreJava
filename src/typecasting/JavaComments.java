package typecasting;

public class JavaComments {
    public static void main(String[] args) {
        /*
      byte to short,int,long,float,double  => 5
      short to int,long,float,double       => 4
      int to long,float,double             => 3
      long to float,double                 => 2
      float to double                      => 1
      char to int,long,float,double        => 4
      ___________________________________________
                                    Total => 19
     These following 19 conversions System done automatically.
         */

        /*
        The other 23 following conversions must be done by programmers explicitly otherwise compile time occurs.

          byte to char                             => 1
          short to byte,char                       => 2
          int to byte,short,char                   => 3
          long to byte,short,int,char              => 4
          float to byt,short,int,long,char         => 5
          double to byte,short,int,long,float,char => 6
          char to byte,short                       => 2
          ______________________________________________
                                            Total  => 23
         */
        /*
        Operations on Data and DataTypes
      1)  (byte,short,int,char) + (byte,short,int,char)     => int
      2)  (byte,short,int,long,char) + long                 => long
      3)  (byte,short,int,long,float,char) + float          => float
      4)  (byte,short,int,long,float,double,char) + double  => double

         */
    }
}
