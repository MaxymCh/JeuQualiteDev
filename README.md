
# Urban Marginal

## Table des Matières
1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Utilisation](#utilisation)
4. [Fonctionnalités](#fonctionnalités)
5. [Dépendances](#dépendances)
6. [Configuration](#configuration)
7. [Documentation](#documentation)
8. [Dépannage](#dépannage)
9. [Contributeurs](#contributeurs)
10. [Liste des Technologies](#liste-des-technologies)
11. [Lancer les tests](#lancer-les-tests)
12. [Licence](#licence)

## Introduction
Urban Marginal est un jeu client/serveur multijoueur en 2D construit sur le modèle MVC (Modèle/Vue/Contrôleur). Le but est de battre l’adversaire en tirant des boules d’énergies. Un chat est disponible pour discuter. Il existe trois personnages différents.
Pour lancer le jeu, démarrez une nouvelle session Urban Marginal et cliquez sur Start (session serveur).
Lancez une seconde session et cliquez sur Connect (session client).

## Installation

### Installation pour Développement

#### Prérequis
- Java JDK: Assurez-vous d'avoir le Java Development Kit (JDK) installé. Vous pouvez le télécharger depuis [Oracle Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- Git (optionnel): Pour cloner le dépôt si le projet est hébergé sur un système de contrôle de version comme GitHub.

#### Clonage et Compilation du Projet
1. **Cloner le Projet** :
   ``` sh
   git clone https://github.com/MaxymCh/JeuQualiteDev
   cd JeuQualiteDev
   ```

2. **Compiler le Projet**:
   Naviguez dans le dossier du projet et compilez les sources Java. Par exemple :
   ``` sh
   javac -d bin -sourcepath UrbanMarginal/src UrbanMarginal/src/**/*.java
   ```

   Cela compilera tous les fichiers `.java` dans le projet.

### Lancement du Serveur et du Jeu

#### Lancement du Jeu

1. Naviguez dans le dossier `UrbanMarginal/src`.
2. Lancez le jeu :

   ```sh
    java -cp bin/ urbanmarginal.UrbanMarginal 
    ```
3. Choisir le Mode Serveur ou Client :

    Mode Serveur : Si vous choisissez de démarrer le serveur, l'application initialisera et démarrera le serveur en attente de connexions clients.

    Mode Client : Si vous optez pour rejoindre en tant que client, vous aurez besoin de saisir l'adresse IP du serveur auquel vous souhaitez vous connecter.

## Utilisation
Le jeu Urban Marginal est simple à utiliser. Après avoir lancé l'application, choisissez entre le mode serveur et client. En mode serveur, le jeu attend les connexions des clients. En mode client, connectez-vous à l'adresse IP du serveur pour rejoindre la partie. Les joueurs peuvent se déplacer dans l'arène, tirer des boules d'énergie et utiliser le chat en jeu pour communiquer.

## Fonctionnalités
- **Architecture MVC**: Séparation des responsabilités entre Modèle, Vue, et Contrôleur.
- **Interface Utilisateur**: Création d'interfaces avec WindowBuilder.
- **Connectivité Réseau**: Options pour démarrer un serveur ou se connecter à un serveur existant.
- **Chat en Jeu**: Communication entre joueurs.
- **Gestion des Interactions**: Contrôles pour la gestion des interactions joueur-jeu.
- **Gestion d'Arène**: Affichage et gestion de l'arène de jeu et des murs.

## Dépendances
- Java
- Eclipse Néon avec plugin WindowBuilder

## Configuration
Les joueurs peuvent personnaliser l'expérience de jeu en modifiant les textures et en ajustant certaines constantes. Les textures peuvent être modifiées dans le dossier `média`. Les constantes globales, telles que les ports, les chemins d'accès aux fichiers média, et les dimensions des éléments du jeu, sont définies dans le fichier `Global.java`.

## Documentation

La documentation du projet Urban Marginal est disponible dans le dossier doc. Elle inclut des informations détaillées sur l'architecture du jeu, la mise en œuvre des fonctionnalités clés et des instructions pour la configuration et le dépannage. Les documents importants à consulter pourraient inclure :

-  Description de l'architecture MVC et son application dans Urban -  Marginal.
-  Guide d'utilisation de WindowBuilder pour l'interface utilisateur.
-  Documentation sur la gestion du réseau et des connexions -   serveur-client.
-  Instructions pour l'ajout de nouvelles fonctionnalités ou la modification des paramètres existants.

## Dépannage
- **Problèmes de Chargement d'Image**: Vérifiez les chemins d'accès et les variables globales.
- **Connexion Réseau**: Assurez-vous que les ports et adresses IP sont correctement configurés.

## Contributeurs
- FAUCHER Thomas
- CHARPENTIER Maxym

## Liste des Technologies

Dans ce projet, nous employons plusieurs technologies clés pour assurer le développement efficace et robuste de notre application. Voici les détails des technologies principales utilisées :

### Java
- **Description** : Langage de programmation principal pour le développement de ce projet, offrant portabilité, sécurité et robustesse.
- **Utilisation** : Utilisé pour écrire toute la logique métier, les services de backend, et l'interface utilisateur.

### Modèle-Vue-Contrôleur (MVC)
- **Description** : Modèle d'architecture logicielle pour séparer la logique métier de l'interface utilisateur.
- **Utilisation** : Le modèle définit la structure des données, la vue gère l'affichage, et le contrôleur fait le lien entre les deux.

### Swing
- **Description** : Bibliothèque graphique pour Java, utilisée pour construire des interfaces graphiques interactives.
- **Utilisation** : Employé pour créer tous les composants graphiques de l'application, y compris les fenêtres, les boutons et les champs de texte.

### JUnit
- **Description** : Framework de test unitaire pour Java.
- **Utilisation** : Utilisé pour rédiger et exécuter des tests unitaires, assurant le bon fonctionnement des composants individuels.

### Sockets
- **Description** : Permettent la communication réseau entre machines en Java.
- **Utilisation** : Gèrent la connexion réseau entre le serveur et les clients de l'application.

### GitHub
- **Description** : Plateforme de gestion de développement collaboratif et de contrôle de version basée sur Git.
- **Utilisation** : Employé pour le versionnement du code, la collaboration, le suivi des problèmes et l'intégration continue.

Cette combinaison de technologies garantit que notre application est fonctionnelle, fiable et maintenable. Nous choisissons des outils et pratiques adaptés aux exigences spécifiques de notre projet.


# Lancement des tests

## Installation Maven

  Installer Maven avec les liens ci-dessous :
      https://maven.apache.org/download.cgi
      https://maven.apache.org/install.html

## Lancer les tests

  Se placer au niveau du pom.xml dans JeuQualiteDev/UrbanMarginal et faire
   ``` sh
   mvn clean install
   ```




## Licence

Ce projet est sous licence GNU General Public License (GPL) version 3. Pour plus d'informations, veuillez consulter le fichier [LICENSE](LICENSE) ou visiter [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.html).

