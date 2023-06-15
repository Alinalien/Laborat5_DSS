package Laborat5_MC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Класс LiuKangFabric для создания объектов типа LiuKang.
 * @author Alina
 */
public class LiuKangFabric implements EnemyFabricInterface {
    
    /** 
     * Метод создания объекта класса LiuKang с определенными параметрами.
     */
    
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
    
}
