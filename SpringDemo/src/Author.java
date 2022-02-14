import java.util.Objects;

public class Author 
{
private Integer authorID;
private String name,country;
private Book book;
public Integer getAuthorID() {
	return authorID;
}
public void setAuthorID(Integer authorID) {
	this.authorID = authorID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
@Override
public int hashCode() {
	return Objects.hash(authorID, book, country, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Author other = (Author) obj;
	return Objects.equals(authorID, other.authorID) && Objects.equals(book, other.book)
			&& Objects.equals(country, other.country) && Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Author [authorID=" + authorID + ", name=" + name + ", country=" + country + ", book=" + book + "]";
}
public Author(Integer authorID, String name, String country, Book book) {
	super();
	this.authorID = authorID;
	this.name = name;
	this.country = country;
	this.book = book;
}
public Author() {
	super();
}
}
