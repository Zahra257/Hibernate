package hebernate;

public class hebernate {
	private int id;
	private String nom;
	private String prenom;
	private int age;
	
	public hebernate( String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public hebernate() {
		
	}

	public hebernate(int id, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
