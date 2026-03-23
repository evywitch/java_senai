import static java.lang.IO.*;

void main() {
    //entradas
    IO.print("entre com o valor da prestação R$: ");
    float valor = Float.parseFloat(readln());
    IO.print("Entre com o tempo: ");
    float tempo = Float.parseFloat(readln());
    IO.print("informe a taxa: ");
    float taxa = Float.parseFloat(readln());

    //procesamento
    float prestacao = valor + (valor * (taxa / 100) * tempo);


    //saidas
    IO.print(prestacao);

}