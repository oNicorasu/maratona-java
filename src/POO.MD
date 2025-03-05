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

### Métodos

- Nada mais que funções que fazem algo dentro da classe retornando algum valor ou não.
  - ```
    public void somaDoisNumeros() {
          System.out.println("Soma dos números :");
          System.out.println(10+10);
    }
    ```
  - 'void' é que não irá retornar nada nesse método.