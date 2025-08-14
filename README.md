# Princípios SOLID no Java

O SOLID é um conjunto de cinco princípios de design de software que ajudam a criar sistemas mais flexíveis, escaláveis e fáceis de manter.

---

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
