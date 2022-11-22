package JavaHomeWorks005;

public class task001 {
    public static void printCity(City a){
        if(a != null){
            System.out.println(a.key + ". " + a.data);
        }
        else return;
        printCity(a.left);
        printCity(a.right);
    }


    public static void main(String[] args) {
        City root = new City("Москва", 1);

        City c2 = new City("Минск",2);
        City c3 = new City("Питер", 3);

        City c4 = new City("Брест",4);
        City c6 = new City("Хельсинки",6);
        City c7 = new City("Петразаводск",7);

        City c8 = new City("Гродно",8);
        City c9 = new City("Варшава",9);
        City c14 = new City("Архангельск",14);
        City c15 = new City("Мурманск",15);



        root.left = c2;
        root.right = c3;

        c2.left = c4;

        c3.left = c6;
        c3.right = c7;

        c4.left = c8;
        c4.right = c9;

        c7.left = c14;
        c7.right = c15;
        
        printCity(root);
                
    }
}
class City{
    String data;
    int key;
    public City(String data, int key) {
        this.data = data;
        this.key = key;
    }
    City left;
    City right; 
}
