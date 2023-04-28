package conversordemoedas;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ConverterMoeda extends Conversor {
    public ConverterMoeda() {
        super();
    }

    public void converterMoeda() {
        try (Scanner entrada = new Scanner(System.in)) {
            int escolha = 0;
            String opcao1;
            String opcao2;
            boolean continuar = true;

            while (continuar) {
                try {
                    double vl = 0;
                    System.out.println("Bem vindo ao conversor de moedas! \nPara continuar selecione uma das opções abaixo:\n" +
                            "1 - Converter\n" +
                            "2 - Sair do programa");
                    escolha = entrada.nextInt();
                    if (escolha == 2) {
                        System.out.println("Finalizando...");
                    } else if (escolha == 1) {
                        System.out.println("Selecione a moeda a ser convertida:\n" +
                                "BRL - Real brasileiro\n" +
                                "USD - Dolar\n" +
                                "EUR - Euro\n" +
                                "GBP - Libra esterlina\n" +
                                "CHF - Franco suico");
                        entrada.nextLine();
                        opcao1 = entrada.nextLine().toUpperCase();
                        System.out.println("Para: \n" +
                                "BRL - Real brasileiro\n" +
                                "USD - Dolar\n" +
                                "EUR - Euro\n" +
                                "GBP - Libra esterlina\n" +
                                "CHF - Franco suico");
                        opcao2 = entrada.nextLine().toUpperCase();
                        System.out.println("Informe o valor: ");
                        double valorintro = entrada.nextDouble();
                        if ((opcao1.equals("BRL")) && (opcao2.equals("USD"))) {
                            vl = valorintro / MoedaEnum.USD.getValor();
                            System.out.printf("De Real para dolar: $%.2f.%n", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / MoedaEnum.EUR.getValor();
                            System.out.printf("De Real para euro: €%.2f.%n", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / MoedaEnum.GBP.getValor();
                            System.out.printf("De Real para libra esterlina: £%.2f.%n", vl);
                            inflacaoReal();
                        } else if ((opcao1.equals("BRL")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / MoedaEnum.CHF.getValor();
                            System.out.printf("De Real para Franco Suico: CHF%.2f.%n", vl);
                            inflacaoReal();

                        }
                        if ((opcao1.equals("USD")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.19;
                            System.out.printf("De Dolar para Real: R$%.2f.%n", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("EUR"))) {
                            vl = valorintro / 1.08;
                            System.out.printf("De Dolar para Euro: €%.2f.%n", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("GBP"))) {
                            vl = valorintro / 1.22;
                            System.out.printf("De Dolar para Libra Esterlina: £%.2f.%n", vl);
                            inflacaoEUA();
                        } else if (opcao1.equals("USD") && (opcao2.equals("CHF"))) {
                            vl = valorintro / 1.09;
                            System.out.printf("De Dolar para Franco Suico: CHF%.2f.%n", vl);
                            inflacaoEUA();
                        }

                        if ((opcao1.equals("EUR")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.18;
                            System.out.printf("De euro para Real: R$%.2f.%n", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.93;
                            System.out.printf("De euro para Dolar: $%.2f.%n", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / 0.88;
                            System.out.printf("De euro para Libra Esterlina: £%.2f.%n", vl);
                            inflacaoEuro();
                        } else if ((opcao1.equals("EUR")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / 0.99;
                            System.out.printf("De euro para Franco Suico: CHF%.2f.%n", vl);
                            inflacaoEuro();
                        }

                        if ((opcao1.equals("GBP")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.16;
                            System.out.printf("De Libra Esterlina para Real: R$%.2f%n.", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.82;
                            System.out.printf("De Libra Esterlina para Dolar: $%.2f.%n", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / 0.88;
                            System.out.printf("De Libra Esterlina para Euro: €%.2f.%n", vl);
                            inflacaoLibra();
                        } else if ((opcao1.equals("GBP")) && (opcao2.equals("CHF"))) {
                            vl = valorintro / 0.89;
                            System.out.printf("De Libra Esterlina para Franco Suico: CHF%.2f.%n", vl);
                            inflacaoLibra();
                        }

                        if ((opcao1.equals("CHF")) && (opcao2.equals("BRL"))) {
                            vl = valorintro / 0.18;
                            System.out.printf("De Franco Suico para Real: R$%.2f.%n", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("USD"))) {
                            vl = valorintro / 0.92;
                            System.out.printf("De Franco Suico para Dolar: $%.2f.%n", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("EUR"))) {
                            vl = valorintro / 0.99;
                            System.out.printf("De Franco Suico para Euro: €%.2f.%n", vl);
                            inflacaoFrancoSuico();
                        } else if ((opcao1.equals("CHF")) && (opcao2.equals("GBP"))) {
                            vl = valorintro / 1.13;
                            System.out.printf("De Franco Suico para Libra Esterlina: £%.2f.%n", vl);
                            inflacaoFrancoSuico();
                        }
                    }
                } catch (InputMismatchException | IllegalStateException e) {
                    while (escolha != 1 && escolha != 2 && escolha != 3) {
                        System.out.println("ERRO. Finalizando...");
                        break;
                    }
                }
                if (continuar) {
                    boolean opcaoValida = false;
                    while (!opcaoValida) {
                        System.out.println("Selecione uma das opções:\n" +
                                "1 - Nova conversão\n" +
                                "2 - Finalizar");
                        int opcaoContinuar = entrada.nextInt();
                        if (opcaoContinuar == 2) {
                            continuar = false;
                            System.out.println("Finalizando...");
                            opcaoValida = true;
                        } else if (opcaoContinuar == 1) {
                            opcaoValida = true;
                        } else {
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                        }
                    }
                }
            }

            entrada.close();
        }
    }
}