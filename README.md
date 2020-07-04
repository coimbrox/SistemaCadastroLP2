
Uma cooperativa de vans está precisando se renovar. Precisa de um sistema para automatizar seu atendimento, uma vez que tudo ainda é feito no tradicional bloco de papel. Para o sistema, será necessário um cadastro: funcionários, motoristas, clientes e vans.

Funcionário: matricula, cpf, nome, data de nascimento, pis, usuário, senha;

Motorista: matricula, cpf, nome, data de nascimento, pis, rota, usuário, senha, número da cnh;

Cliente: matrícula, cpf, rg, nome, endereço, origem, destino, valor do serviço;


Van: chassi, placa, rota, motorista e lista de clientes;

Lembrando que a matrícula é gerada automaticamente ao se cadastrar um novo funcionário, motorista ou cliente, e que o CPF não pode ser mudado, sendo apenas definido ao cadastrá-lo. Além disso, funcionário e motorista têm seus login, logo precisam ter uma interface que os definam como autenticáveis.

A classe main, irá cadastrar um funcionário, um motorista, três clientes e uma van. Essa van terá que receber o seu motorista e a sua lista de clientes. Lembrando que possíveis erros podem acontecer ao cadastrá-la, devendo ter seu erro tratado.

Lembrem-se de criar diferentes classes e construtores, procurando evitar ao máximo a repetição de códigos.
