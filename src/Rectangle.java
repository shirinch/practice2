public class Rectangle {
   private int dlinaOne;
   private int dlinaTwo;
    private int dlinaThree;


    public double areaRectangle(){
        double perimetr = (dlinaOne + dlinaTwo + dlinaThree)/2;
        double j=perimetr*(perimetr - dlinaOne)*(perimetr - dlinaTwo)*(perimetr - dlinaThree);
        double area = Math.sqrt(j);
        return area;
    }
    public void setDlinaOne(int dlinaOne){
        this.dlinaOne = dlinaOne;
    }
    public int getDlinaOne(){
        return getDlinaOne();
    }
    public void setDlinaTwo(int dlinaTwo){
        this.dlinaTwo = dlinaTwo;
    }
    public int getDlinaTwo(){
        return getDlinaTwo();
    }
    public void setDlinaThree(int dlinaThree){
        this.dlinaThree = dlinaThree;
    }
    public int getDlinaThree(){
        return  getDlinaThree();
    }

}
