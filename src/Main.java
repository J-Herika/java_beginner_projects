
void main() {

    UserManager userManager = new UserManager();

    IO.println("--------------------");
    userManager.registerUser(101,"Yami");
    userManager.registerUser(23,"asta");
    userManager.registerUser(141,"noal");
    IO.println("--------------------");

    IO.println(userManager.getBannedUsers());
    userManager.banUser(101);
    IO.println(userManager.getBannedUsers());

}
