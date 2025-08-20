# Princípios SOLID no Java

O SOLID é um conjunto de cinco princípios de design de software que ajudam a criar sistemas mais flexíveis, escaláveis e fáceis de manter.

## **S** – *Single Responsibility Principle* (Princípio da Responsabilidade Única)
> Uma classe deve ter apenas **uma única responsabilidade** e, portanto, apenas **uma razão para mudar**.
> 
> Exemplo: Ter uma classe NotaFiscal não é se concentrar tudo nela,  ela vai ter outras classes que fazem a sua responsabilidade e juntando todas as classes é obtido o resultado do processo de emissão de uma NotaFiscal.

---

## **O** – *Open/Closed Principle* (Princípio Aberto/Fechado)
> Entidades de software devem estar **abertas para extensão**, mas **fechadas para modificação**.
>
> Exemplo: Herdar ou Implementar (classe ou interface), para que você adicione novas funcionalidades ou funções sem que você altere o código original e seu objetivo.

---

## **L** – *Liskov Substitution Principle* (Princípio da Substituição de Liskov)
> Objetos de uma classe derivada devem poder **substituir objetos da classe base** sem alterar o comportamento correto do programa.
>
> Exemplo: Possível fazer substituição de classes, ou seja, se essas classes têm a mesma mãe, então é possível fazer substituição delas por outras classes que herdam da mesma mãe.

---

## **I** – *Interface Segregation Principle* (Princípio da Segregação de Interface)
> É melhor ter **muitas interfaces específicas** do que **uma interface genérica** que força classes a implementar métodos desnecessários.
>
> Exemplo: Ter interfaces específicas que contenham somente as operações necessárias que você precisa e utiliza.

---

## **D** – *Dependency Inversion Principle* (Princípio da Inversão de Dependência)
> **Dependa de abstrações**, não de implementações concretas.
>
> Exemplo: Depender de classes/interfaces de abstrações e não de concretas (que fazem a implementação).

---

<br><br>

# Exemplos na prática

## S - Single Responsibility Principle
> - [Versão sem o **S** do SRP](https://github.com/deisesalless/solid-java-codigo/commit/a508ee9704a26aadb0219ff968490bbcb2c47101) – implementação sem aplicar o princípio da responsabilidade única.
> - [S do SRP com implementação obrigatória de cálculo de bonificação](https://github.com/deisesalless/solid-java-codigo/commit/4706f8424d3345f27585c97c6bd9c6622b0da454) – evita bugs futuros por manutenção feita por outros desenvolvedores.
> - [S do SRP padronizando bonificação](https://github.com/deisesalless/solid-java-codigo/commit/c5eef0b9953458e63e2eef5aab0fe59b04b16279) – todos os cargos recebem **0,00** por padrão e apenas os que sobrescrevem o método têm bonificação calculada.

---

## **S**, **O** e **D** juntos
> - [Versão sem o **SOD** do SOLID](https://github.com/deisesalless/solid-java-codigo/commit/fdeea55ba0ebca32fb7a1ab386cdba96ec60bd5f) – implementação sem aplicar o princípio da responsabilidade única + princípio de aberto/fechado + princípio de inversão de dependência.
> - [Versão com o **S** do SOLID](https://github.com/deisesalless/solid-java-codigo/commit/89b41ee834e641b28da1c7805e473c27b430d5f0) – comentando parte do código que enfatiza onde já possui a Responsabilidade Única.
> - [Versão com o **O** do SOLID](https://github.com/deisesalless/solid-java-codigo/commit/1f1ceb441ffe0eaf314831874b573117f0ca35bf) – implementação de parte do código para o Princípio de Aberto/Fechado, alterando o if-else da classe Caixa para o uso de uma interface **Transportadora**.
> - [Versão com o **O** do SOLID](https://github.com/deisesalless/solid-java-codigo/commit/6a7ba293e08c0569a12ff0bf4a8829b59a9cce29) – implementação de parte do código para o Princípio de Aberto/Fechado, alterando o venda.setDesconto() da classe Caixa para o uso de uma interface **TabelaDesconto**.
> - [Versão com o **D** do SOLID](https://github.com/deisesalless/solid-java-codigo/commit/107212234d686798e6321112e655e2a5436a0d84) – implementação de parte do código para o Princípio de Inversão de Dependência, alterando os atributos da classe Caixa para o uso de uma interface **AcoesAposFaturamento**.


---

## L - Liskov Substitution Principle
> - [Versão sem o **L** do LSP](https://github.com/deisesalless/solid-java-codigo/commit/4aa410822bfa2070f9b6dd83ec14988c66629f19) – implementação sem aplicar o princípio Liskov de substituição.
> - [Versão com o **L** do LSP](https://github.com/deisesalless/solid-java-codigo/commit/a3b7f8a23a3cb2cb46f8ac9803936cd4238cc760) – no exemplo 1, a classe base é Conta, porém as classes de implementação sendo as classes ContaPremium e ContaUniversitaria, podem ser substituídas pela classe Conta, e as classes filhas podem ser substituídas entre si.
