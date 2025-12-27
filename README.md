  SniperElite Simulation
A Java console game demonstrating advanced OOP concepts through a combat simulation between a sniper and various target types.

   Key Features
Dynamic Object Generation: Every game session creates a random assortment of 10 game objects with specific probability distributions for trees, barrels, and enemies.

Advanced Combat Logic: * Armoured Enemies: Implements a two-layer health system (Armour + Health). Damage first depletes armour before affecting core health.

Soldier Enemies: Standard hostile units with a straightforward health pool.

Destructible Barrels: Environment objects with material-based durability (Metal, Wood, Plastic) implemented via Enums.

Probability-Based Mechanics: The SniperRifle uses a random hit probability; shots below a certain power threshold are considered misses.

 Architecture & Design Patterns
The project is built on a clean class hierarchy:

Abstraction: GameObject serves as the abstract base for everything in the game world.

Interfaces: The Destroyable interface defines a contract for any object that can take damage (hit(), getHealth(), isDestroyed()).

Polymorphism: The Game engine iterates through an array of GameObject types but treats them as Destroyable targets during combat sequences using type-casting and instanceof.

Encapsulation: All entity stats (health, armour) are managed through private fields with controlled public setters and getters.

   Tech Stack
Language: Java

Paradigm: Object-Oriented Programming

Core Concepts: Inheritance, Interfaces, Abstract Classes, Enums, Polymorphism.

   Project Structure
Enemy.java / ArmouredEnemy.java / SoldierEnemy.java: Hostile unit logic.

Barrel.java / BarrelType.java: Material-based destructible environment.

SniperRifle.java: The central combat logic and RNG (Random Number Generation).

Game.java: The game loop, object factory, and session management.
