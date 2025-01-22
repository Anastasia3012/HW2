//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weight1 = 78.2;
        System.out.println(weight1);
        var weight2 = 82.7;
        System.out.println(weight2);
        var weightGeneral = weight1 + weight2;
        System.out.println(weightGeneral);
        var weightDifference = weight1 - weight2;
        System.out.println(weightDifference);
        var overload = weight2 % weight1;
        System.out.println(overload);

        var hours = 640;
        System.out.println(hours);
        var workindDay = 8;
        System.out.println(workindDay);
        var workers = hours / workindDay;
        System.out.println("Всего работников в компании - " + workers + " человек.");

        workers = workers + 94;
        System.out.println(workers);
        hours = workers * workindDay;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + hours + " часов работы может быть поделено между сотрудниками.");


    }
}