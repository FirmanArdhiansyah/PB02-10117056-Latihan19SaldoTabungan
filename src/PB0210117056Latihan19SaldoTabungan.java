/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama     : Firman Ardhiansyah
 *         Kelas    : IF-2 (PB02)
 *         NIM      : 10117056
 */
public class PB0210117056Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int saldo, bulan;
        double bunga;

        saldo = 2500000;
        bulan = 0;
        while (bulan < 6) {
            bulan = bulan + 1;
            saldo = (int) (saldo + (saldo * 0.15));

            String matauang = String.format("Rp.%,3d", saldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + bulan + "%s%n", matauang);

        }

    }

}
