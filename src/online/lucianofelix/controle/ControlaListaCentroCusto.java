package online.lucianofelix.controle;

import java.util.List;

import online.lucianofelix.beans.CentroCusto;

public class ControlaListaCentroCusto {

	private List<CentroCusto> iterableList;
	private int currentPosition;
	private int collectionSize;

	public ControlaListaCentroCusto(List<CentroCusto> iterableList) {
		super();
		this.iterableList = iterableList;
		this.currentPosition = currentPosition;
		this.collectionSize = collectionSize;
	}

	// Anda um item para a frente.
	public int getNextPosition() {
		setCurrentPosition(getCurrentPosition() + 1);
		return getCurrentPosition();
	}

	// Anda um item para trás.
	public int getPreviousPosition() {
		setCurrentPosition(getCurrentPosition() - 1);
		return getCurrentPosition();
	}

	// Pega um item em uma determinada posi��o.
	protected CentroCusto getCollectionItemAt(int position) {
		return getIterableList().get(position);
	}

	// Recupera o primeiro item da cole��o.
	public CentroCusto first() {
		return getCollectionItemAt(0);
	}

	// Recupera o �ltimo item da cole��o.
	public CentroCusto last() {
		return getCollectionItemAt(this.collectionSize);
	}

	// Recupera o pr�ximo item a partir da posi��o atual.
	public CentroCusto next() {
		return getCollectionItemAt(getNextPosition());
	}

	// Recupera o item anterior a partir da posi��o atual.
	public CentroCusto previous() {
		return getCollectionItemAt(getPreviousPosition());
	}

	// Recupera um item em qualquer posi��o.
	public CentroCusto getAt(int position) {
		return getCollectionItemAt(position);

	}

	public List<CentroCusto> getIterableList() {
		return iterableList;
	}

	public void setIterableList(List<CentroCusto> iterableList) {
		this.iterableList = iterableList;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

}
