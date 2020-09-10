package modelo;

public class Livro {
 
	//atributos
	private String _nome;
	private String _autor;
	private int _paginas;
	
	//construtores: personalizado e padrão
	public Livro(String nome, String autor, int paginas) {
		super();
		this._nome = nome;
		this._autor = autor;
		this._paginas = paginas;
	}

	public Livro() {
		//construtor padrão
	}

	
	//getters and setters
	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		this._nome = nome;
	}

	public String getAutor() {
		return _autor;
	}

	public void setAutor(String autor) {
		this._autor = autor;
	}

	public int getPaginas() {
		return _paginas;
	}

	public void setPaginas(int paginas) {
		this._paginas = paginas;
	}
	
	
	
	
	
	
}
