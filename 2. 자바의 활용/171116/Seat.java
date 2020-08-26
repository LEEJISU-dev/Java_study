package Ex171116;

public class Seat {
	private String name;	// 예약자 이름

	Seat() {
		name = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void cancel() {
		name = null;
	}

	public void reserve(String name) {
		this.name = name;
	}

	public boolean isOccupied() {
		if (name == null)// 예약 안되어 잇음
			return false;
		else
			return true;
	}

	// 예약자 이름으로 조회 (쥐소시)
	public boolean match(String name) {
		return (name.equals(this.name));
	}

}
