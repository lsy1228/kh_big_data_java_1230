package 스트림예제7번;

import java.util.ArrayList;
import java.util.List;

public class StreamObjTest {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("유나", 21, 1000));
        customerList.add(new TravelCustomer("남평선", 38, 3000));
        customerList.add(new TravelCustomer("남해이", 17, 1600));
        customerList.add(new TravelCustomer("민지", 18, 2000));
        System.out.println("고객 명단 출력");
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total);
        System.out.println("== 20세 이상 성인 출력 ==");
        customerList.stream()
                .filter(c->c.getAge() >= 20)
                .map(c->c.getName())
                .sorted()
                .forEach(s-> System.out.println(s));
    }
}
class TravelCustomer {
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
