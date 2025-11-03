public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        System.out.println("Default Info = ");
        user1.Informazioni();

        User user2 = User.getInstance();
        user2.setNome("Luca");
        user2.setEta(25);

        System.out.println("Info user2:");
        user2.Informazioni();

    }
}