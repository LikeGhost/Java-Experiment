package staff;

import java.util.Date;

public class Test {
    private static void printName(Staff[] persons){
        for(Staff one:persons){
            System.out.println(one.getName());
        }
    }
    private static void printSalary(Staff[] staffs){
        for(Staff one:staffs){
            System.out.print(one.getName()+"的薪资：");
            System.out.println(one.getSalary());
        }
    }
    private static void printAllStaff(Staff[] staffs){
        for(Staff one:staffs){
           System.out.println(one.toString());
        }
    }
    private static void sortBySalary(Staff[] staffs){
        for(int i=0;i<staffs.length-1;i++){
            for(int j=1;j<staffs.length-i;j++){
                if(staffs[j-1].getSalary()<staffs[j].getSalary()){
                    Staff T=staffs[j-1];
                    staffs[j-1]=staffs[j];
                    staffs[j]=T;
                }
            }
        }
    }
    private static void sortByAge(Staff[] staffs){
        for(int i=0;i<staffs.length-1;i++){
            for(int j=1;j<staffs.length-i;j++){
                if(staffs[j-1].getAge()>staffs[j].getAge()){
                    Staff T=staffs[j-1];
                    staffs[j-1]=staffs[j];
                    staffs[j]=T;
                }
            }
        }
    }
    private static void sortByName(Staff[] staffs){
        for(int i=0;i<staffs.length-1;i++){
            for(int j=1;j<staffs.length-i;j++){
                if(staffs[j-1].getName().equals(staffs[j].getName())){
                    Staff T=staffs[j-1];
                    staffs[j-1]=staffs[j];
                    staffs[j]=T;
                }
            }
        }
    }
    private static void sortByDateHired(Staff[] staffs){
        for(int i=0;i<staffs.length-1;i++){
            for(int j=1;j<staffs.length-i;j++){
                if(staffs[j-1].getDateHired().equals(staffs[j].getDateHired())){
                    Staff T=staffs[j-1];
                    staffs[j-1]=staffs[j];
                    staffs[j]=T;
                }
            }
        }
    }
    public static void main(String []args) {
        Staff[] staffs=new Staff[7];
        //生成两个Staff对象
        staffs[0]=new Staff("张员","集美大学1号",40,0,11000,new Date(2000-1900,1,1));
        staffs[1]=new Staff("李工","集美大学2号",39,1,12000,new Date(2000-1900,2,2));

        //生成两个Teacher对象
        staffs[2]=new Teacher("王老","集美大学3号",38,0,11000,new Date(2001-1900,3,3),"计算机工程学院","软件工程",5000);
        staffs[3]=new Teacher("赵师","集美大学4号",37,1,12000,new Date(2001-1900,4,4),"计算机工程学院","软件工程",6000);

        //生成两个SecurityGuard对象
        staffs[4]=new SecurityGuard("钱保","集美大学5号",36,0,5000,new Date(2002-1900,5,5),"擒拿",1000);
        staffs[5]=new SecurityGuard("孙安","集美大学6号",35,1,6000,new Date(2002-1900,6,6),"散打",2000);

        //生成一个Dean对象
        staffs[6]=new Dean("周校","集美大学7号",34,1,15000,new Date(1999-1900,7,7),"计算机工程学院","软件工程",5000,5000);

        System.out.println("生成的若干个对象为：");
        printName(staffs);

        //根据薪资降序排序并输出
        System.out.println("根据薪资降序排序：");
        sortBySalary(staffs);
        printSalary(staffs);

        //根据年龄升序排序并输出
        System.out.println("根据年龄升序排序：");
        sortByAge(staffs);
        printAllStaff(staffs);

        //根据姓名升序排序并输出
        System.out.println("根据姓名升序排序：");
        sortByName(staffs);
        printName(staffs);

        //根据聘请时间升序排序并输出
        System.out.println("根据聘请时间升序排序：");
        sortByDateHired(staffs);
        printAllStaff(staffs);
    }
}
