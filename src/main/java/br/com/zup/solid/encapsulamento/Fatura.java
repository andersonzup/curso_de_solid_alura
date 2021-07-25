package br.com.zup.solid.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean isPago() {
        double total = 0;
        for (Pagamento pagamento : getPagamentos()) {
            total += pagamento.getValor();
        }
        pago = total >= getValor();
        return pago;
    }


    public void realizarPagamento(Pagamento pagamento){
        double total;
        this.getPagamentos().add(pagamento);
    }
}

