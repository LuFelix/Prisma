import online.lucianofelix.visao.FrameInicial;

/**
 * 
 * Construir o m�todo pesquisa p�s venda de acordo com o roteiro de apresenta��o
 * do p�s venda. Construir classe LembretesSistema que lista uma tabela inferior
 * no frame inicial com uma lista selecion�vel com as op���es iguais �s do
 * gmail. Ao clicar na mensagem o painel de detalhes carrega a mensagem (a
 * tabela central est� livre nesse momento). Na mensagem tem um bot�o realizar
 * P�s Venda se o tipo de mensagem for lembrete de pedido. realizarPosVenda
 * carrega a tabela com os �ltimos atendimentos com esse cliente os bot�es novo
 * consultam que tela � e executam o m�todo correspondente a um novo elemento,
 * de acordo com seu tipo de tela. Criar a classe evento para colocar os dados
 * de um evento. Anfitri� - anfitria(pode ser nulo), tipoEventoServi�o(cuidados
 * com a pele, sess�o de beleza, tarde especial, etc) . Nessa classe se adiciona
 * os tipos de servi�o executados. a subtela de mensagens do sistema dever�
 * carregar uma agenda para auxiliar a1 marca��o desse agendamento. Construir o
 * sistema de gerenciamento das notas.
 * 
 * @author Luciano Felix
 *
 */
public class PrincipalNote {

	public static void main(String[] args) {
		new FrameInicial();

		// new FrameECF();
		// new ManipulaImagens();
		// JFrame frm1 = new JFrame("Cota��es");
		// JPanel pnlCotacoes = new JPanel(new BorderLayout());
		// exibeCotacoes();
		// new FrameLogin();
	}

	// static void exibeCotacoes() {
	// try {
	// DAOAtvYahoo daoAtv = new DAOAtvYahoo();
	// ArrayList<AtivoYahoo> listAtv = new ArrayList<AtivoYahoo>(
	// daoAtv.listarOrdIdNeg());
	// AtualizaYahoo atu = new AtualizaYahoo();
	//
	// for (int i = 0; i < listAtv.size(); i++) {
	// System.out.println("+++++++++++++++++===++++++++++++++++++++");
	// atu.atualizaCSV(listAtv.get(i).getIdYahoo());
	//
	// System.out.println("+++++++++++++++++===++++++++++++++++++++");
	// }
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
}
// DAOPessoaProfissional daopro = new DAOPessoaProfissional();
// DAOPessoaPG daop = new DAOPessoaPG();
// PessoaProfissional pp = new PessoaProfissional();
// Pessoa p = daop.listaPessoas().get(1);
//
// pp.setCodiPess(p.getCodiPessoa());
// pp.setCodiProf("6776555");
// pp.setNomeProf("Marceneiro");
// pp.setDocFunc("66645555");
// pp.setPis(78365438);
// pp.setOptante(true);
//
// daopro.cadastraFuncao(pp);
//
// pp = new PessoaProfissional();
// pp = daopro.listaEmpregosCodigo(p.getCodiPessoa()).get(0);
//
// System.out.println(
// pp.getCodiPess() + " " + pp.getNomeProf() + " " + pp.getPis());

// AtualizaSistemaBDIBovespa atuBov = new AtualizaSistemaBDIBovespa();
// atuBov.atualizaBancoManual();
// ManipulaArquivoTxt manTxt = new ManipulaArquivoTxt();
// manTxt.readCsvFile();
// AtualizaCotacaoAutHashSet atu = new AtualizaCotacaoAutHashSet();
// atu.run();
// AtuIntrDay atu = new AtuIntrDay();
// try {
// atu.atualizar();
// } catch (Exception e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }

//
// java.util.Date date = new java.util.Date(); // Right now
// java.sql.Timestamp timestamp = new
// java.sql.Timestamp(date.getTime());
// System.out.println("date: " + date);
// System.out.println("timestamp: " + timestamp);
// String data = timestamp.toString();
// String hora = ManipulaData.horaString(data);
// System.out.println("String: " + data);
// System.out.println("Hora: " + hora);
