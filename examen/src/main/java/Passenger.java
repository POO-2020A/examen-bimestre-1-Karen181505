
public class Passenger {
    private String name;
    private String lastname;
    
    public Passenger(String name, String lastname){
        this.lastname = lastname;
        this.name = name;
        
    }
    
    public String toString(){
        return this.name + " " + this.lastname;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if (!(compared instanceof Passenger)){
            return false;
        }
        
        Passenger comparedPassenger = (Passenger) compared;
        
        return this.name.equals(comparedPassenger.name) && this.lastname.equals(comparedPassenger);
    }
    
    public String getName(){
        return this.lastname;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
}
