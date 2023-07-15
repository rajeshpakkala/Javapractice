public class Pattern {
    public static void main(String[]args){
        int n=11;
       // A
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if (j == 0 || i == 0 && j <= (n - 1) / 2 || j == (n - 1) / 2 || i == (n - 1) / 2 && j <= (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            //B
            for(int j=0;j<n;j++){
                if (j==0  ||
                        i==0 && j<(n-1)/2 ||
                         i==(n-1)/2 && j<(n-1)/2 ||
                        i==n-1 && j<(n-1)/2 ||
                        j==(n-1)/2 && i>0 && i<(n-1)/2 ||
                        j==(n-1)/2 && i>(n-1)/2 && i<n-1)
                        {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");

            //C
            for(int j=0;j<n;j++){
                if (i==0 && j>0 && j<(n-1)/2 || i==n-1 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
//D
            for(int j=0;j<n;j++){
                if (j==0 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//E
            for(int j=0;j<n;j++){
                if (j==0 || i==0 && j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//F
            for(int j=0;j<n;j++){
                if (j==0 || i==0 && j<=(n-1)/2 || i==((n-1)/2) && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
//G
            for(int j=0;j<n;j++){
                if (i==0 && j<=(n-1)/2 || j==0  && i<(n-1)/2 || i==(n-1)/4 && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/4 && i<(n-1) || i==(n-1)/2 && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//H
            for(int j=0;j<n;j++){
                if (j==0 || j==(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//I
            for(int j=0;j<n;j++){
                if (i==0 && j<=(n-1)/2 || i==n-1 && j<=(n-1)/2 || j==(n-1)/4 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
//J
            for(int j=0;j<n;j++){
                if (i==0 && j<=(n-1)/2 || j==(n-1)/4 && i<(n-1) || i==(n-1) && j<=(n-1)/4 || j==0 && i>=(3*n)/4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//K
            for(int j=0;j<n;j++){
               if (j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

//L

            for(int j=0;j<n;j++){
                if (j==0 || i==(n-1) && j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");

            //M

            for(int j=0;j<n;j++){
                if (j==0 || j==(n-1) || i==j && j<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            //N

            for(int j=0;j<n;j++){
                if (j==0 || j==(n-1) || i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
//O
            for(int j=0;j<n;j++){
                if (j==0 && i>0 && i<n-1 || j==(n-1)/2 && i>0 && i<n-1 || i==0 && j>0 && j<(n-1)/2 || i==(n-1) && j>0 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
//P
            for(int j=0;j<n;j++){
                if (j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2  && i<(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//Q
            System.out.print(" ");

            for(int j=0;j<n;j++){
                if (j==(n-1)/4 && i<(3*n)/4 && i>0 || j==(3*n)/4 && i>0 &&i<(3*n)/4 || i==0 && j>(n-1)/4 && j<(3*n)/4|| i==(3*n)/4 && j>(n-1)/4 && j<(3*n)/4 ||i==j && j>=(n-1)/2 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");



 //R

            System.out.print(" ");
            for(int j=0;j<n;j++){
                if (j==0 || i==0 &&j<=(n-1)/2 || i+j==(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
     //S
            for(int j=0;j<n;j++){
                if (i==0 && j<=(n-1)/2 && j>0 || i==(n-1) && j<=(n-1)/2 || j==0 && i>0 && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//T
            for(int j=0;j<n;j++){
                if (i==0 && j<=(n-1)/2 || j==(n-1)/4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//U
            for(int j=0;j<n;j++){
                if (j==0 && i<n-1 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i<(n-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
//V
          /*  System.out.print(" ");

            for(int j=0;j<n;j++){
                if ()
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }*/
//W
            System.out.print(" ");

            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j && j>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
  //X
            System.out.print(" ");

            for(int j=0;j<n;j++) {
                if (i==j || i+j==(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

  //Y
            System.out.print(" ");

            for(int j=0;j<n;j++) {
                if (i+j==(n-1)||i==j && j<=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
 //Z
            System.out.print(" ");

            for(int j=0;j<n;j++){
                if (i==0 || i+j==(n-1) || i==(n-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
