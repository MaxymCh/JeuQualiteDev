# Référentiel des Bonnes Pratiques et des Paradigmes

## Introduction

Bienvenue dans le Référentiel des Bonnes Pratiques et des Paradigmes du projet Urban Marginal. Cette documentation vise à établir des normes de codage, des conventions et des principes de développement qui favoriseront la collaboration efficace, la maintenance du code et l'optimisation des performances.

## Table des Matières

1. [Normes de Codage Java](#normes-de-codage-java)
2. [Structuration du Code](#structuration-du-code)
3. [Documentation du Code](#documentation-du-code)
4. [Tests et Validation](#tests-et-validation)
5. [Paradigmes de Conception](#paradigmes-de-conception)


## Normes de Codage Java

### 1. Conventions de Nommage

- **Packages** : Utilisez des noms de packages en minuscules, suivis de domaines inversés, par exemple : `com.urbanmarginal.nomdupackage`.

- **Classes et Interfaces** : Utilisez une notation CamelCase commençant par une majuscule. Par exemple : `NomDeClasse`.

- **Méthodes et Variables** : Utilisez une notation CamelCase commençant par une minuscule. Par exemple : `nomDeMethode`, `nomDeVariable`.

- **Constantes** : Utilisez des lettres majuscules séparées par des underscores pour les constantes. Par exemple : `CONSTANTE_IMPORTANTE`.

### 2. Indentation et Espaces

- Utilisez une indentation de 4 espaces pour chaque niveau d'indentation.

- Évitez les espaces en fin de ligne et les lignes vides excessives.

### 3. Commentaires

- Ajoutez des commentaires significatifs pour expliquer le code complexe, les algorithmes et les intentions.

- Utilisez des commentaires JavaDoc pour documenter les classes, méthodes et variables publiques.

### 4. Imports

- Organisez les imports de manière à ce qu'ils soient clairs et cohérents.

- Évitez les imports inutilisés.

### 5. Gestion des Exceptions

- Utilisez la gestion appropriée des exceptions en cas d'erreurs et d'exceptions.

- Évitez de capturer toutes les exceptions (`catch (Exception e)`), sauf si nécessaire.

### 6. Conventions de Style

- Respectez les conventions de style générales de Java.

- Préférez la lisibilité du code à la concision.


## Structuration du Code

La structuration du code source dans le projet Urban Marginal suit une organisation claire en fonction des fonctionnalités et des modules. Cette structure facilite la navigation, la maintenance et la collaboration au sein de l'équipe de développement. Voici un aperçu de la structure du code :

```
/src
    ├── controleur
    │   ├── Controle.java
    │   └── Global.java
    ├── modele
    │   ├── Attaque.java
    │   ├── Boule.java
    │   ├── JeuClient.java
    │   ├── Jeu.java
    │   ├── JeuServeur.java
    │   ├── Joueur.java
    │   ├── Label.java
    │   ├── Mur.java
    │   └── Objet.java
    ├── outils
    │   └── connexion
    │       ├── ClientSocket.java
    │       ├── Connection.java
    │       └── ServeurSocket.java
    ├── urbanmarginal
    │   └── UrbanMarginal.java
    └── vue
        ├── Arene.java
        ├── ChoixJoueur.java
        └── EntreeJeu.java
```

#### 1. Packages

Le code source est organisé en packages logiques, chacun regroupant des classes et des fonctionnalités similaires. Voici une brève description des packages principaux :

- **controleur** : Contient les classes responsables du contrôle de l'application, notamment `Controle.java` et `Global.java`.

- **modele** : Regroupe les classes du modèle de données de l'application, telles que `Attaque.java`, `Boule.java`, etc.

- **outils.connexion** : Comprend les classes liées à la gestion des connexions réseau, telles que `ClientSocket.java`, `Connection.java`, et `ServeurSocket.java`.

- **urbanmarginal** : Contient la classe principale `UrbanMarginal.java`, qui est l'entrée du programme.

- **vue** : Comprend les classes responsables de l'interface utilisateur, telles que `Arene.java`, `ChoixJoueur.java`, etc.

#### 2. Conventions de Nommage

- Utilisez des noms de packages significatifs et en minuscules, basés sur la structure de votre projet.

- Choisissez des noms de fichiers descriptifs qui reflètent le contenu du fichier.


#### 3. Regroupement Logique

Regroupez les classes, interfaces et fichiers liés à une fonctionnalité ou à un module spécifique dans le même package. Cela favorise la modularité et la maintenance.


## Documentation du Code

### 1. Comment Documenter

Voici quelques directives sur la manière de documenter efficacement votre code :

- **Commentaires JavaDoc** : Utilisez les commentaires JavaDoc pour documenter les classes, méthodes et variables publiques. Incluez une description significative de l'objet ou de la fonction, ainsi que des détails sur les paramètres, la valeur de retour et les exceptions éventuelles.

Exemple de commentaires JavaDoc pour une méthode :

```java
/**
 * Cette méthode effectue une opération spécifique.
 *
 * @param param1 Description du premier paramètre.
 * @param param2 Description du deuxième paramètre.
 * @return Description de la valeur de retour.
 * @throws MonException En cas d'erreur.
 */
public Resultat maMethode(Parametre1 param1, Parametre2 param2) throws MonException {
    // Corps de la méthode
}
```

### 2. Documentation des Classes

Documentez chaque classe en fournissant une brève description de son rôle et de son objectif global. Indiquez également comment la classe s'intègre dans le système.

### 3. Documentation des Méthodes

Pour chaque méthode, documentez sa fonction, ses paramètres (avec des descriptions appropriées), sa valeur de retour et les exceptions éventuelles qu'elle peut générer.

### 4. Documentation des Variables

Documentez les variables publiques en expliquant leur utilité et leur contexte d'utilisation.

### 5. Exemples d'Utilisation

Si nécessaire, ajoutez des exemples d'utilisation pour illustrer comment utiliser une classe ou une méthode spécifique.

### 6. Maintenance de la Documentation

Assurez-vous de maintenir la documentation à jour à mesure que le code évolue. La documentation obsolète peut être plus préjudiciable que pas de documentation du tout.

### 7. Commentaires dans le Code

En plus des commentaires JavaDoc, utilisez des commentaires internes dans le code pour expliquer des sections complexes, des algorithmes ou des décisions de conception non évidentes.


## Tests et Validation

### 1. Tests Unitaires

Les tests unitaires sont des tests qui se concentrent sur des composants individuels du code, tels que des classes ou des fonctions. Leur objectif est de vérifier que chaque composant fonctionne correctement de manière isolée. Voici comment vous pouvez contribuer aux tests unitaires :

- **Ajouter de Nouveaux Tests** : Lorsque vous ajoutez une nouvelle fonctionnalité ou modifiez un composant existant, assurez-vous d'ajouter des tests unitaires appropriés pour vérifier son bon fonctionnement.

- **Améliorer la Couverture de Code** : Si vous identifiez des parties du code qui ne sont pas couvertes par des tests unitaires, n'hésitez pas à contribuer en créant de nouveaux tests pour ces zones.

- **Vérification des Tests** : Avant de soumettre une contribution, assurez-vous que tous les tests unitaires existants passent avec succès. Si vous apportez des modifications qui cassent des tests, corrigez-les ou mettez à jour les tests en conséquence.

### 2. Tests d'Intégration

Les tests d'intégration s'assurent que les différents composants de l'application fonctionnent correctement ensemble, simulant ainsi des scénarios réels d'utilisation. Voici comment vous pouvez contribuer aux tests d'intégration :

- **Scénarios de Test Réalistes** : Lorsque vous développez de nouvelles fonctionnalités, envisagez de créer des scénarios de test d'intégration qui reflètent des cas d'utilisation réels de l'application.

- **Données de Test** : Contribuez en fournissant des données de test représentatives pour les scénarios d'intégration que vous créez.

- **Validation des Scénarios** : Avant de soumettre votre contribution, assurez-vous que les scénarios de test d'intégration sont correctement définis et que les interactions entre les composants sont cohérentes.



## Paradigmes de Conception

### 1. Architecture MVC (Modèle/Vue/Contrôleur)

L'architecture MVC est au cœur de la conception du projet Urban Marginal. Elle divise l'application en trois composants principaux :

- **Modèle** : Représente les données et la logique métier de l'application. Les modifications apportées au modèle sont reflétées dans la vue.

- **Vue** : Gère l'interface utilisateur et l'affichage des données. Elle reflète l'état actuel du modèle.

- **Contrôleur** : Gère les interactions de l'utilisateur et les actions à effectuer en réponse. Il met à jour le modèle et la vue en conséquence.

L'utilisation efficace de l'architecture MVC facilite la séparation des préoccupations et rend le code plus évolutif.

### 2. Modèles de Conception

Outre l'architecture MVC, le projet Urban Marginal utilise d'autres modèles de conception pour résoudre des problèmes spécifiques. Parmi les modèles de conception couramment utilisés, on trouve :

- **Singleton** : Utilisé pour garantir qu'une classe n'a qu'une seule instance.

- **Observateur** : Permet aux objets d'observer les changements d'état d'un autre objet et d'y réagir.

- **Stratégie** : Permet de définir une famille d'algorithmes, de les encapsuler et de les rendre interchangeables.

- **Factory Method** : Utilisé pour créer des objets sans spécifier explicitement leur classe, ce qui favorise la flexibilité.


## Contribution

Nous encourageons tous les membres de l'équipe à contribuer à l'amélioration de ce Référentiel des Bonnes Pratiques et des Paradigmes. Si vous avez des suggestions, des mises à jour ou des questions, n'hésitez pas à participer à son développement.
