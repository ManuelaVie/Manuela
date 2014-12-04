/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manuela;

/**
 *
 * @author ManuelaV
 */


public class Lapin {
public String name;
public integer age;

public void crier() {
    System.out.println("haaaaaaaaaaa");
}

    public Lapin(String name, integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(integer age) {
        this.age = age;
    }
}


