import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Verificando se o um número pe par ou ímpar
        /*int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }*/

        //Verificando aprovação em uma disciplina
        /*double primeiraNota = 7.9;
        double segundaNota = 6.0;

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7.0) {
            System.out.printf("O estudante teve média %.2f e foi aprovado", media);
        } else if (media >= 5.0) {
            System.out.printf("O estudante teve média %.2f e esta em recuperação", media);
        } else {
            System.out.printf("O estudante teve média %.2f e foi reprovado", media);
        }*/

        //Validação de senha

        /*String senhaCorreta = "123456";
        System.out.println("Digite sua senha:");

        String tentativaSenha = sc.nextLine();
        sc.close();

        if (tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }*/

        //comparação de dois números

        /*System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = sc.nextInt();

        sc.close();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior nuúmero é " + primeiroNumero);
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O maior número é " + segundoNumero);
        } else {
            System.out.println("Os números são iguais");
        }*/

        //Desconto em compras

        /*System.out.println("Digite o valor da sua compra:");
        double valor = sc.nextDouble();
        double porcentagem = (double) 10 / 100;

        double valorDesconto = valor - (valor * porcentagem);

        if (valor >= 100.0) {
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: " + valorDesconto);

        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: " + valor);
        }*/

        //Verificação de dia util
        /*System.out.println("Digite o dia da semana (em minúsculas):");
        String dia = sc.nextLine();
        //Usando switch para resolver o exemplo

        switch (dia) {
            case "segunda":
            case "terca":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println(dia + " é um dia útil!");
                break;
            case "sabado":
            case "domingo":
                System.out.println("É fim de semana!");
                break;
            default:
                System.out.println("Dia inválido!");
        }

        //usando if para verificação
        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil");
        } else {
            System.out.println(dia + " não é um dia útil");
        }

        sc.close();*/

        //Verificando se um numero está no intervalo
        /*int inicioIntervalo = 1000;
        int fimIntervalo = 5000;

        System.out.println("Digite o valor do emprestimo:");
        int valorEmprestimo = sc.nextInt();

        if (valorEmprestimo >= inicioIntervalo && valorEmprestimo >= fimIntervalo) {
            System.out.println("O valor " + valorEmprestimo + " esta dentro do intervalo permitido para emprestimo");
        } else {
            System.out.println("O valor " + valorEmprestimo + " não esta dentro do intervalo permitido para emprestimo");
        }

        sc.close();*/

        //verificação de triangulo
        /*System.out.println("Digite o primeiro lado: ");
        int primeiroLado = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int segundoLado = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int terceiroLado = sc.nextInt();

        if ((primeiroLado + segundoLado) > terceiroLado && (primeiroLado + terceiroLado) > segundoLado && (segundoLado + terceiroLado) > primeiroLado) {
            System.out.println("Os lados podem formar um triangulo");
        } else {
            System.out.println("Os lados não podem formar um triangulo");
        }

        sc.close();*/

        //verificando compatibilidade de doação de sangue
        /*System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        int peso = sc.nextInt();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso >= 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compativel");
        } else {
            System.out.println("O doador não compativel");

            if (!idadeValida) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos");
            }

            if(!pesoValido) {
                System.out.println("Motivo: O peso deve ser maior que 50");
            }
        }

        sc.close();*/

        //Verificando código de acesso e nivel de permissão
        /*int codigoAcesso = 2023;
        int nivelMinimo = 1;
        int nivelMaximo = 3;
        System.out.println("Digite o código de acesso: ");

        int scCodigoAcesso = sc.nextInt();
        System.out.println("Digite o nivel de permissão");
        int scNivel = sc.nextInt();

        boolean verificaCodigo = codigoAcesso == scCodigoAcesso;
        boolean verificaNivel = scNivel >= nivelMinimo && scNivel <= nivelMaximo;

        if (verificaCodigo && verificaNivel) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado.");
            if (!verificaCodigo){
                System.out.println("Motivo: Código invalido");
            }
            if (!verificaNivel) {
                System.out.println("Motivo: nivel invalido");
            }
        }

        sc.close();*/



    }
}