public class Main {
    public static void main(String[] args) {



        System.out.println("2'den 100'e kadar olan Asal Sayılar : ");


        int sayac = 0;

        for(int m = 2; m < 100; m++){

        for(int i = 2; i < m; i++){
            if(m % i != 0){
                sayac++;
                if(sayac == m - 2){
                    System.out.println(m + " bir Asal Sayıdır.");
                sayac=0;
        }
            } else {
            //System.out.println(m + " bir Asal Sayı Değildir.");
                 sayac=0;
            break;

        }

    }
}

    }

    }

