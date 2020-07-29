
public class Seat {
    private int row;
    private String col;
    private Passenger passenger;
    
    public Seat(int row, String col){
        this.col = col;
        this.row = row;
        this.passenger = new Passenger("", "");
    }
    
    public boolean isFree(){
        String s = this.passenger.getName();
        if(s.equals("null")){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if (!(compared instanceof Passenger)){
            return false;
        }
        
        Seat comparedSeat = (Seat) compared;
        
        return this.row == comparedSeat.row && this.col.equals(comparedSeat);
    }
    
     public String toString(){
         if (!this.isFree()) {
            return "Asiento: " + this.row + this.col + ", libre.";
        }
        return "Asiento: " + this.row + this.col + ", ocupado. Pasajero: " + this.passenger.getName() + " " +  this.passenger.getLastname();
    }
     }
     
