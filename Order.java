package projDb_One;

public class Order {
	
	private int orderId;
	private int custId;
	private String empId;
	private int proId;
	private String orderDate;
	private String ship;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getShip() {
		return ship;
	}
	public void setShip(String ship) {
		this.ship = ship;
	}
	public Order(int orderId, int custId, String empId, int proId, String orderDate, String ship) {
		super();
		this.orderId = orderId;
		this.custId = custId;
		this.empId = empId;
		this.proId = proId;
		this.orderDate = orderDate;
		this.ship = ship;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
