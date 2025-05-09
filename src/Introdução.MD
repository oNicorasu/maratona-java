# Introdução ao Java

---

## 📅 - 26/02/2025⤵️

### Organização do código em pacotes

Usar nome do site invertido em primeiro, logo depois nome do projeto e
<br> em seguida o nome do pacote.

***Ex:***

![Exemplo](img.png)

### Comentários

> 1. Comentário de uma linha - //
>2. Comentário de multiplas linhas /* ... */
>3. Javadoc:
> ```
>  /**
>  * Isso é um comentário <b>Javadoc</b>
>  */
> ```
>3. Não comentar o seu código, apenas javadocs ou faça uma documentação, caso precise muito.

---

### Tipos Primitivos

1. São escritos em letras minúsculas.
2. Temos 8 tipos primitivos:
    1. int
    2. double
    3. float
    4. char
    5. byte
    6. short
    7. long
    8. boolean
3. Tabela de tamanhos:

   | Tipos   | Tamanho em Bytes | Descrição                                                                             |
      |---------|------------------|---------------------------------------------------------------------------------------|
   | byte    | 1 byte           | Armazena todos os números de -127 até 127                                             |
   | short   | 2 bytes          | Armazena todos os números de -32,767 até 32,767                                       |
   | int     | 4 bytes          | Armazena todos os números de -2,147,483,648 até 2,147,483,647                         |
   | long    | 8 bytes          | Armazena todos os números de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807 |
   | float   | 4 bytes          | Armazena os números decimais de até 7 casas após a vírgula.                           |
   | double  | 8 bytes          | Armazena os números decimais de até 16 casas após a vírgula.                          |
   | boolean | 1 bit            | Armazena valores verdadeiro ou falso.                                                 |
   | char    | 2 bytes          | Armazena uma letra/um valor ASCII                                                     |

4. Conversão Literal
    - Faz com que possamos trocar o tipo de dados e colocá-lo em outro tipo.
    - Ex:`float salary = 2500.53F;`. Nesse caso podemos ver que sem o 'F' o tipo colocado no float é de um 'double' e
      com o 'F' podemos força-lo a ser um float.
5. Casting
    - Força um certo tipo a caber em outro mesmo que ele esteja a estourar o tipo.
    - Ex: `int age = (int) 10000000000L;`
    - Aqui esse número está a estourar o 'int', mas ele força ele a caber, mas pode ser que isso não aconteça.
6. String
    - `String nome = "Nicolas Mendes";`
    - ‘String’ é diferente dos outros tipos, pois é uma Classe, logo tem alguns métodos(funcionalidades) que os outros
      não tem.

<BR>

> 1. Boas práticas escrever as variáveis em inglês.<br>
>> 1. Nome de classes são todas as inicias maiúsculas.<br>
>>2. Nome de variáveis usam apenas a inicial maiúscula se forem palavras compostas.

Ex:

```
public class AulaDeJava { 
   int idadeEmAnos = 10;
}
```

---

## 📅 - 27/02/2025⤵️

### Operadores

1. Básicos:
    1. soma: +
    2. subtração: -
    3. divisão: /
    4. multiplicação: *
    5. resto: %
2. Relacionais:
    1. menor: <
    2. maior: >
    3. menor ou igual: <=
    4. maior ou igual: >=
    5. igual: ==
    6. diferente: !=
3. Lógicos:
    1. AND = &&
    2. OR = ||
    3. NOT = !
4. Atribuição:
    1. =
    2. +=
    3. -=
    4. *=
    5. /=
    6. %=
5. Unários:
    1. Incrementa em 1: ++
    2. Decrementa em 1: --

> Obs: Existe uma diferença de por antes ou depois da variável no caso dos 'unitários'.
> > ``` 
> > int contador = 0;
> > contador++;
> > System.out.println(contador); // contador = 1;
> > System.out.println(contador++); // contador = 1; A variável foi usada antes de incrementar.
> > System.out.println(contador); // contador = 2;
> > System.out.println(++contador); // contador = 3; Foi incrementado antes de usar a variável.
> > ```

---

### Estruturas Condicionais

1. if
   ```
      if(condição){ // Se true faz o bloco de códigos abaixo
         [código]
      }
   ```
2. else
   ```
      if(condição){ // Se falso pula para o bloco de cógido do 'else'
         [código]
      } else {
         [código]
      }
   ```
3. else-if
   ```
      if(condição){ // Se falso pula para o bloco de cógido do 2° if
         [código]
      } else if {
         [código]
      }
   ```
   4. Operador Ternário
       1. ```
            // if else normal
            (condição) ? (o que fai fazer se for verdadeiro) : (o que fai fazer se for falso);
            ```
       2. ```
            // if else-if else
            (1° condição) ? (verdadeiro) : (2° condição) ? (verdadeiro) : (falso);
            ```
5. Switch
   ```
   int num = 2;
   switch (num){
      case 1:
         [código];
         break;
      case 2:
         [código];
         break;
   }
   ```

---

## 📅 - 03/03/2025⤵️

### Estruturas de Repetição

1. While
   ```
   while(condição){
      [código]
      incrementar;
   }
   ```
2. Do While
   ```
   Do {
      [código]
   }while (condição);
   ```
3. For
   ```
   for (declaração do contador; condição ; incremento do contador){
      [código]
   }
   ```
> Break and Continue
> > - Break: serve para quebrar um loop(estrutura de repetição), pode ser usado dentro de um 'switch' ou loop apenas;
> > - Continue: serve para pular para a próxima iteração do loop;

---

## 📅 - 04/03/2025⤵️

### Arrays
```
tipo[] name;
tipo[] name = new tipo[tamanho];
tipo[] name = {1,2,3,4,5}; // outro jeito de declaração;
tipo[] name = new tipo[]{1,2,3,4,5}; // mais um outro jeito;
```
- Toda array é um objeto; 
- Todo array inicializado tem que ter um tamanho declarado;
- E na inicialização de cada posição do array tem um valor default por tipo;
  1. int, short, long, byte = 0;
  2. float, double = 0.0;
  3. String = null;
  4. char = '\u0000' = ' ';
  5. boolean = false;
- Não podemos acessar uma posição que não existe;
- O tamanho do 'Array' não pode mudar dinamicamente 

>```
>  // Foreach
>  for (tipo name:arrayName){
>      [código];
>  }
>  ```
>> Esse tipo de 'for' é muito usado para imprimir o array. Primeiro colocando uma variável de referência de mesmo tipo que o array, logo depois um ':' e o nome do array desejado.
> 
>> Assim ele vai acessar cada posição do array usando a variável de referência. Logo podemos utilizar a variável de referência para o objetivo do código, exemplo, imprimir o array. 

---

### Arrays Multidimensionais

```
// Nesse tipo de declaração temos que dizer pelo menos o 1° tamanho;
tipo[][] name = new tipo[tamanho][tamanho]; 
```

- Esquema de como seria uma Array Multidimencional de 3x3 de inteiros:


- ![img_1.png](img_1.png)


- Iniciando as Arrays:
  1. ```
     // Exemplo de declaração só com a 1° tamanho;
     
     int[][] arrayInt = new int[3][]; 
     arrayInt[0] =  new int[2];
     arrayInt[1] =  new int[3];
     arrayInt[2] =  new int[6]; 
     
     // Assim podemos fazer cada array de tamanho diferentes;
      ```
  2. ```
     // Exemplo declarando já os valores
     
     int[][] arrayInt = new int[3][]; 
     
     arrayInt[0] =  new int[]{1,2};
     arrayInt[1] =  new int[]{1,2,3};
     arrayInt[2] =  new int[]{1,2,3,4,5,6};
     
     /** 'arrayInt[0] = {1,2};' Quando lidamos com Arrays Multidimensionais não podemos
      *  fazer esse tipo de iniciação, que no caso de um array normal poderíamos.
     */
      ```
  3. ```
     // Exemplo declarando já os valores de forma mais direta
     
     int[][] arrayInt1 = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};
      ```
- Para acessar os valores dentro dessa matriz temos como usar o for ou o foreach:
  - ```
    // Imprimindo uma matriz com for
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    ```
  - ```
    // Imprimindo uma matriz com foreach
        for (int[] matriz1:matriz) {
            for (int matriz2:matriz1) {
                System.out.print(matriz2 + " ");
            }
            System.out.print("\n");
        }
    ```

---