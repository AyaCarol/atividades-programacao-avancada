package exercicioBanco;

class ContaPoupanca extends ContaBancaria {
    private static double rendimentoMensal;

    public ContaPoupanca(String titular, String agencia, String conta, double saldoInicial, double rendimentoMensal) {
        super(titular, agencia, conta, saldoInicial);
        ContaPoupanca.rendimentoMensal = rendimentoMensal;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void aplicarRendimento() {
        double rendimento = saldo * (rendimentoMensal / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado. Novo saldo: R$ " + saldo);
    }
}
