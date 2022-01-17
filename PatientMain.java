public class PatientMain{
    String name;
    double h;
    double w;

    public PatientMain(String name, double h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
    public double computeBmi(){
        return w/(h*h);
    }

    public static void main(String[] args) {
        PatientMain obj=new PatientMain("Yash",14,33);
        System.out.println( obj.computeBmi());
    }
}