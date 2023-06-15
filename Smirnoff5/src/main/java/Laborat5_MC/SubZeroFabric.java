package Laborat5_MC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Класс SubZeroFabric для создания объектов типа SubZero.
 * @author Alina
 */
public class SubZeroFabric implements EnemyFabricInterface {
    
    /** 
     * Метод создания объекта класса SubZero с определенными параметрами.
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }
}
