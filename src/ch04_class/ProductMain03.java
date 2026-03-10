package ch04_class;

public class ProductMain03 {
    static void main() {
        // 클래스 이름 객체이름 = new 생성자이름();
        Product03 shin = new Product03("신라면", 1000, "2026-03-01");
        Product03 blackbean = new Product03("짜파게티", "2026-03-02");

        shin.display();
        blackbean.display();

        Product03 Banana = new Product03();

        int size = 2;
        System.out.println("상품 " + size + "를 배열로 다뤄 봅니다.");

//        int[] arr = new int[3];

        Product03[] itemlist = new Product03[size];
        itemlist[0] = new Product03("소이조이", 2000, "2026-03-01");
        itemlist[1] = new Product03("맥심커피", "2026-03-01");

        for (int i = 0; i < itemlist.length; i++) {
            System.out.println((i + 1) + "번째 상품을 출력합니다.");
            itemlist[i].display();
            System.out.println();
        }

        Product03[] productArray = {
                new Product03("쭈쭈바", 1500, "2026-03-22"),
                new Product03("사과", 3000, "2026-03-15"),
                new Product03("오징어땅콩", "2026-02-25")
        };

        for (int i = 0; i < productArray.length; i++) {
            System.out.println((i + 1) + "번째 상품을 출력합니다.");
            productArray[i].display();
            System.out.println();

        }
    }
}
