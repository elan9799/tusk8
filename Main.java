import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turn turn = new Turn();
        Scanner sc = new Scanner(System.in);
        turn.addNewOne(sc.next());
        turn.addNewOne(sc.next());
        turn.ShowAllTurn();
        int len = turn.getQuantityInTurn();
        System.out.println("кол во в очереди = " + len);
        turn.getNextInTurn();
        turn.clear();
        turn.ShowAllTurn();
        turn.addNewOne2();
        turn.ShowAllTurn();


        List list = new List();
        list.showList();
        list.reverse();
        list.showList();
        list.getEvenNumbers();
    }
}
class Turn {
    ArrayList<String> turn = new ArrayList<>();
    public void addNewOne (String add){
        turn.add(add);
    }
    public void ShowAllTurn () {
        System.out.println(Arrays.toString(new ArrayList[]{turn}));
    }
    public int getQuantityInTurn (){
        return turn.size();
    }
    public void getNextInTurn () {
        System.out.println(turn.get(0));
    }
    public void clear () {
        turn.clear();
    }

    public void addNewOne2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи имена через пробел");
        String line = sc.nextLine();
        String[] line2 = line.split(" ");
        for (int i = 0; i < line2.length; i++) {
            turn.add(line2[i]);
        }
    }
}
class List {
    ArrayList<Integer> list = new ArrayList<>();
    public List (){
        System.out.println("размер списка = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
    }
    public void reverse (){
        ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
        list.clear();
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(list2.size() - 1 - i));
        }
    }
    public void getEvenNumbers (){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list2.add(list.get(i));
            }
        }
        System.out.println(Arrays.toString(new ArrayList[]{list2}));
    }
    public void showList () {
        System.out.println(Arrays.toString(new ArrayList[]{list}));
    }
}