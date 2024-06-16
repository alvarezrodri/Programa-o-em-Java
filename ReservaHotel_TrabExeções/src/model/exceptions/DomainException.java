package model.exceptions;

public class DomainException extends RuntimeException{	//nao sou obrigado a tratar com throws a minha classe principal

	private static final long serialVersionUID = 1L;	//assim que declara a versão de um serializable
														//serializable precisa ter um versão
	
	public DomainException(String msg) {
		super(msg);
	}
}
