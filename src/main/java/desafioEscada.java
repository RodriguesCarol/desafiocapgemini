public class desafioEscada {

    public static void main(String[] args) {
        int i,j,n;
        n= 10;
        for(i = 1;i <= n;i++ ){
            for( j = n -i ; j >= 1;j--)
                System.out.print(" ");
            for(j = 1; j <= i;j++)
                System.out.print("*");

            System.out.print("\n");
        }


    }


}












