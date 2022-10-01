// Implementation of the code in Java

class XorEncryption {
    public static void main(String[] args) {
        // Hex String variable
        String hex_s = "653cae8da8edb426052";

        // Plain text variable
        String plain = "";

        // variable to store the XOR
        // of previous digits
        int x = 0;

        int l = hex_s.length();

        // Loop for loop from the end to
        // the mid section of the string
        for (int i = l - 1; i > (l / 2) - 1; i--) {
            // calculation of the plaintext digit
            int y = x ^ Integer.parseInt(Character.toString(hex_s.charAt(i)), 16);

            // calculation of XOR chain
            x = x ^ y;
            String z = Integer.toString(y, 16);
            plain = z.charAt(z.length() - 1) + plain;
        }

        System.out.println(plain);

    }
}


