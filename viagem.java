import static java.lang.IO.*;
void main() {
    //entradas
    IO.print("Entre com o tempo (em horas): ");
    float tempo = Float.parseFloat(readln());

    IO.print("Entre com a velocidade: ");
    float velocidade = Float.parseFloat(readln());

    //processamentos
    float distancia = tempo * velocidade;
    float litros = distancia / 12;


    //saídas
    IO.println("Distância =" + distancia);
    IO.println("Velocidade =" + velocidade);
    IO.println("tempo =" + tempo +"hora(s)");
    IO.println("litros =" + String.format("%.2f", litros));
}