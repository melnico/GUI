package org.example;

public class PythonDeveloper extends Developer {

    public PythonDeveloper(String name, String level, int experience, String set_of_technologies) {
        super(name, level, experience, set_of_technologies);
    }

    @Override
    public void doCode() {
        System.out.println("");
        System.out.println("Python developer starting write code");
        System.out.printf(getName()+" "+getLevel()+" "+getExperience());
    }
}