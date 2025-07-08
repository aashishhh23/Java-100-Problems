// Concatenate and Convert: Take two Strings, concatenate them, and convert the result to uppercase

class StringManipulation {
    public static void main(String[] args) {

        String firstName = " Aashish ";
        String lastName = "Verma";
        String fullName = firstName.concat(" ").concat(lastName) ;
        System.out.println(fullName.toUpperCase());

    }
}
