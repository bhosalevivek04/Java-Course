package com.vivek.enumExamples;

public class Basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //this are enum constants
//        public static and final
//        since its final you can't create child enum
//        type is Week

        void display(){

        }
        Week(){
            System.out.println("Constructor called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("How are You");
        }
        //this is not public or protected, only private or default
        //internally: public static final Week Monday=new Week();
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
//        for (Week day:Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());
    }
}
