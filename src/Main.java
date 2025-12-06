
void main() {

    NumberTeller(23);

}

public void NumberTeller(int num){
    if (num % 2 == 0 ){
        IO.println("It is Even.");
    } else {
        IO.println("It is Odd.");
    }
}