import static java.lang.IO.*;

void main() {

    IO.print("Gostaria de adotar um cachorro? ");
    char adotar = readln().charAt(0);

    if  (adotar == 'S'|| adotar == 's'|| adotar == 'S' || adotar == 's'){


        IO.print("Seu quintal é grande? ");
        char quintal = readln().charAt(0);

        IO.print("Consegue passear duas vezes ao dia? ");
        char passear = readln().charAt(0);


        if  (quintal == 'S'|| quintal == 's'|| passear == 'S' || passear == 's')
        { IO.println("Ótimo pode adotar!!!"); }

        else { IO.print("Não pode adotar. "); }

    } else { IO.print("Que pena, talvez na próxima então... "); }



}