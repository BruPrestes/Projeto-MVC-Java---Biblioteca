package controle;
import modelo.Livro;
import javax.faces.bean.ManagedBean;
@ManagedBean

public class LivroMB {
	private Livro n_livro = new Livro();
	
	public LivroMB() {
	//construtor da classe LivroMB - item obrigatório
	}

	public String getNome() {
		return n_livro.getNome();
	}
	
	public void setNome(String nome) {
		n_livro.setNome(nome);
	}
	
	public String getAutor() {
		return n_livro.getAutor();
	}
	
	public void setAutor(String autor) {
		n_livro.setAutor(autor);
	}
	
	public String getPaginas() {
		return String.valueOf(n_livro.getPaginas());
	}
	
	public void setPaginas(String paginas) {
		
	n_livro.setPaginas(Integer.parseInt(paginas));
	}
}
