
public class Price {
	String source ;
	String destination;
	int price;
	int vacancies;
	public int getVacancies() {
		return vacancies;
	}
	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}
	public String toString() {
		return "Passenger [source=" + source + ", Destination=" + destination+"]";
	}
	public Price(String source, String destination, int price, int vacancies) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.vacancies = vacancies;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
