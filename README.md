Desafio Controle de Fluxo
Descrição
Este projeto tem como objetivo criar um sistema que recebe dois números inteiros via terminal, valida a ordem desses números e realiza uma contagem de interações, imprimindo números incrementados conforme o intervalo entre os dois parâmetros. Caso o primeiro número seja maior que o segundo, uma exceção personalizada será lançada para informar que o segundo parâmetro deve ser maior que o primeiro.

Requisitos
Java: Para rodar o projeto, é necessário ter o Java instalado em sua máquina.
IDE: Pode ser utilizado qualquer IDE que suporte Java, como IntelliJ IDEA, Eclipse ou NetBeans.
Estrutura do Projeto
O projeto é composto por duas classes principais:

Contador.java: A classe responsável pela lógica do programa, onde os parâmetros são recebidos, validados e os números são impressos conforme a contagem.
ParametrosInvalidosException.java: A exceção personalizada que é lançada quando o primeiro parâmetro é maior que o segundo.
Como Rodar
Clone este repositório para sua máquina.
Abra o projeto em sua IDE de preferência.
Compile e execute o programa. Durante a execução, o programa solicitará que você insira dois parâmetros inteiros via terminal.
O programa verificará se o primeiro parâmetro é maior que o segundo. Se for, uma exceção será lançada e a mensagem de erro será exibida.
Caso o primeiro parâmetro seja menor ou igual ao segundo, o programa irá imprimir uma sequência de números incrementados com base na diferença entre os dois parâmetros.
Exemplo de Execução
Entrada:

plaintext
Copiar
Editar
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30
Saída:

plaintext
Copiar
Editar
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
Se o primeiro parâmetro for maior que o segundo:

Entrada:

plaintext
Copiar
Editar
Digite o primeiro parâmetro
30
Digite o segundo parâmetro
12
Saída:

plaintext
Copiar
Editar
O segundo parâmetro deve ser maior que o primeiro
Exceção Personalizada
ParametrosInvalidosException: Esta exceção personalizada é lançada quando o primeiro parâmetro inserido for maior que o segundo, com a seguinte mensagem de erro:
mathematica
Copiar
Editar
O segundo parâmetro deve ser maior que o primeiro
Estrutura de Classes
Contador.java

Responsável por solicitar os parâmetros, validar os valores e contar as interações.
Utiliza a exceção personalizada ParametrosInvalidosException quando necessário.
ParametrosInvalidosException.java

Exceção personalizada que estende Exception, utilizada para indicar que os parâmetros fornecidos são inválidos.
Como Contribuir
Fork este repositório.
Crie uma branch para suas modificações (git checkout -b feature/nome-da-feature).
Faça suas modificações e commit (git commit -m 'Adicionando nova funcionalidade').
Push para a branch (git push origin feature/nome-da-feature).
Abra um pull request para revisão.
