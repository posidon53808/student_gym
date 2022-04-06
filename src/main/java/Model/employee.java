package Model;

public class employee {
 private Integer id;
 private String roomNumber;
 private String idCard;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(String roomNumber, String idCard) {
	super();
	this.roomNumber = roomNumber;
	this.idCard = idCard;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
}
public String getIdCard() {
	return idCard;
}
public void setIdCard(String idCard) {
	this.idCard = idCard;
}
 
}
