

// Classe Aeronave
class Aeronave {
    private Assento[][] assentos;

    public Aeronave() {
        assentos = new Assento[20][11];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 11; j++) {
                if ((j >= 3 && j <= 7) && j != 10) { // Poltronas da coluna do meio
                    if (i < 5) {
                        assentos[i][j] = new AssentoPrimeiraClasse();
                    } else {
                        assentos[i][j] = new AssentoEconomico();
                    }
                } else if ((j < 3 || j > 7) && j != 10) { // Poltronas das janelas
                    if (i < 5) {
                        assentos[i][j] = new AssentoPrimeiraClasse();
                    } else {
                        assentos[i][j] = new AssentoEconomico();
                    }
                } else { // Poltronas inexistentes
                    assentos[i][j] = null;
                }
            }
        }
    }

    public String reservarAssento(int fileira, int poltrona) {
        if (fileira < 1 || fileira > 20 || poltrona < 1 || poltrona > 11 || assentos[fileira - 1][poltrona - 1] == null) {
            return "Posição inválida";
        }

        Assento assento = assentos[fileira - 1][poltrona - 1];
        if (assento.reservar()) {
            int valor = (assento instanceof AssentoPrimeiraClasse) ? 150 : 100;
            return "Assento reservado com sucesso. Valor: R$" + valor + ",00";
        } else {
            return "Assento já está ocupado";
        }
    }
}