public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Örnek oluşturulurken yapılacak işlemler
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("Singleton örneği");
    }
}


