package com.fakhrialhafizh.praktikumjavafakhri;
        
import view.cashier.jenisbarang.JenisBarangViewFrame;

public class Main {
    public static void main(String[] args) {
        JenisBarangViewFrame frame = new JenisBarangViewFrame();
        
        frame.dispose();
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
