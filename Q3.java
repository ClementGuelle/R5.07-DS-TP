public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Il 'y a pas de paramètre.");
            return;
        }

        int n = 0;
      
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un chiffre entier");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
