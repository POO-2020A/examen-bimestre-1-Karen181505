import java.util.ArrayList;
public class Plane {
    private ArrayList<Seat> seats;
    private int rowls;
    private int cols;
     public Plane(int rowls, int cols){
         this.rowls = rowls;
         this.cols = cols;
         this.seats=new ArrayList<>();
        String col ="";
         if(this.cols ==1){
             col = "A";
         }
         if(this.cols ==2){
             col = "B";
         }
         if(this.cols ==3){
             col = "C";
         }
         if(this.cols ==4){
             col = "D";
         }
         if(this.cols ==5){
             col = "E";
         }
         if(this.cols ==6){
             col = "F";
         }
         if(this.cols ==7){
             col = "G";
         }
         if(this.cols ==8){
             col = "H";
         }
         Seat seat = new Seat(this.rowls, col);
         this.seats.add(seat);
         
     }
      @Override
     public String toString(){
         ArrayList <String> list = new ArrayList<>();
        for(int i =0; i < this.rowls; i++){
            String fila = i+1 + " ";
            String columna ="";
            for(int j=1; j <= this.cols; j++){
                if(j==1){
                    columna = columna + "A";
                }
                if(j==2){
                    columna = columna + "B";
                }
                if(j==3){
                    columna = columna + "C";
                }
                if(j==4){
                    columna = columna + "D";
                }
                if(j==5){
                    columna = columna + "E";
                }
                if(j==6){
                    columna = columna + "F";
                }if(j==7){
                    columna = columna + "H";
                }
                if(j==8){
                    columna = columna + "I";
                }
            }
            list.add(fila+ " " + columna);
        }
        for(String lista: list){
            System.out.println( lista + "");
        }
        return  " ";
     }
     
     public void setCols(int cols){
         this.cols = cols;
     }
     
     public void setRowls(int rowls){
         this.rowls = rowls;
     }
     
     public int getCols(){
         return this.cols;
     }
     
     public int getRowls(){
         return this.rowls;
     }
     
     public ArrayList getSeat(){
         if(!this.seats.isEmpty()){
             return null;
         }
         return this.seats;
     }
    
}
