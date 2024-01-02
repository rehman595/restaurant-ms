
import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner(System.in);

    public void meal() {

        System.out.println(
                "Enter (1) for Eating Items     Enter (2) for Drinks\nEnter (3) Deserts              Enter (4) for Salids ");
        int respond = in.nextInt();
        switch (respond) {

            case 1:
                eatingItem();
                break;
            case 2:
                drinks();
                break;
            case 3:
                deserts();
                break;
            case 4:
                salids();
                break;
            default:
                System.out.println("Please select right option/number!");
        }
        meal();

    }

    public void eatingItem() {
        int pizza = 600;
        int burgger = 450;
        int roll = 250;
        int friz = 200;
        int broust = 350;
        System.out.println(
                "(1)Pizza => Rs 600    (2)Burgger => Rs 450\n(3)Roll => Rs 250;    (4)Friz => Rs 200\n(5)Broust => Rs 350");
        int selectEat = in.nextInt();

        switch (selectEat) {
            case 1:
                selectEat = pizza;
                quantity(pizza);
                break;
            case 2:
                selectEat = burgger;
                quantity(burgger);
                break;
            case 3:
                selectEat = roll;
                quantity(roll);
                break;
            case 4:
                selectEat = friz;
                quantity(friz);
                break;
            case 5:
                selectEat = broust;
                quantity(broust);
                break;
            default:
                System.out.println("Please select right option/number!");

                break;
        }

    }

    public void drinks() {
        int colddrink = 70;
        int fruitjuis = 120;
        int shakes = 450;
        int watorBotle = 60;
        System.out.println(
                "(1)Colddrink => Rs 70    (2)Fruitjuis => Rs 120;\n(3)Shakes => Rs 450    (4)WatorBotle => Rs 60");
        int selectDri = in.nextInt();
        switch (selectDri) {
            case 1:
                selectDri = colddrink;
                quantity(selectDri);
                break;
            case 2:
                selectDri = fruitjuis;
                quantity(fruitjuis);
                break;
            case 3:
                selectDri = shakes;
                quantity(shakes);
                break;
            case 4:
                selectDri = watorBotle;
                quantity(watorBotle);
                break;
            default:
                System.out.println("Please select right option/number!");

                break;
        }

    }

    public void deserts() {
        int icecream = 200;
        int brawnie = 180;
        int paistry = 150;
        System.out.println("(1)Icecream => Rs 200    (2)Brawnie => Rs 180 \n(3)Paistry => Rs 150");
        int selectDesr = in.nextInt();
        switch (selectDesr) {
            case 1:
                selectDesr = icecream;
                quantity(icecream);
                break;
            case 2:
                selectDesr = brawnie;
                quantity(brawnie);
                break;
            case 3:
                selectDesr = paistry;
                quantity(paistry);
                break;
            default:
                System.out.println("Please select right option/number!");
                break;
        }
    }

    public void salids() {
        int russian_salid = 400;
        int fruit_salid = 400;
        int vegetable_salid = 250;
        System.out.println("(1)Russian_salid => Rs400    (2)Fruit_salid => Rs 400\n(3)Vegetable_salid => Rs 250");
        int selectSalid = in.nextInt();
        switch (selectSalid) {
            case 1:
                selectSalid = russian_salid;
                quantity(russian_salid);
                break;
            case 2:
                selectSalid = fruit_salid;
                quantity(fruit_salid);
                break;
            case 3:
                selectSalid = vegetable_salid;
                quantity(vegetable_salid);
                break;
            default:
                System.out.println("Please select right option/number!");
                break;
        }
    }

    public void bills(int quantity, int price) {
        System.out.println("here's your bill => " + price * quantity);
    }

    public void quantity(int price) {
        System.out.println("Please Enter quantity.");
        int quantity = in.nextInt();
        bills(quantity, price);
    }

}