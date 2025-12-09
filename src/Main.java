
void main() {

    UserManager userManager = new UserManager();

    IO.println("--------------------");
    userManager.registerUser(101,"Aruther");
    userManager.registerUser(23,"Yuji");
    userManager.registerUser(141,"noal");
    IO.println("--------------------");

    userManager.getUser(141);
    IO.println(userManager.getBannedUsers());
    userManager.banUser(101);
    IO.println(userManager.getBannedUsers());
    userManager.countSafeUsers();

}
