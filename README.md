# Java-Swing-Clicker-Game

A simple clicker game built with Java Swing.

I developed this project to learn more about Java and Swing, building it up one small step at a time and focusing on object-oriented design (keeping the game's data separate from the screen).

## Features

- **Click button** – earns points every time you click
- **Upgrade** – spend points to make each click worth 1 more (starts at 10 points, the price doubles after each purchase)
- **Auto-clicker** – spend points to earn 1 extra point every second automatically (starts at 50 points, the price doubles after each purchase)
- **Reset** – sets your points back to 0 (upgrades are kept)
- Dark theme with a large, centred score display

## How to play

1. Click to earn points.
2. Buy upgrades to earn more per click.
3. Buy auto-clickers so points keep coming in while you wait.
4. Upgrade and auto-clicker buttons show their current price.

## Requirements

- Java installed (a JDK/JRE matching the version set in `pom.xml`)
- Free downloads available from [adoptium.net](https://adoptium.net) (choose the latest LTS version)

## Running the game

Double-click the `.jar` file, or run it from a terminal:

```
java -jar ClickerGame-1.0-SNAPSHOT.jar
```

## Building from source

The project uses Maven and was built in NetBeans.

1. Open the project in NetBeans.
2. Click **Run → Clean and Build Project** (Shift + F11).
3. The runnable `.jar` is created in the `target` folder.

The main class is set in `pom.xml` (via `maven-jar-plugin`) so the `.jar` can be run with a double-click.

## Project structure

| Class | Job |
|---|---|
| `ClickerGame` | Starts the app on Swing's Event Dispatch Thread using `SwingUtilities.invokeLater` |
| `Counter` | The game's data and rules: points, points per click, upgrade and auto-clicker costs, and the "can you afford it?" checks |
| `CounterWindow` | The screen: builds the window, buttons and labels, reacts to clicks, and refreshes everything through one `updateDisplay()` method. A Swing `Timer` runs the auto-clicker every second |

## What I learned

- Swing basics: `JFrame`, `JPanel`, `JLabel`, `JButton`
- Separating data (model) from the screen (view)
- Layout managers (`BorderLayout`, panels inside panels)
- Events, listeners and lambdas (`e -> ...`)
- Fields vs local variables
- `if` statements (and why curly brackets matter!)
- Refactoring repeated code into methods
- Using a Swing `Timer` for automatic actions
- Building a runnable `.jar` with Maven

## Planned / work in progress

- [ ] **Save progress** – keep points and upgrades between sessions by saving to a file
- [ ] **Shop window** – move upgrades into a pop-up shop using `JDialog`
- [ ] **Full reset option** – choice to reset upgrades and prices as well as points
- [ ] **Points-per-click display** – a label showing current points per click and per second
- [ ] **More upgrades** – extra upgrade types with different costs and effects
