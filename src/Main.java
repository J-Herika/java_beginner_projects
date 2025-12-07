
void main() {
// Write a loop to print all prime numbers from 1–100.

    for (int i = 1; i < 100; i++) {
        PrimeNumbers(i);
    }


}


public void PrimeNumbers(int num){
    if(num <= 1){
        return;
    }else if(num == 2){
        IO.println(num);
    } else if (num % 2 == 0) {
        return;
    }

    for(int i = 3; i * i <= num; i += 3){
        if(num % i == 0){
            return;
        }
    }
    IO.println(num);
}
