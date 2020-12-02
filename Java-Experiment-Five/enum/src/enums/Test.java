package enums;

public class Test {
    public  static void main(String []args){
        University[] universities=University.values();
        for(University university:universities) {
            System.out.println(university.getChineseName() + university.getCity()+university.getCity().getChineseName());
        }
    }
}
