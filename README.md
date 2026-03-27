# Encapsulamento
## Exercício de Técnicas de Programação

### 1. Carro
- Evolua o conceito Carro do exercício e defina 1 método para calcular o valor total  para encher o tanque. Este deve receber como parâmetro o valor da gasolina.
&nbsp;

   **OBS:**
   - Crie um atributo capacidadeTanque na classe.
   - Usuário deve entrar com as informações do carro.
   - Crie métodos específicos para fornecer e obter os valores dos atributos(set/get), caso aplicável.
_____________________________________________________________________________________________________________

### 2. ContaBancaria
- Crie uma classe ContaBancaria com os atributos privados saldo e titular. O saldo só pode ser alterado através de um método público chamado depositar e sacar, que recebe como parâmetro o valor a ser depositado e só permite valores positivos.
&nbsp;

   **OBS:**
   - Adicione um método sacar que também recebe um valor e subtrai do saldo, mas só se o valor for menor ou igual ao saldo atual. 
   - Crie instâncias dessa classe no método main e teste as operações.
_____________________________________________________________________________________________________________

### 3. Produto
- Implemente uma classe Produto com os atributos privados nome, preco e quantidadeEstoque. Crie métodos getters e setters para esses atributos.
&nbsp;
   
   **OBS:**
   - Adicione uma regra no setter de preco que impede a definição de valores negativos. 
   - No setter de quantidadeEstoque, o valor deve ser ajustado apenas se for maior ou igual a zero. 
   - No método main, crie um objeto Produto e teste as restrições definidas.