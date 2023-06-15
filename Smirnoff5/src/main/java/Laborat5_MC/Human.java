package Laborat5_MC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Класс Human для манипуляций с параметрами игрока.
 * @author Alina
 */
public class Human extends Player {
    private int points;
    private int experience;
    private int win;
    private int nextexperience;
    private int Nlocations;
    private int NRound =0 ;

    /**
     * Конструктор 
     */
    public Human (int level, int health, int  damage, int attack, int location){
        super (level, health, damage, attack);
      
        this.points=0;
        this.experience=0;
        this.nextexperience=40;
        this.win=0;
        this.NRound=0;
        this.Nlocations = location;
    }
    /** 
    * Гетеры и Сетеры для параметров игрока (очки, опыт, победы, опыт для следующего уровня, номер текущей локации, 
    * количество локаций, номер текущего врага в локации, количество врагов в локации).
    */
    
    public void setNLocations(int n){
    this.Nlocations = n;
    }
    
    public int getNLocations(){
    return this.Nlocations;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public int getExperience(){
        return this.experience;
    }
    
    public int getNextExperience(){
        return this.nextexperience;
    }
    
    public int getWin(){
        return this.win;
    }
    
    public void setPoints(int p){
        this.points+=p;
    }
    
    public void setExperience(int e){
        this.experience+=e;
    }
    
    public void setNextExperience(int e){
        this.nextexperience=e;
    }
    
    public void setWin(){
        this.win++;
    }
    
    @Override
    public String getName(){
        return "You";
    }
    
    public void setNRound(){
        this.NRound ++;
    }
    
    public int getNRound(){
        return this.NRound;
    }
    
    public void setZeroRound(){
        this.NRound=0;
    }
}
