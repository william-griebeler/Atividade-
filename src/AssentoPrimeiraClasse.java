// Classe AssentoPrimeiraClasse
class AssentoPrimeiraClasse implements Assento {
    private boolean reservado;

    public AssentoPrimeiraClasse() {
        this.reservado = false;
    }

    @Override
    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Primeira Classe";
    }
}