import javax.sound.midi.SysexMessage;

// MÉTODO MAIN
public class EstudanteMain {
    public static void main (String [] args){
        Estudante estudante1 = new Estudante();
        estudante1.nome = "João Vitor";
        estudante1.idade = 18;
        estudante1.altura = "1.76";
        estudante1.cor = "pardo";
        estudante1.sexo = "MASCULINO";

        Estudante estudante2 = new Estudante();
        estudante2.nome = "MARIA FERNANDA";
        estudante2.idade = 18;
        estudante2.altura = "1.80";
        estudante2.cor= "branca";
        estudante2.sexo = "FEMININO";

        Estudante estudante3 = new Estudante();
        estudante3.nome = "Joaozinho";
        estudante3.idade = 18;
        estudante3.altura = "1.70";
        estudante3.sexo = "MASCULINO";
        estudante3.cor = "pardo";

        System.out.println("ESTAS SÃO AS SEGUINTES CARACTERISTICAS DO MEU ESTUDANTE\n");
        System.out.println("NOME :" + estudante1.nome );

    // consigo modificar os objetos que foram criados;
        // consigo acrescentar novos estudantes utilizando o mesmo objeto
    }
}
