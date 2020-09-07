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
public class Decoder {
    private String text;

    public Decoder() {
    }

    public Decoder(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }   
}
