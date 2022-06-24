# Readme for Bank Application in JAVA Swing

## Prérequis

* Installer NetBeans (Derniere Version)
* Installer tous les prérequis pour compiler un code Java (JDK, SDK...)

## Etapes de compilation du code

* Ouvrir Netbeans
* Ouvrir projet dans NetBeans
* Ajouter le fichier *sqlite-jdbc3.20.1.jar* au librairie  du projet
* Compiler le projet en appuyant sur le button Run

## Connection

* AdminID : Admin
* Password : root


## Information sur les differentes parties de l'application

### Account
La parties account permet de creer un nouveau compte courant ou epargne en fournissant:
* Le propriétaire
* Le numero de compte (qui est unique)
* Le solde initial

### Overview
Il s'agit de la parties de l'application qui renseigne les information necessaires sur un compte
et prend juste *Le Numero de compte*

### Deposits
Il s'agit de la partie de l'application qui gere les depots sur un compte donner donc il prend comme information :
* Le numero du compte
* Le montant à ajouter au compte (>0)

### Withdraw
Il s'agit de la partie de l'application qui gere les retraits sur un compte donner donc il prend comme information :
* Le numero du compte
* Le montant à retirer du compte (>0 && <solde)

### Loan
Il s'agit de la partie de l'application qui gere l'ajouter des prets à un compte , donc il prend comme information :
* Le numero du compte
* Le montant à emprunter (>0)
* La mensualité du pret effectuer

NB: Pour un compte chaque pret est numeroter suivant son ordre d'emprunt

### Pay Loan
Il s'agit de la partie de l'application qui gere le rmboursement des prets d'un compte donner, donc il prend comme information :
* Le numero du compte
* L'id (represente lequel des prets) qund il s'agit de spécifier le pret à rembouser

### Logout
Pour quitter l'application

NB: Pour un compte chaque pret est numeroter suivant son ordre d'emprunt


# Databases Information now

## Accounts
* 1

Owner : Admin 
Solde : 1100000.0 
Interest :0.0

Loan 1 
 Amount : 3.73837607E8
 Mensuality : 77.0
 
Loan 2 
 Amount : 3.73820684E8
 Mensuality : 8500.0

* 2

Owner : Angelo
Solde : 2.48E7
Interest :0.0

Loan 1 
 Amount : 1449824.0
 Mensuality : 12544.0

Loan 2 
 Amount : 1474912.0
 Mensuality : 783.0

* 3

Owner : Samuel
Solde : 150000.0
Interest :142500.0

Loan 1 
 Amount : 0.0
 Mensuality : 7505.0
