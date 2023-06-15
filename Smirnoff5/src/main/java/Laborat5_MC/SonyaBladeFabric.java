package Laborat5_MC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Класс SonyaBladeFabric для создания объектов типа SonyaBlade.
 * @author Alina
 */
public class SonyaBladeFabric implements EnemyFabricInterface {
    
    /** 
     * Метод создания объекта класса SonyaBlade с определенными параметрами.
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }
}
