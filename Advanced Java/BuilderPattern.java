//You can create the files .java it's your choice i mention the comment.
// Computer.java
class Computer {
    private String CPU;
    private String RAM;
     

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
         
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU='" + CPU + '\'' + ", RAM='" + RAM + '\'' +'}';
    }

    // Builder class
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
// BuilderPattern.java
public class BuilderPattern {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .build();

        Computer officeComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
