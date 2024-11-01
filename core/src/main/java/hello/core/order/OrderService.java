package hello.core.order;

public interface OrderService {
    Order creaetOrder(Long memberId, String itemName, int itemPrice);
}
