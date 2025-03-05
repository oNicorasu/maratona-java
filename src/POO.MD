# Introdução a POO em Java

---

## 📅 - 04/03/2025⤵️

### Classes

- Estrutura da Classe Estudante:
  - ```
      public class Estudante {
          public String name;
          public int age;
          public char sexo;
      }
    ```
  - ![img_2.png](img_2.png)
  - Declaração de um objeto tipo 'Estudante'
    - ```
        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.sexo = 'M';
      ```
    - > Na declaração de um objeto de tipo 'Estudante' é usando uma variável de referência para fazer esse link com o objeto para termos acesso aos seus atributos.
    - > Na criação de um objeto com atributos já definidos dentro da classe, esses atributos seram inicializados com os seus respectivos valores padrões, podendo também já serem definidos por um valor padrão inicializado dentro na classe como, por exemplo: 
      - ```
        public class Estudante {
          public String name = Luffy;
          public int age = 21;
          public char sexo = 'M';
          }
        ```
  - Coesão
    1. Um propósito por classe.
    2. Não por a execução(main) da classe no próprio arquivo da classe.
    3. Altamente coeso é algo ótimo
  - Referência de objetos
    - É possível um mesmo objeto ser referenciado por 2 variáveis ao mesmo tempo.
      - ```  
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro2.nome = "Mitsubishi";
        carro2.ano = 2012;
        carro2.modelo = "Lancer Evolution IX";
        carro2.cor = "Cinza Strato";
        
        // atribuição para que o 'carro1' referencie o mesmo objeto que o 'carro2'
        
        carro1 = carro2; 
        ```

---

## 📅 - 05/03/2025⤵️

### Métodos

- São funções que fazem algo dentro da classe retornando algum valor ou não.


- ![img_3.png](img_3.png)
    - Modificador de acesso: Usado para a visualização do acesso.
  - Tipo de retorno:
    - void - Não retorna nada, mas normalmente ou imprimi algo, ou altera por referência.
      - Obs: Pode se usar o 'return', mas apenas para usá-lo como um 'break'.
    - tipos primitivos - vai retornar um valor do seu respectivo tipo.
  - Parâmetros: Usados para inserir algo que irá ser utilizado dentro do método.
  - ```
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println("Soma dos números :");
        System.out.print(num1+num2);
    }
    ```
- VarArgs: Um jeito de usar um array de mesmo tipo sem precisar declara-lo anteriormente.
  - ```
     // Varargs declaração como parâmetro dentro de um método
    
     public void metodName (int value, int... numbers){
       [code]
     }
    ```
  - ![img_4.png](img_4.png)
    - Do número 2 até o final, ele transforma em um array de inteiros, sendo importante caso utilizar o varargs é mantelo como último parâmetro para que ele reconheça todos os valores inseridos.
- >This: é usado para diferenciar um atributo da classe, de um parâmetro de mesmo nome.
  >>```
  >> public class Pessoa {
  >>    public String nome;
  >>    public int idade;
  >>
  >>    public void comparaIdade (int idade) {
  >>       if (this.idade == idade) {
  >>          System.out.println("Idades iguais!");
  >>       }
  >>    }
  >> }
  >>```

---



