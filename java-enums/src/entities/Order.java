package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private Date momet;
	private OrderStatus status;
	
	public Order(Integer id, Date momet, OrderStatus status) {
		this.id = id;
		this.momet = momet;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomet() {
		return momet;
	}

	public void setMomet(Date momet) {
		this.momet = momet;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", momet=" + momet + ", status=" + status + "]";
	}
	
	
}
