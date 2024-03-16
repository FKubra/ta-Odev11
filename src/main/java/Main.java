public class Main {
    public static void main(String[] args) {

        // Singleton kullanımı
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.getMessage();

        Kitap kitap = Kitap.KitapBuilder.aKitap()
                .withId(43)
                .withSayfaSayisi(712)
                .withAdi("Dune")
                .withYazarAdi("Frank Herbert")
                .withFiyati(390.0)
                .build();

        System.out.println(kitap.toString());


    }
}
