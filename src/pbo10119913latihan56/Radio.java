/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan56;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur){
        super(umur);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
