package models;

import models.PizzaCell;

public class Slice(){

    private PizzaCell startCell;
    private PizzaCell endCell;

    public String toString(){
        return this.startCell.toString + " " + this.endCell.toString;
        }

    public PizzaCell getStartCell(){
        return startCell;
        }

    public setStartCell(PizzaCell startCell){
        this.startCell = startCell;
        }

    public PizzaCell getEndCell(){
        return endCell;
        }

    public setEndCell(PizzaCell endCell){
        this.endCell = startCell;
        }

    public statstartingCellic Slice(){
        this.startCell = PizzaCell();
        this.endCell = PizzaCell();
        }

    public static Slice(PizzaCell startCell,PizzaCell endCell){
        this.startCell = startCell;
        this.endCell = startCell;
        }

}
