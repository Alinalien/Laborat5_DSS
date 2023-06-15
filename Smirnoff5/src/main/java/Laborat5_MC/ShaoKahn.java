package Laborat5_MC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Класс ShaoKahn для манипуляций с параметрами врага.
 * @author Alina
 */
public class ShaoKahn extends Player {
    /**
     * Конструктор с инициализацией по переданным уровню, здоровью, урону и атаке.
     */
    public ShaoKahn(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    
    /** 
    * Переопределенный метод для получения имени врага.
    */
    @Override
    public String getName(){
        return "Shao Kahn";
    }
    
    /**
     * Метод регенерации здоровья босса.
     * @param a
     */
    public void changeHealthAttemptRes (int a, int possibleDamage) {
        
        if(a==0)
        {
            int expectedHealth =(int) (this.getHealth() + (this.getMaxHealth() -  this.getHealth()) * 0.5);
            this.setNewHealth(expectedHealth);  
        }
        
        if(a==1)
        {
            int expectedHealth = this.getHealth() - possibleDamage*2;
            if(expectedHealth >= 0){
                this.setNewHealth(expectedHealth);
            }else{this.setNewHealth(0);}
        }   
    }
}
