/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author User
 */
public class Example2 {

    public static void main(String[] args) {
        Exception ex = new Exception("Мое исключение");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Обработка исключения");
            System.out.println(e.getMessage());
        }
    }
}
