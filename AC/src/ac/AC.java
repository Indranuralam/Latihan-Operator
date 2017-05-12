package ac;

public abstract class AC {
protected String merk;
protected String type;
  
protected void RuangExekutif(){
        System.out.println("Ruangan berAC");        
    }
 
 //deklarasi abstract method atau method abstract
    protected abstract void ruangtempatrapat();
    protected abstract void ruangtamu();          
}
