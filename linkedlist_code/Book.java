package linkedlist_code;

public class Book {
	
	private int pageno;
	private String authorname;
	private String genre;
	
	
	/**
	 * @param pageno
	 * @param authorname
	 * @param genre
	 */
	public Book(int pageno, String authorname, String genre) {
		
		this.setPageno(pageno);
		this.setAuthorname(authorname);
		this.setGenre(genre);
	}
	
	
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
