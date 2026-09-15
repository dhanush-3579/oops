# OOP Mini Project — Bird Hierarchy Simulation

## Overview
This project demonstrates core Object-Oriented Programming (OOP) concepts in Java through a simple animal/bird class hierarchy. It models an `Animal` base class extended by `Bird`, further extended by `Parrot`, which also implements a `Flyable` interface. A custom exception (`InvalidSpeciesException`) is used for input validation.

## OOP Concepts Demonstrated
- **Inheritance** — `Bird` extends `Animal`; `Parrot` extends `Bird`
- **Interfaces** — `Flyable` interface implemented by `Parrot`
- **Polymorphism** — `fly()` overridden in `Parrot`
- **Encapsulation** — protected fields accessed via constructors and methods
- **Custom Exception Handling** — `InvalidSpeciesException` thrown for invalid species input, caught in `Main`

## Class Structure
| Class/Interface | Description |
|---|---|
| `Animal` | Base class with `name`, `sound`, and `makeSound()` |
| `Bird` | Extends `Animal`; adds `species` and `layEggs()` |
| `Flyable` | Interface declaring `fly()` |
| `Parrot` | Extends `Bird`, implements `Flyable`; adds `mimic()` and overrides `fly()` |
| `InvalidSpeciesException` | Custom checked exception for invalid species input |
| `Main` | Entry point demonstrating all classes and exception handling |

## How to Run
1. Clone the repository:
