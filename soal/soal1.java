package soal;

public class soal1 {
    public static void main(String[] args) {

        int[] bilangan = new int[]{1, 2, 3};
        int sum = 0;

        for (int angka : bilangan) {
            sum += angka;
        }
        System.out.println("Total : " + sum);
    }
}
