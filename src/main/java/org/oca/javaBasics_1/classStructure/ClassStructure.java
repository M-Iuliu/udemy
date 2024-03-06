package org.oca.javaBasics_1.classStructure;

interface MyInterface{

}

 class NewClassStructure{
    int test = 1;

//    NewClassStructure(int test) {
//        System.out.println(test);
//    }

    void initiateTalk(String talk){

    }
    void pet(String sound){
        System.out.println(sound);
    }

    abstract class OtherClassStructure implements MyInterface{

    }

}


public class ClassStructure {
    String name;
    void initiateTalk(String talk){
        System.out.println(talk);
    }

   abstract class OtherClassStructure{

    }

}
