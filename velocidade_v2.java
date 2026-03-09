import static java.lang.IO.*;
void main() {
    //entradas
    IO.print("Entre com o tempo (em horas): ");
    float tempo = Float.parseFloat(readln());

    IO.print("Entre com a velocidade: ");
    float velocidade = Float.parseFloat(readln());

    IO.print("entre com a autonomia: ");
    float autonomia = Float.parseFloat(readln());

    IO.print("Entre com o valor do litro do combustível: ");
    float valor = Float.parseFloat(readln());

    //processamentos
    float distancia = tempo * velocidade;
    float litros = distancia / autonomia;
    float custo = litros * valor;




    //saídas
    IO.println("Distância =" + distancia + "Km");
    IO.println("Velocidade =" + velocidade + "Km/h");
    IO.println("tempo =" + tempo +"hora(s)");
    IO.println("litros =" + String.format("%.2f", litros)+ "L");
    IO.print("valor gasto: "+ valor + "R$");
    IO.print("autonomia: "+ autonomia + "Km/l");
}