# 🎯 Bataille Navale - Projet Java

Un jeu de **bataille navale** en Java, avec une interface console (et possibilité de GUI), structuré selon le modèle **MVC** (Modèle - Vue - Contrôleur).

---

## 🧱 Légende des symboles utilisés sur le plateau

- `B` : Bateau  
- `X` : Bateau touché  
- `O` : Tir raté  
- `.` : Eau (case vide)

---

## 📁 Structure du projet

```
Bataille-Navale/
├── main.java
├── metier/
│   ├── Players.java
│   └── Actions.java
├── GUI/
│   ├── Plateaux.java
│   ├── Frame.java
│   └── Panel.java
└── controllers/
    └── GameController.java
```

---

## 🚀 main.java

Fichier principal qui **lance le jeu**.

---

## 📦 /metier — Partie Modèle (M du MVC)

### Players.java

- Gère les **joueurs**, leurs **bateaux**, leurs **plateaux**.
- Contient les structures de données liées aux états de jeu (plateaux, positions, etc.).

### Actions.java

- Gère la **logique métier** du jeu :
  - Placer un bateau
  - Tirer sur une case
  - Vérifier si un joueur a gagné
  - Déterminer si un tir est touché ou raté

---

## 🖥️ /GUI — Partie Vue (V du MVC)

### Plateaux.java

- Gère **l'affichage en console** des plateaux de jeu :
  - Vue du plateau du joueur
  - Vue de l'adversaire
  - Affichage des tirs, des bateaux, etc.

### Frame.java

- Crée la **fenêtre graphique principale** si le jeu est exécuté en mode graphique (via Swing ou autre).
- Sert de conteneur à l'interface utilisateur.

### Panel.java

- Crée le **panel** graphique intégré à la `Frame`.
- Peut représenter la grille du jeu, les boutons de tir, etc.

> 📝 Remarque : `Frame` et `Panel` peuvent être utilisés pour une **version Swing/Graphique**, alternative à la console.

---

## 🎮 /controllers — Partie Contrôleur (C du MVC)

### GameController.java

- **Relie** le modèle et la vue.
- Gère les **actions du joueur** (ex: cliquer, tirer, entrer une position).
- Met à jour le modèle (`Actions`) et déclenche l'affichage (`Plateaux` ou `Panel`).
- Gère la **logique du tour de jeu** et le déroulement général de la partie.

---

## ✅ Objectifs à court terme

- [ ] Gérer les placements des bateaux
- [ ] Gérer les tirs (touché / raté)
- [ ] Afficher correctement les plateaux
- [ ] Mettre en place une boucle de jeu
- [ ] Ajouter une IA (optionnel)

---

## ✨ Exemple d’affichage console

```
   A B C D E F G H I J
  +---------------------+
1 | B B B . . . . . . . |
2 | . . . . . . . . . . |
3 | . . . X . . . . . . |
4 | . . . O . . . . . . |
5 | . . . . . . . . . . |
```

---

## 📌 Remarques

- Le projet respecte l’architecture **MVC** pour une meilleure organisation.
- Il est prévu pour fonctionner d’abord en **mode console**, mais la structure permet facilement de passer à un affichage **graphique (Swing)**.

---

## 📜 Licence

Projet libre, à but pédagogique.
