public class Phone {
    public int number, weight;
    public String model, name, telephone;

//Input characteristics method
    public void setValues(int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

//Output characteristics method
    public void getValues(int number, String model, int weight){
        System.out.println("Number: " + this.number + "\nModel: " + this.model + "\nWeight: " + this.weight + "\n");
    }

//Constructor w/ 3 parameters
    public Phone(int number, String model, int weight){
        setValues(number, model, weight);
        getValues(number, model, weight);
    }

//Constructor w/ 2 parameters
    public Phone(int number, String model){
        setValues(number, model, weight);
        getValues(number, model, weight);
    }

//Empty constructor
    public Phone(){

    }

//Method receiveCall
    public static void receiveCall(String name, String telephone){
        System.out.println(name + " calls. Number of the abonent: " + telephone);
    }

}
