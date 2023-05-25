
import java.util.Collection; //2

import java.util.List; //3

import java.util.Set; //4

public interface KlasaAbstrakcyjna { //5

    public void foo(); //6

    List<String> getList(); //7

    abstract Collection<Object> update(Set<String> set); //8

    String foo2(); //9

}
