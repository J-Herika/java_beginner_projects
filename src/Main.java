
void main() {

    try {
        IO.println(10 / 0);
    }catch (ArithmeticException e){
        IO.println("ERROR: "+ e);
    }


}
