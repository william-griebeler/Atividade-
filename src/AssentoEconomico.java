

// Classe AssentoEconomico
class AssentoEconomico implements Assento {
    private boolean reservado;

    public AssentoEconomico() {
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
        return "Econômico";
    }
}