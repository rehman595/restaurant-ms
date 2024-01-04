
import java.util.Scanner;

import beans.FoodItemBean;

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
        FoodItemBean pizza = new FoodItemBean("pizzaFagita", 650);
        FoodItemBean pizza2 = new FoodItemBean("peproneiPizza", 600);

        FoodItemBean burgger1 = new FoodItemBean("zingerBurgger", 405);
        FoodItemBean roll = new FoodItemBean("biyariRoll", 250);
        FoodItemBean friz = new FoodItemBean("friz", 200);
        FoodItemBean broust = new FoodItemBean("chickenBroust", 350);

        System.out.println(
                "(1)Pizza fagita => Rs 650    (2)Pepronei Pizza => 600\n(3)Burgger => Rs 450         (4)Roll => Rs 250;    \n(5)Friz => Rs 200            (6)Chicken Broust => Rs 350");
        int selectEat = in.nextInt();

        switch (selectEat) {
            case 1:
                quantity(pizza.price);
                break;
            case 2:
                quantity(pizza2.price);
                break;
            case 3:

                quantity(burgger1.price);
                break;
            case 4:

                quantity(roll.price);
                break;
            case 5:

                quantity(friz.price);
                break;
            case 6:
                quantity(broust.price);
            default:
                System.out.println("Please select right option/number!");

                break;
        }

    }

    public void drinks() {
        FoodItemBean pepsi = new FoodItemBean("Pepsi", 70);
        FoodItemBean orangJuice = new FoodItemBean("Orang juice", 120);
        FoodItemBean kitkatShake = new FoodItemBean("Kitkat Shake", 450);
        FoodItemBean WaterBottle = new FoodItemBean("Water bottle", 60);

        System.out.println(
                "(1)Colddrink => Rs 70    (2)Fruitjuis => Rs 120;\n(3)Shakes => Rs 450      (4)WatorBotle => Rs 60");
        int selectDri = in.nextInt();
        switch (selectDri) {
            case 1:
                quantity(pepsi.price);
                break;
            case 2:
                quantity(orangJuice.price);
                break;
            case 3:
                quantity(kitkatShake.price);
                break;
            case 4:
                quantity(WaterBottle.price);
                break;
            default:
                System.out.println("Please select right option/number!");

                break;
        }

    }

    public void deserts() {
        FoodItemBean icecream = new FoodItemBean("icecream", 200);
        FoodItemBean brawnie = new FoodItemBean("brawnie", 180);
        FoodItemBean paistry = new FoodItemBean("paistry", 150);

        System.out.println("(1)Icecream => Rs 200    (2)Brawnie => Rs 180 \n(3)Paistry => Rs 150");
        int selectDesr = in.nextInt();
        switch (selectDesr) {
            case 1:

                quantity(icecream.price);
                break;
            case 2:

                quantity(brawnie.price);
                break;
            case 3:
                quantity(paistry.price);
                break;
            default:
                System.out.println("Please select right option/number!");
                break;
        }
    }

    public void salids() {
        FoodItemBean russianSalid = new FoodItemBean("Russian Salid", 400);
        FoodItemBean fruitSalid = new FoodItemBean("Fruit Salid", 400);
        FoodItemBean vegetableSalid = new FoodItemBean("Vegetable salid", 250);

        System.out.println("(1)Russiansalid => Rs400    (2)Fruitsalid => Rs 400\n(3)VegetableSsalid => Rs 250");
        int selectSalid = in.nextInt();
        switch (selectSalid) {
            case 1:

                quantity(russianSalid.price);
                break;
            case 2:

                quantity(fruitSalid.price);
                break;
            case 3:

                quantity(vegetableSalid.price);
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