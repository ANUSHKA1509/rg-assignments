public class Principal {
    private static Principal Principal;

    private Principal() {
        System.out.println("One Principal");
    }

    public static Principal getPrincipal() {
        if (Principal == null) {
            Principal = new Principal(); // only one will ever be created
        }
        return Principal;
    }

    public void giveAnnouncement() {
        System.out.println("Do your work!");
    }
}

