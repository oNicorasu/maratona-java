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

> 1. Boas práticas escrever as variaveis em inglês.<br>
>    1. Nome de classes são todas as inicias maiúsculas.<br>
>    2. Nome de variáveis usam apenas a inicial maiúscula se forem palavras compostas.
>>Ex: <br>
> public class AulaDeJava { <br>
>  int idadeEmAnos = 10;<br>
> }

