package skypro.ru;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int snake = 5;
        byte tiger = 1;
        short pepers = 3;
        long lion = 100L;
        double saltWeight = 3.5;
        float sugarWeight = 7.5f;
        boolean snakeIsAdult = false;
        char bar = 43;
        System.out.println("Chto kak budet smotri " + pepers + saltWeight);
        ////
        // zadanie 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Obsiy ves " + weightOfAllBoxers);
        System.out.println("Raznitsa v vese " + weightDifference);
        /// zadanie3
        int ice = 2;
        int milk = 200;
        int egg = 4;
        int banana = 5;
        int weightOfAllEggs = egg * 70;
        System.out.println("Obsiy ves yaits " + weightOfAllEggs);
        int weightOfAllBananas = banana * 80;
        System.out.println("Obsiy ves bananov " + weightOfAllBananas);
        int weightOfAllIce = ice * 100;
        System.out.println("Obsiy ves morojennogo " + weightOfAllIce);
        int weightOfAllMilk = milk / 100 * 105;
        System.out.println("Obsiy ves moloka " + weightOfAllMilk);
        System.out.println("Obsiy ves zavtraka " + (weightOfAllBananas + weightOfAllEggs + weightOfAllIce + weightOfAllMilk));
        ///
        /// zadanie 4

        int M = 67_768;
        int D = 83_690;
        int K = 76_238;
        float salaryM = 67_760 + 67_760 * 0.10f;
        System.out.println("Masa poluchaet " + salaryM);
        float salaryD = 83_690 + 83_690 * 0.10f;
        System.out.println("Denis poluchaet " + salaryD);
        float salaryK = 76_230 + 76_230 * 0_10f;
        System.out.println("Kristina poluchaet " + salaryK);
        float zarplataM1 = M * 12;
        System.out.println("Masa poluchaet do " + zarplataM1);
        float zarplataD1 = D * 12;
        System.out.println("Denis poluchaet do " + zarplataD1);
        float zarplataK1 = K * 12;
        System.out.println("Kristina poluchaet do " + zarplataK1);
        float zarplataM = salaryM * 12;
        System.out.println("Masa poluchaet posle povicheniya " + zarplataM);
        float zarplataD = salaryD * 12;
        System.out.println("Denis posle povicheniya " + zarplataD);
        float zarplataK = salaryK * 12;
        System.out.println("Kristina poluchaet posle povicheniya " + zarplataK);

        float raznitsaM2 = zarplataM - zarplataM1;
        System.out.println("Masa poluchaet posle povicheniya " + raznitsaM2);
        float raznitsaD2 = zarplataD - zarplataD1;
        System.out.println("Denis poluchaet posle povicheniya " + raznitsaD2);
        float raznitsaK2 = zarplataK - zarplataK1;
        System.out.println("Kristina poluchaet posle povicheniya " + raznitsaK2);
        System.out.println("Teper Masa poluchaet " + zarplataM + " Godovoy dohod viros" + raznitsaM2);
        System.out.println("Teper Denis poluchaet " + zarplataD + " Godovoy dohod" + raznitsaD2);
        System.out.println("Teper Kristina poluchaet " + zarplataK + " Godovoy dohod" + raznitsaK2);




    }
}
