
void main() {
// Make a method that reverses a string without using built-in reverse functions.
    String anime = "Jujutsu Kaisen";
    IO.println("Original String: " + anime);
    IO.println("Reversed String: " + reverseString(anime));

}


public String reverseString(String string){
    StringBuilder reversedStr = new StringBuilder();

    for(int i = string.length() - 1; i >= 0; i--){
           reversedStr.append(string.charAt(i));
    }

    return reversedStr.toString();
}
