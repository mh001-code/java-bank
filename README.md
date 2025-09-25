# Java Bank - Desafio DIO

Este projeto foi desenvolvido como parte do **Desafio de Programação Orientada a Objetos (POO)** da [Digital Innovation One (DIO)](https://www.dio.me/).  
O objetivo é consolidar conceitos fundamentais de POO através da simulação de um **sistema bancário básico**, incluindo contas, PIX, investimentos e histórico de transações.

---

## Descrição do Desafio

O sistema bancário implementado permite:

- Criação de contas bancárias
- Depósitos e saques
- Transferências via **PIX**
- Criação de carteiras de investimento
- Acompanhamento do histórico de transações financeiras

A proposta é aplicar os pilares da **POO** (herança, encapsulamento, polimorfismo e abstração), além de boas práticas de modelagem e organização de código.

---

## Objetivos de Aprendizagem

Ao concluir este desafio, foi possível:

- Aplicar conceitos de **orientação a objetos** em Java  
- Implementar entidades com **herança** e **composição**  
- Criar **repositórios** simulando persistência em memória  
- Utilizar **Lombok** para reduzir boilerplate de código  
- Trabalhar com **enums** e **records** para modelagem de dados  
- Exercitar a construção de menus e fluxos interativos via console  
- Documentar processos técnicos de forma clara e estruturada  
- Utilizar o **GitHub** como ferramenta de versionamento e portfólio  

---

## O que foi aprendido

Durante o desenvolvimento deste projeto, os seguintes aprendizados foram consolidados:

Herança e Polimorfismo: A classe abstrata Wallet serviu como base para AccountWallet e InvestmentWallet, permitindo reuso de código e especialização de comportamento.

Encapsulamento: Os atributos foram protegidos e acessados via getters, garantindo segurança e consistência dos dados.

Abstração: O conceito de “carteira” (Wallet) foi abstraído para representar tanto contas quanto investimentos, simplificando a modelagem.

Composição: A relação entre InvestmentWallet e AccountWallet demonstrou como objetos podem se relacionar para formar estruturas mais complexas.

Enums e Records:

BankService (enum) para representar tipos de serviços.

Investment e MoneyAudit (records) para modelar dados imutáveis de forma clara e concisa.

Uso do Lombok: Redução de código repetitivo com @Getter, @EqualsAndHashCode, @ToString.

Persistência em memória: Implementação de repositórios (AccountRepository e InvestmentRepository) simulando armazenamento de dados.

Boas práticas de modelagem: Organização em pacotes (model e repository), clareza nos nomes de classes e métodos, e uso de testes para validar a lógica.

---

## Autor
Projeto desenvolvido por Marcio Henrique F. Gonçalves no contexto do curso da DIO. Este repositório faz parte do meu portfólio de estudos em Java e Programação Orientada a Objetos.
