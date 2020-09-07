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
public class EncodeCaesar extends Encoder {

    private int shift;
    private String str;
    public int i;

    public EncodeCaesar() {
    }

    public EncodeCaesar(int shift, String str, String text) {
        super(text);
        this.shift = shift;
        this.str = str;

    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStr() {
        return str;
    }

    public void setStrChange(String str) {
        this.str = str;
    }

    //Encoding Starts
    public Encoder EncodeCaesar(Encoder obj) {
        str = obj.getText();
        str = str.toLowerCase();

        char ch1[] = str.toCharArray();
        char ch2[] = new char[500];

        String str2 = new String();

        for (i = 0; i < str.length(); i++) {
            if ((int) ch1[i] >= 97 && (int) ch1[i] <= 122) {
                ch2[i] = (char) (((int) ch1[i] + shift - 97) % 26 + 97);
                str2 = str2 + ch2[i];
            } else if (ch1[i] == ' ') {
                str2 = str2 + ch1[i];
            }
        }
        Encoder obj2 = new Encoder(str2);
        return obj2;
    }
}
