/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fakhrialhafizh.praktikumjavafakhri.template;

import java.util.ArrayList;

/**
 *
 * @author WIN8
 */
public interface MyModelInterface {
    
    abstract boolean create();
    abstract ArrayList<Object> read();
    abstract boolean update();
    abstract boolean delete();
    abstract ArrayList<Object> search(String keyword);
}
