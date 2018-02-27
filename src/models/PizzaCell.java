package models;
public class PizzaCell(){

    private int row;
    private int column;

    public String toString(){
        return String.valueOf(this.row) + " " + String.valueOf(this.column);
        }

    public int getRow(){
            return row;
        }

    public setRow(int row){
            this.row = row;
        }

    public int column(){
            return column;
        }

    public setColumn(int endColumn){
            this.column = column;
        }
    public static PizzaCell(){
            this.row = 0;
            this.column = 0;
        }

    public static PizzaCell(int x,int y){
            this.row = x;
            this.column = y;
        }


}