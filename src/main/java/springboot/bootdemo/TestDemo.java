package springboot.bootdemo;

import springboot.bootdemo.bean.Person;

public class TestDemo {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("zhangsan");
        person.wight=90;
        person.setWight(1111);

        Person person2=new Person();
        person2.setName("lisi");
        Person.setWight(93);
//        person2.wight=18;
        System.out.println("person=="+person+",person2=="+person2);
    }
}
