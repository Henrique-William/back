package atividade04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Henrique");
        pessoa1.setIdade(20);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Beatriz");
        pessoa2.setIdade(21);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Nazarete");
        pessoa3.setIdade(48);
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
