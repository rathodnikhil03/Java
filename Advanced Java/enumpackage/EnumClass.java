package enumpackage;
enum Air
{
    Oxygen(8) , CarbonDioxide(6) , Hydrogen , Nitrogen(7);

    private int AtomicNumber;

    private Air(int atomicNumber) {
        AtomicNumber = atomicNumber;
        System.out.println("in parameter constructor : " + this.name());
    }

    private Air() {
        AtomicNumber = 1;
        System.out.println("in deflaut constructor : " + this.name());
    }

    public int getAtomicNumber() {
        return AtomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        AtomicNumber = atomicNumber;
        
    }
     
    

}
public class EnumClass {
    
    public static void main(String[] args) {
        
        for(Air a : Air.values()){
            System.out.println(a + " : " + a.getAtomicNumber());
        }
    }
}
