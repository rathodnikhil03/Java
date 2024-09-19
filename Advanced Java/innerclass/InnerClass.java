package innerclass;

class A { // OUTER CLASS

    public void OuterClass() {

//----------------------------------------------------------------------------------------------------------------------------------------------
        class Local {     //LOCAL INNER CLASS

            public void L_InnerClass() {

                System.out.println("It's a local inner class 'Local'");
            }
        }

        Local l = new Local()

//-----------------------------------------------------------------------------------------------------------------------------------------------
        {         //ANONYMOUS INNER CLASS
  
            public void L_InnerClass() {

                System.out.println("It's a new local inner class 'Local'");
            }

        };

        l.L_InnerClass();

        System.out.println("It's a outer class A");
    }

//---------------------------------------------------------------------------------------------------------------------------------------------

    class B { // MEMBER INNER CLASS

        public void Inner() {

            System.out.println("It's a inner class B");
        }
    }

//---------------------------------------------------------------------------------------------------------------------------------------------

    static class C { // STATIC INNER CLASS

        public void StaticInnerClass() {

            System.out.println("It's a static inner class C");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {

        A obj1 = new A();
        obj1.OuterClass();

        A.B obj2 = obj1.new B();
        obj2.Inner();

        A.C obj3 = new A.C();
        obj3.StaticInnerClass();
    }

}
