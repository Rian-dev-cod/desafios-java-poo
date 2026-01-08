package desafioAtlas.nivel15;

public enum TipoOperacao {

	SAQUE{
		@Override
		public String gerarRelatorio(Cliente cliente, double valor) {
			return cliente.getNome() + " fez saque: R$" + valor;
		}

		
	},
	DEPOSITAR{
		@Override
		public String gerarRelatorio(Cliente cliente, double valor) {
			return cliente.getNome() + " fez Deposito: R$" + valor;
			
		}
	};
	
	public abstract String gerarRelatorio(Cliente cliente , double valor);
	
}
