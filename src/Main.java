
void main() {
    Random random = new Random();
    int model = random.nextInt(4);

    switch (model) {
        case 3 ->
            IO.print("it's was made in big 5");
        case 2->
            IO.print("it's was made in big 00");
        case 1->
            IO.print("it's was made in big 90");
        default -> IO.print("this beast is a classic!");
    }

}
