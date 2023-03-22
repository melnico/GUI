package org.example;

public class Main {
    public static void main(String[] args) {
        //Задание 4
        class Creator{
            public void create(String[] typeOfDeveloper) {
                switch (typeOfDeveloper[0]) {
                    case "JavaDeveloper" :
                        JavaDeveloper javaDeveloper = new JavaDeveloper(typeOfDeveloper[1], typeOfDeveloper[2], Integer.parseInt(typeOfDeveloper[3]), typeOfDeveloper[4]);
                        javaDeveloper.doCode();
                        break;
                    case "PythonDeveloper" :
                        PythonDeveloper pythonDeveloper= new PythonDeveloper(typeOfDeveloper[1], typeOfDeveloper[2], Integer.parseInt(typeOfDeveloper[3]), typeOfDeveloper[4]);
                        pythonDeveloper.doCode();
                        break;
                    default :
                        throw new RuntimeException("error: no such type of developer");
                }
            }
        }
        String[] developer1java = {"JavaDeveloper","Xprt1","juniour","1","Pattern, SQL, some technologies"};
        String[] developer2java = {"JavaDeveloper","Xprt2","juniour","2","Computer science, SQL, class"};
        String[] developer1python = {"PythonDeveloper","Xprt3","middle","15","SQL, HTML"};
        String[] developer2python = {"PythonDeveloper","Xprt4","juniour","2","Flask, Cherry, Django"};
        Creator creator = new Creator();
        creator.create(developer1java);
        creator.create(developer2java);
        creator.create(developer1python);
        creator.create(developer2python);

    }
}
