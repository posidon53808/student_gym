package Model;

public class student {
 private Integer id;
 private String roomNumber;
 private String idCard;
 private String equipment;
 private String time;
public student() {
	super();
	// TODO Auto-generated constructor stub
}

public student( String roomNumber, String idCard, String equipment, String time) {
	super();
	this.roomNumber = roomNumber;
	this.idCard = idCard;
	this.equipment = equipment;
	this.time = time;
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

public String getEquipment() {
	return equipment;
}

public void setEquipment(String equipment) {
	this.equipment = equipment;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}
 
}
