package by.gsu.lab2;

public class Science extends Book{
	private String Tema;
	private String Diff;
	public Science() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Science(String izd, String author, String Tema, String Diff, int pages) {
		super(izd, author, pages);
		this.Tema = Tema;
		this.Diff = Diff;
		// TODO Auto-generated constructor stub
	}
	public Science(String tema, String diff) {
		super();
		Tema = tema;
		Diff = diff;
	}
	public String getTema() {
		return Tema;
	}
	public void setTema(String tema) {
		Tema = tema;
	}
	public String getDiff() {
		return Diff;
	}
	public void setDiff(String diff) {
		Diff = diff;
	}
	@Override
	 protected String getFullName() {
	        return super.getFullName()+";"+Tema + ";" +Diff  ;
	}
}
