# Java Annotations Exercises

## 📄 Description - Statement of the Exercise

This repository contains a set of Java exercises designed to practice **Java Inheritance, Overriding, and Annotations**.  
All exercises can be executed from the command line or an IDE.  

- **Exercise 1 (Workers Hierarchy with @Override)**:  
  Create a class hierarchy with three classes: `Worker`, `OnsiteWorker`, and `RemoteWorker`.  
  - The base class `Worker` has attributes `firstName`, `lastName`, and `hourlyRate`, and a method `calculateSalary()` that multiplies the worked hours by the hourly rate.  
  - The child classes must override this method using `@Override`.  
  - `OnsiteWorker` adds a static attribute `fuelAllowance` and includes it in salary calculation.  
  - `RemoteWorker` adds a constant `internetFee` and includes it in salary calculation.  
  - From the `Main` class, demonstrate the correct use of `@Override` by invoking salary calculations for both worker types.  

- **Exercise 2 (Deprecated Methods with @Deprecated and @SuppressWarnings)**:  
  Add some old methods to the subclasses and mark them as `@Deprecated`.  
  - For example, `OnsiteWorker` has an `oldCalculateSalary()` method, and `RemoteWorker` has a `connectWithOldVPN()` method.  
  - From an external `Main` class, invoke these deprecated methods.  
  - Use the `@SuppressWarnings("deprecation")` annotation to suppress compiler warnings about using deprecated methods.  

---

## 💻 Technologies Used

- Java SE (tested with OpenJDK 24)  
- JDK (Java Development Kit)  
- IntelliJ IDEA or Eclipse (for development and execution)  

---

## 📋 Requirements

- Java JDK installed and configured (`JAVA_HOME` must point to your JDK installation).  
- Access to the system terminal/command line or an IDE for execution.  
- Basic knowledge of Java OOP: classes, inheritance, constructors, getters/setters, method overriding.  
- Understanding of annotations in Java (`@Override`, `@Deprecated`, `@SuppressWarnings`).  

---

## 🛠️ Installation

```bash
git clone https://github.com/yvangabrieli/S1.07.Annotations
```
