# 🏰 Dungeon Adventure Game

## 📖 Overview
This project is a simple **text-based adventure game** written in Java. The player explores a dungeon made up of connected rooms, each with unique descriptions and doors leading in the four cardinal directions: **north, east, south, and west**.

The focus of this version is on **room navigation and descriptions** — there are no battles, items, or inventory systems implemented yet.

---

## ✨ Features
- 🧭 Navigate between rooms using text commands (`north`, `south`, `east`, `west`).  
- 🏠 Each room has a unique description and a list of available exits.  
- 👤 Modular structure using classes for **Player**, **Room**, and **Door**.  
- 🔒 Proper encapsulation using private variables with getters and setters.  

---

## 🛠️ Implementation Details
- All rooms are created during the **game setup** (`setupGame()`), stored in a data structure such as an `ArrayList`.  
- The **Player** object is initialized at the start of the game.  
- The **playGame()** method runs the main loop where the player explores rooms and chooses directions.  
- The **Room** class contains the method `doNarrative()`, which prints the room’s description and available exits.  

---

## 🎮 How to Play
1. Run the program.  
2. Read the room description displayed on the screen.  
3. Type a direction (`north`, `east`, `south`, `west`) to move to another room.  
4. Continue exploring until you decide to quit.  

---

## 🧩 Example
```text
You are in a dark stone chamber.
There are doors to the north and east.
> north
You enter a torch-lit hallway...
