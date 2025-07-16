# Projeto de Transações e Estatísticas

## 📌 Descrição

Este projeto representa uma aplicação desenvolvida com **Spring Boot** para controle de transações financeiras.

- Os clientes podem registrar transações via API.
- Cada transação recebe um **ID criptografado** e a **hora exata** da operação.
- A aplicação disponibiliza um endpoint para **estatísticas em tempo real**, considerando somente transações realizadas **nos últimos 60 segundos**.
- A API está totalmente **documentada com Swagger**, acessível via `/swagger-ui.html`.

---

## 🚀 Funcionalidades

### POST `/transacao`
Registra uma nova transação.

---

### GET `/estatistica`
Retorna estatísticas sobre as transações feitas nos últimos 60 segundos.


---

## 🧱 Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger (Springdoc OpenAPI)

---

## 🗄️ Estrutura do Database

```sql
DROP DATABASE IF EXISTS desafio_backend;
CREATE DATABASE desafio_backend;
USE desafio_backend;

CREATE TABLE transacao (
  id INT AUTO_INCREMENT PRIMARY KEY,
  dataHora TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  valor DECIMAL(10,2) NOT NULL
);

CREATE VIEW vw_estatistica AS
SELECT
    1 AS id, -- sempre 1, pois a view retorna apenas uma linha
    COUNT(*) AS total_transacoes,
    SUM(valor) AS soma_transacoes,
    AVG(valor) AS media_transacoes,
    MIN(valor) AS min_transacoes,
    MAX(valor) AS max_transacoes
FROM transacao
WHERE dataHora >= NOW() - INTERVAL 60 SECOND;
```

---

## 🔐 Segurança

> Para fins de aprendizado, o ID foi criptografado com UUID (no Java) apenas como um exemplo de segurança leve.  
> Em um ambiente de produção, práticas robustas de segurança devem ser aplicadas (validação, autenticação, logs, etc).

---

## 🧠 Observações

Este projeto é **inspirado em um desafio técnico do Itaú**, mas foi **adaptado de forma pessoal** para fins de:

- Estudo e prática com Java moderno e Spring Boot
- Aprendizado sobre manipulação de views no MySQL
- Aplicação de commits semânticos no Git
- Prática de documentação e organização de código

---

## 📂 Organização do Projeto

```
📦 src
 ┣ 📂controller     → Controladores REST (TransacaoController, EstatisticaController)
 ┣ 📂entity         → Entidades JPA (Transacao, Estatistica)
 ┣ 📂repository     → Interfaces de repositório com Spring Data JPA
 ┣ 📂service        → Lógica de negócio
 ┣ 📂dto            → Controle de response e request
 ┗ 📜application.properties → Configurações do banco
```

---

## 📚 Documentação com Swagger

A documentação interativa da API está disponível automaticamente após subir a aplicação:

- URL: `http://localhost:8080/swagger-ui.html`  

---

#
