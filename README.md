
# Projeto Loja de Jogos

Esse programa, em java, simula o sistema de uma loja de jogos.

## Referência
 - [Autores]() 
 - [Projeto](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Funcionalidades](https://github.com/matiassingers/awesome-readme)
 - [Deploy]()
 - [Aprendizado]()


## Autores

- [@Matheus-Gabriel07](https://www.github.com/matheus-gabriel07)
- [@Felipe Eça](https://www.github.com/FelipeEca)
- [@Kaique Magalhães Santos](https://www.github.com/Kaique-ms27)
- [@Kauã da Silva Lazarim](https://www.github.com/lazarimkaua)

## Professor

- [@Gustavo Molina](https://www.github.com/gustavomolina17)

## Projeto

O projeto da loja de jogos, foi um desafio dado pelo professor e orientador da diciplina de Fundamentos de Programação Orientada a Objetos I do Senai, onde tivemos 8 horas para realizar um programa em JAVA, que realizasse:
    
 - O cadastro de usuários;
 - O cadastro de jogos, idicando o gênero do jogo;
 - O gerenciamento a partir de listas indicando a separação por gênero e uma lista geral;
 - A compra de qualquer jogo, dentro da faixa de preço mostrado, em um carrinho de compras. Que ao final, o usuário escolhe a forma de pagamento, e dependo da forma, há descontos ou não;

Além disso tinhamos que criar um simples banco de dados para armazenar o jogos catalógados dentro de um limite proposto.
## Funcionalidades

- Cadastro de usuários e novos jogos (Com limite de armazenamento);
- Lista de jogos por categorias e geral;
- Modo de compra;


## Code

Base de uma das opções

```bash
   if (opc == 6) {
        continuar = false;
        System.out.println("== Cadstro de Jogos == \n");
        System.out.println("Se desejar cadastrar um jogo, 
        digite 1; Para sair desta sessão digite 0");
        int op = sc.nextInt();

        while (op != 0) {
            int ac = 0, co = 0, av = 0;
            for (int total = (co + av + ac); total <= 12; total++) {
            ...
            }
```


## Aprendizados

Esse projeto foi um grande desafio, pois além do tempo curto, não podiamos usar mais do que um único objeto, e tivemos que buscar maneira de resolver problemas que foram surgindo, como o de Scanner, onde até o momento nem todos foram sulocionados. Também a utlização *"arraylist"*, contadores e laços de repetição, fez com que pensassemos para fazer um código funcional

Além dos problemas que tivemos, para este projeto utilizamos uma extensão do *Visual Studio Code*, chamada ***Live Share*** para que conseguimos trabalhar todos dentro de um único arquivo.

Mas no geral, foi um grande desafio e uma execelente oportunidade de aprendizagem, para que colocássemos tudo o que haviamos aprendido.

