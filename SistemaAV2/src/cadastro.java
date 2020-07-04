import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class cadastro {
    private static Object Matricula;

    public static void main(String args[]) {
            Scanner ler = new Scanner(System.in);

       /* try {
            int pass  = ler.nextInt();
            System.out.println(pass);                   try catch de tentativa de login interativo
        } catch(Exception erro) {
            System.out.println("Ocorreu o erro: "+erro);
        }*/
            ArrayList<funcionary> fun = new ArrayList(); //array para armazenar os dados
            ArrayList<driver> dri = new ArrayList();
            ArrayList<van> car = new ArrayList();
            ArrayList<client> cli = new ArrayList();

            //criando

            funcionary f1 = new funcionary("861624", "Gabriel Coimbra", "09/03/1998", "1238129", "coimbrox", "1234");
            driver d1 = new driver(1, 2323, "12398129", "Lucas", "7/07/1777", "7777", "lucas777", "7777777");
            client c1 = new client("Mussurunga, II setor i casa 6", "Mussurunga 2 setor i casa 6", "UNIRB - patamares", "10,00", "998989", "Gabriel Coimbra");
            client c2 = new client("Mussurunga, II setor i casa 6", "Mussurunga 2 setor i casa 6", "UNI\"lucas777\",\"7777777\"RB - patamares", "10,00", "998989", "Inque Rafael");
            client c3 = new client("Mussurunga, II setor i casa 6", "Mussurunga 2 setor i casa 6", "UNIRB - patamares", "10,00", "998989", "Paulo Miguel");
            van v1 = new van("77777", "9898jv3");

            //adicionando a array list
            fun.add(f1);
            dri.add(d1);
            cli.add(c1);
            cli.add(c2);
            cli.add(c3);
            car.add(v1);

            //Array Van
            String[] car1 = {d1.getName()};
            int[] car2 = {d1.getRota()};
            String[] car3 = {c1.getName(), c2.getName(), c3.getName()};
            // car.add(v1);
            //for funcionario

            try {
                for (funcionary g : fun) {
                    System.out.println("Funcionário");
                    System.out.println("*************");
                    System.out.println("Matricula: " + g.getMatricula());
                    System.out.println("Nome: " + g.getName());
                    System.out.println("CPF: " + g.getCpf());
                    System.out.println("Data De Nascimento: " + g.getDatadeNascimento());
                    System.out.println("Login: " + g.getLogin());
                    System.out.println(g.Authenticator("coimbrox", "1234"));
                    System.out.println("");
                }
            } catch (Exception error0) {
                System.out.println("Ocorreu o erro na exibição dos Funcionários " + error0);
            }
                // for motorista

                try {
                    for (driver d : dri) {
                        System.out.println("Motorista");
                        System.out.println("***********");
                        System.out.println("Matricula: " + d.getMatricula());
                        System.out.println("Nome: " + d.getName());
                        System.out.println("CPF: " + d.getCpf());
                        System.out.println("Data de Nacimento: " + d.getDatadeNascimento());
                        System.out.println("Rota: " + d.getRota());
                        System.out.println(d.Authenticator("lucas777", "7777777"));
                        System.out.println("");
                    }
                } catch (Exception error1) {
                    System.out.println("Ocorreu o erro na exibição dos Motoristas " + error1);
                    }
                    //for cliente
                    try {
                        for (client c : cli) {
                            System.out.println("Cliente");
                            System.out.println("*****************");
                            System.out.println("Matricula: " + c.getMatricula());
                            System.out.println("Nome: " + c.getName());
                            System.out.println("CPF: " + c.getCpf());
                            System.out.println("Data de Nacimento: " + c.getDatadeNascimento());
                            System.out.println("Endereço: " + c.getAddress());
                            System.out.println("");

                        }
                    } catch (Exception error2) {
                        System.out.println("Ocorreu o erro na exibição dos clientes " + error2);
                    }
                    // for van

                    try {
                        for (van v : car) {
                            System.out.println("Van");
                            System.out.println("*************");
                            System.out.println("Numero do Chassi: " + v.getChassi());
                            System.out.println("Numero da Placa: " + v.getPlaca());
                            for (int i = 0; i < car1.length; i++) {  //para percorrer e colocar os itens com base na demanda
                                System.out.println("Motorista: " + car1[i]);
                            }
                            for (int i = 0; i < car2.length; i++) {  //para percorrer e colocar os itens com base na demanda
                                System.out.println("Rota:  " + car2[i]);
                            }
                            for (int i = 0; i < car3.length; i++) {  //para percorrer e colocar os itens com base na demanda
                                System.out.println("Clientes: " + car3[i]);
                            }
                        }
                    } catch (Exception error3) {
                        System.out.println("Ocorreu o erro na exibição das Vans " + error3);

                    }


                }
            }


/* os try catch estão entre os fors, sendo assim para testar os erros é só alterar algo dentro dos fors como por exemplo o nome da variavel dele, tentei fazer criando um login a pedido do usuário, só que ia acabar tendo mais trabalho para realocar com base na logica utilizada */