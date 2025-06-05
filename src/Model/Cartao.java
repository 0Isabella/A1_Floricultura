package Model;

import View.InputHelper;

public class Cartao {
    public String escreverTexto(){
        InputHelper.InputText("------------------------------------------");
        InputHelper.InputText("| Digite a frase que quer escrever: |");
        String frase = InputHelper.lerString("|  -> " + " |");
        InputHelper.InputText("------------------------------------------");
        return frase;
    }

}
