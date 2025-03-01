public class Main {
    public static void main(String[] args) {
        // Randle's Candles
        System.out.println("\nRandle's Candles:");

        Candle c = new Candle();
        c.setColor("Blue");
        c.setHeight(2.8);

        ScentedCandle sc = new ScentedCandle();
        sc.setColor("Orange");
        sc.setHeight(2);
        sc.setScent("Deodorant");

        System.out.println(c.getPrice() + "  " + c.getHeight() + "  " + c.getColor());
        System.out.println(sc.getPrice() + "  " + sc.getHeight() + "  " + sc.getColor() + "  " + sc.getScent());

        // Tawny Pet Supply
        System.out.println("\nTawny Pet Supply:");

        ItemSold pants = new ItemSold();
        pants.setDescription("Black sweatpants");
        pants.setInvoiceNumber(2817);
        pants.setPrice(14.99);
        System.out.println(pants.getDescription() +"  #"+ pants.getInvoiceNumber() +"  $"+ pants.getPrice());

        ItemSold shirt = new ItemSold();
        shirt.setDescription("Blue T-shirt");
        shirt.setInvoiceNumber(5431);
        shirt.setPrice(6.99);
        System.out.println(shirt.getDescription() +"  #"+ shirt.getInvoiceNumber() +"  $"+ shirt.getPrice());

        PetSold dog = new PetSold();
        dog.setDescription("101 Dalmnations");
        dog.setInvoiceNumber(2101);
        dog.setPrice(200.00);
        dog.setHousebroken(false);
        dog.setNeutered(true);
        dog.setVaccinated(true);
        System.out.println(dog.getDescription() +"  #"+ dog.getInvoiceNumber() +"  $"+ dog.getPrice());
        System.out.println("Housebroken - "+ dog.isHousebroken() +"  Neutered - "+ dog.isNeutered() +"  Vaccinated - "+ dog.isVaccinated());

        PetSold cat = new PetSold();
        cat.setDescription("Spot the white cat");
        cat.setInvoiceNumber(2227);
        cat.setPrice(200.00);
        cat.setHousebroken(true);
        cat.setNeutered(false);
        cat.setVaccinated(true);
        System.out.println(cat.getDescription() +"  #"+ cat.getInvoiceNumber() +"  $"+ cat.getPrice());
        System.out.println("Housebroken - "+ cat.isHousebroken() +"  Neutered - "+ cat.isNeutered() +"  Vaccinated - "+ cat.isVaccinated());

         // Wholly Points
         System.out.println("\nWholly Points:");
         
          WhollyPointsPlayer player1 = new WhollyPointsPlayer();
          player1.setIdNumber(9516);
          player1.setScreenName("SpeedyBanana22");
          player1.setHighScore(1, 163);
          System.out.println(player1.getIdNumber() +"  "+ player1.getScreenName() +"  "+ player1.getHighScore(1));

          WhollyPointsPlayer player2 = new WhollyPointsPlayer();
          player2.setIdNumber(2341);
          player2.setScreenName("MikeTheOtter1");
          player2.setHighScore(1, 100);
          player2.setHighScore(2, 66);
          System.out.println(player2.getIdNumber() +"  "+ player2.getScreenName() +"  "+ player2.getHighScore(2));

          PremiumWhollyPointsPlayer player3 = new PremiumWhollyPointsPlayer();
          player3.setIdNumber(2983);
          player3.setScreenName("KrogerImploder8000");
          player3.setHighScore(1, 100);
          player3.setHighScore(2, 124);
          System.out.println(player3.getIdNumber() +"  "+ player3.getScreenName() +"  "+ player3.getHighScore(29));

          PremiumWhollyPointsPlayer player4 = new PremiumWhollyPointsPlayer();
          player4.setIdNumber(6821);
          player4.setScreenName("zzCoderMan123");
          player4.setHighScore(1, 610);
          player4.setHighScore(2, 230);
          player4.setHighScore(3, 42);
          System.out.println(player4.getIdNumber() +"  "+ player4.getScreenName() +"  "+ player4.getHighScore(32));
    }
}