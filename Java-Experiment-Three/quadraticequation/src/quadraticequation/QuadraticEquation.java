package quadraticequation;

public class QuadraticEquation {
    private double a,b,c;
    private double discriminant;
    QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        this.discriminant =this.b*this.b-4*this.a*this.c;
        return discriminant;
    }
    public double gerRoot1(){
        if(discriminant >=0){
            return (-this.b+Math.sqrt(discriminant))/2*this.a;
        }
        else{
            return 0;
        }
    }
    public double gerRoot2(){
        if(discriminant >=0){
            return (this.b+Math.sqrt(discriminant))/2*this.a;
        }
        else{
            return 0;
        }
    }
}
