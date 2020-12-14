package ru.geekbrains.strategy;

public class ShopService {

    private Strategy strategy;

    public ShopService(Strategy strategy) {
        this.strategy = strategy;
    }

    public void createReport(){
        System.out.println("Вычитываю информацию по доступным товарам");
        Integer rest = 5;
        System.out.println("Остаток : " + rest);
        strategy.showShopName();
    }

    public static void main(String[] args) {
        Strategy bigStrategy = new BigShopStrategy();
        Strategy smallStrategy = new SmallStrategy();
        ShopService service = new ShopService(bigStrategy);
        service.createReport();
        System.out.println("---------------");
        ShopService smallShopservice = new ShopService(smallStrategy);
        smallShopservice.createReport();
    }
}
