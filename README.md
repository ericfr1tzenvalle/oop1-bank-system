# 🏛️ OOP Bank System – Java Edition

![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
![Java](https://img.shields.io/badge/Java_24%2B-007396?style=for-the-badge&logo=java&logoColor=white)


> A banking system simulation in **Java**, applying professional **Object-Oriented Programming** principles.

---

## 🏦 About the System

This application replicates essential features of a banking platform, enabling **secure account access**, **CPF verification**, and **account management**.  
Designed for **learning** and **demonstrating** OOP concepts with clean code and a scalable architecture.

---

## 💼 Core Banking Features

| Feature                           | Description |
|-----------------------------------|-------------|
| 🔐 **Secure Login**               | CPF + password authentication |
| 🆔 **CPF Validation**              | Basic Brazilian CPF format check |
| 💳 **Checking Account**            | Withdraw with overdraft limit |
| 💰 **Savings Account**             | Withdraw only with available balance |
| 💵 **Deposits & Withdrawals**      | Core transaction operations |

---

## 🗂 System Architecture

**Pattern:** MVC (**Model-View-Controller**)  

```
src/main/java/org/contaBancaria/
│
├── controller/
│   ├── LoginController.java       # Handles login & session
│   └── ContaController.java       # (In progress) Account operations
│
├── model/
│   ├── Banco.java                 # Bank entity & accounts storage
│   ├── Conta.java                 # Abstract account class
│   ├── ContaCorrente.java         # Checking account implementation
│   ├── ContaPoupanca.java         # Savings account implementation
│   └── Validador.java             # CPF and data validators
│
├── view/
│   └── LoginView.java             # Login user interface
│
└── Main.java                      # Application entry point
```

---

## 🖥 How to Run

```bash
# Clone repository
git clone https://github.com/ericfr1tzenvalle/oop1-bank-system.git

# Open in your preferred Java IDE
# Requirement: JDK 24 or higher

# Run the application
Main.java
```

---

## 📈 Roadmap

- [ ] Complete `ContaController` with transactions & statements  
- [ ] Implement account creation via menu  
- [ ] Add interest calculations for savings accounts  
- [ ] Hash passwords for security  
- [ ] Improve exception handling & validation  

---

## 🇧🇷 Versão em Português

### 🏦 Sobre o Sistema

Este sistema simula um **banco digital**, com autenticação segura, validação de CPF e gerenciamento de contas.  
Foi projetado para estudo e demonstração dos princípios da **Programação Orientada a Objetos** (POO).

---

### 💼 Funcionalidades Principais

| Funcionalidade          | Descrição |
|------------------------|-----------|
| 🔐 **Login Seguro**     | Autenticação com CPF + senha |
| 🆔 **Validação de CPF**  | Checagem do formato de CPF |
| 💳 **Conta Corrente**    | Saque com limite especial |
| 💰 **Conta Poupança**    | Saque apenas com saldo |
| 💵 **Depósitos/Saques**  | Operações básicas |

---

### 🖥 Como Executar

```bash
# Clonar repositório
git clone https://github.com/ericfr1tzenvalle/oop1-bank-system.git

# Abrir na sua IDE Java
# Requisito: JDK 24 ou superior

# Executar a aplicação
Main.java
```



