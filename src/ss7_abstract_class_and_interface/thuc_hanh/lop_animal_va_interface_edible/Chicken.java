package ss7_abstract_class_and_interface.thuc_hanh.lop_animal_va_interface_edible;

public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken: cluck cluck!";
    }
    public String howToEat(){
        return "could be fried";
    }
}