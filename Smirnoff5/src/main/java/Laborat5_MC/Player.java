/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laborat5_MC;
/**
 * Класс Player для манипуляций с параметрами существа (игрока и врага).
 * @author Alina
 */
public class Player {
    private int level;
    private int health;
    private int maxhealth;
    private int damage;
    private int attack;
    private boolean recoveryAttempt;
    
    /** 
    * Конструктор с инициализацией по переданным уровню, здоровью, урону и атаке.
    */ 
    
    public Player (int level, int health, int damage, int attack){
        this.level=level;
        this.health=health;
        this.damage=damage;
        this.attack=attack;
        this.maxhealth=health;
    }
   
    /** 
    * Гетеры и сетеры для параметров существа (уровень, текущее здоровье, максимально возможное на данный момент здоровье,
    * значение урона, значение атаки, подсчитанное количество атак и защит противника).
    */
    
    public void setLevel(){
        this.level++;
    }
    
    public void setHealth(int h){
        this.health+=h;
    }
    
    public void setNewHealth(int h){
        this.health=h;
    }
    
    public void setDamage(int d){ 
        this.damage+=d;
    }
    
    public void setAttack(int a){
        this.attack=a;
    }
    
    public void setMaxHealth(int h){ 
        this.maxhealth+=h;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public int getAttack(){
        return this.attack;
    }
    
    public int getMaxHealth(){
        return this.maxhealth;
    }
    
    public String getName(){
        return "";
    }
    
    public void SetRecoveryAttempt(boolean recovery){
        this.recoveryAttempt = recovery;
    }
    
    public boolean getRecoveryAttempt(){
        return this.recoveryAttempt;
    }
}
