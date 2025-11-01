import java.util.Arrays;

public class PorseniAthletes {
    public static void main(String[] args) {
        String[] badminton = {"Andi", "Budi", "Citra", "Dewi", "Eka"};
        String[] tableTennis = {"Fajar", "Gilang", "Hana", "Ira", "Joko"};
        String[] basketball = {"Kevin", "Lina", "Mila", "Nando", "Oki"};
        String[] volleyball = {"Putra", "Qori", "Rina", "Sandi", "Tono"};

        String[][] allSports = {badminton, tableTennis, basketball, volleyball};
        String[] sportNames = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        for (int i = 0; i < allSports.length; i++) {
            Arrays.sort(allSports[i]);
            System.out.println("\n" + sportNames[i] + " Athletes (sorted):");
            for (String name : allSports[i]) {
                System.out.println(" - " + name);
            }
        }
    }
}
