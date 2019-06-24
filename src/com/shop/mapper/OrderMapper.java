package com.shop.mapper;

import java.util.List;

import com.shop.entity.OrderDetails;
import com.shop.entity.Orders;
import com.shop.entity.Page;
import com.shop.entity.UserInfo;

public interface OrderMapper {
	public void insertNewOrder(Orders order);
	public void insertOrderDetails(List<OrderDetails> orderDetails);
	public List<Orders> selectOrdersByUserId(int userId);
	public List<OrderDetails> selectOrderDetailsByOrderId(String OrderId);
	public Orders selectOrderByOrderId(String OrderId);
	public List<Orders> selectOrdersByUserIdAndStatus(int userId,int status);
	public int selectAllOrderNum();
	public List<Orders> selectOrdersByPageNum(Page page);
	public void updateOrderStatus(String orderId);
}
