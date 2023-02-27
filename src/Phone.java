public class Phone {
    String type;
    String color;
    int data;
    int price;
    public String tele(){
        return"продается";
    }
    public void vyvodSvoistv(){
        System.out.println(type+" "+"цвет:"+color+" "+"" +"год выпуска:"+data+" "+"цена:"+price);
    }
}
