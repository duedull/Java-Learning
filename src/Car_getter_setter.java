public class Car_getter_setter {
        private final String model;
        private String color;
        private int price;

        //when we define the access specifier to be private..they cant be accessed outside the class
        Car_getter_setter( String model, String color, int price){
            this.model = model;
            this.color = color;
            this.price = price;
        }

        String getModel(){
            return model;
        }
        String getColor(){
            return color;
        }
        int getPrice(){
            return price;
        }

        void setColor(String a){
            this.color = a;
        }
        void setPrice(int b){
            this.price = b;
        }
}
