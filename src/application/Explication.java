package application;

import java.util.ArrayList;
import java.util.List;

public class Explication {
    public static void main(String[] args) {

        System.out.println("COVARIÂNCIA");

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0); // - covariância (permite acessar os elementos,
                                // porém nao permite adicionar)
        //list.add(20) <- não funciona

        for (Number c : list) {
            System.out.println(c);
        }

        System.out.println("-------------------------------------");

        System.out.println("CONTRAVARIÂNCIA");

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14); // contravariância (permite adicionar elementos de Number ou de qualquer supertipo de Number
                          // porém, não pode acessar os elementos da lista )
        // Number x = myNums.get(0) <- não funciona

        for (Object m : myNums) {
            System.out.println(m);
        }

        //https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e
    }
}
