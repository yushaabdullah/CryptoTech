/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptotech;

/**
 *
 * @author Yusha
 */
public class EncodeSubstitution extends Encoder {

    private String str;
    public int i;

    public EncodeSubstitution() {
    }

    public EncodeSubstitution(String str, String text) {
        super(text);
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Encoder EncodeSubCipher(Encoder obj) {
        str = obj.getText();
        str = str.toLowerCase();

        char ch1[] = str.toCharArray();
        char ch2[] = new char[500];

        String str2 = new String();

        for (i = 0; i < str.length(); i++) {
            if ((int) ch1[i] >= 97 && (int) ch1[i] <= 122) {
                switch (ch1[i]) {
                    case 'a':
                        ch2[i] = 'u';
                        break;
                    case 'b':
                        ch2[i] = 's';
                        break;
                    case 'c':
                        ch2[i] = 'h';
                        break;
                    case 'd':
                        ch2[i] = 'p';
                        break;
                    case 'e':
                        ch2[i] = 'm';
                        break;
                    case 'f':
                        ch2[i] = 'q';
                        break;
                    case 'g':
                        ch2[i] = 'w';
                        break;
                    case 'h':
                        ch2[i] = 'c';
                        break;
                    case 'i':
                        ch2[i] = 'o';
                        break;
                    case 'j':
                        ch2[i] = 't';
                        break;
                    case 'k':
                        ch2[i] = 'y';
                        break;
                    case 'l':
                        ch2[i] = 'v';
                        break;
                    case 'm':
                        ch2[i] = 'e';
                        break;
                    case 'n':
                        ch2[i] = 'x';
                        break;
                    case 'o':
                        ch2[i] = 'i';
                        break;
                    case 'p':
                        ch2[i] = 'd';
                        break;
                    case 'q':
                        ch2[i] = 'f';
                        break;
                    case 'r':
                        ch2[i] = 'z';
                        break;
                    case 's':
                        ch2[i] = 'b';
                        break;
                    case 't':
                        ch2[i] = 'j';
                        break;
                    case 'u':
                        ch2[i] = 'a';
                        break;
                    case 'v':
                        ch2[i] = 'l';
                        break;
                    case 'w':
                        ch2[i] = 'g';
                        break;
                    case 'x':
                        ch2[i] = 'n';
                        break;
                    case 'y':
                        ch2[i] = 'k';
                        break;
                    case 'z':
                        ch2[i] = 'r';
                        break;
                }
                str2 = str2 + ch2[i];
            } else if (ch1[i] == ' ') {
                str2 = str2 + ch1[i];
            }
        }
        Encoder obj2 = new Encoder(str2);
        return obj2;
    }
}
