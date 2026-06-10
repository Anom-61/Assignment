# Assignment 01 Report

## 1. Abstract Class

The abstract class UniversityMember is used as the base class for all university personnel. It contains common attributes such as memberId and name, and defines the abstract method performDuty().

## 2. Multilevel Inheritance

The following multilevel inheritance hierarchy is implemented:

UniversityMember -> Employee -> AcademicStaff -> Professor

Each subclass adds its own attributes and methods.

## 3. Dynamic Binding

Dynamic binding occurs when UniversityMember references stored in an ArrayList call performDuty(). The correct overridden method is selected at runtime.

## 4. Downcasting

Downcasting is used to identify Professor objects and access Professor-specific methods such as showResearchProfile().

## 5. Future Extension

Additional employee types such as LabEngineer, Accountant, and SystemAdministrator can be added easily by extending Employee.