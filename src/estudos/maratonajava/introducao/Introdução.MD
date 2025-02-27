# Introdução ao Java

---

## 📅 - 26/02/2025⤵️
### Organização do código em pacotes

Usar nome do site invertido em primeiro, logo depois nome do projeto e 
<br> em seguida o nome do pacote.

***Ex:***

![Exemplo](img.png)

### Comentários

>1. Comentário de uma linha - //
>2. Comentário de multiplas linhas /* ... */
>3. ```
>   /**
>   * Isso é um comentário <b>Javadoc</b>
>   */
>   ```
>4. Não comentar o seu código, apenas javadocs ou faça uma documentação, caso precise muito.

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

<BR>

4. Conversão Literal
   - Faz com que possamos trocar o tipo de dados e colocá-lo em outro tipo.
   - Ex:`float salary = 2500.53F;`. Nesse caso podemos ver que sem o 'F' o tipo colocado no float é de um 'double' e com o 'F' podemos força-lo a ser um float.
5. Casting
   - Força um certo tipo a caber em outro mesmo que ele esteja a estourar o tipo.
   - Ex: `int age = (int) 10000000000L;`
   - Aqui esse número está a estourar o 'int', mas ele força ele a caber, mas pode ser que isso não aconteça.
6. String
   - `String nome = "Nicolas Mendes";`
   - ‘String’ é diferente dos outros tipos, pois é uma Classe, logo tem alguns métodos(funcionalidades) que os outros não tem.

<BR>

>1. Boas práticas escrever as variáveis em inglês.<br>
   >>1. Nome de classes são todas as inicias maiúsculas.<br>
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


