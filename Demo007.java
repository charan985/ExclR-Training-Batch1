class Demo007 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {

        String Username = "Charan";
        String Password = "Charan_1";

        while((Username == "Charan") && (Password == "Charan_1")) {
            System.out.println("Welcome to Mallareddy university");
            break;
        }
    }
}
