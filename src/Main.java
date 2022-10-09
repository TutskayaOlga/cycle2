public class Main {
    public static void main(String[] args){
        int salary = 15000;
        int total = 0;
        while (total < 2_590_000){
            total = total + salary;
            System.out.println(total);
        }
    //15000
    // 259000
    //"Месяц … , сумма накоплений равна … рублей"

        System.out.println();
    }
}