public class bulan {
    public static void main(String[] args) {
        String[] bulan = {
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"
        };

        System.out.println("Daftar 12 Bulan:");
        for (int i = 0; i < bulan.length; i++) {
            System.out.println((i + 1) + ". " + bulan[i]);
        }
    }
}