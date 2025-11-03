public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        System.out.println("Info user1 = ");
        user1.Informazioni();

        User user2 = User.getInstance();
        user2.setNome("Davide");
        user2.setEta(19);
        System.out.println("Info user2 = ");
        user2.Informazioni();
    }
}