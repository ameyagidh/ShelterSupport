# NGO Shelter Support

## Problem Statement:
Every single  night, there are more than 500,000 Americans find themselves without a home, which constitutes 0.2% of the US population. While the connection between housing and homelessness is commonly understood, the strong correlation between health and homelessness is often underestimated. Living on the streets or in crowded homeless shelters exposes individuals to extreme stress and subjects them to communicable diseases (e.g., TB, respiratory illnesses, flu, hepatitis, etc.), violence, malnutrition, and harsh weather conditions. We require a system that can facilitate proper healthcare facilities for homeless individuals.

## Demo
![8ic3v4](https://github.com/ameyagidh/ShelterSupport/assets/65457905/da7307f4-bda0-4e20-be98-6f2b64a6048a)

## Solution:
Homeless Helpers is a digital platform designed to improve healthcare access for homeless people by bridging the gap between them and hospitals. Homeless individuals can receive medical treatment at nearby hospitals while paying only what they can afford. This application aims to reduce the health challenges faced by homeless individuals and mitigate associated health risks.

## Approach:
To address this issue, the following approach is proposed:

1. Homeless individuals register on the platform and provide any available medical history.
2. The system allocates a suitable hospital to the individual based on their location.
3. The system assigns the individual to a specific department (e.g., ENT, Cardiology) for a more accurate diagnosis.
4. Symptoms are assessed based on the chosen department, and a COVID-19 test is conducted.
5. If the COVID-19 test is positive, the person is not admitted to the hospital.
6. If the COVID-19 test is negative, a comprehensive medical evaluation is performed to identify the individual's health issues.
7. Upon a successful diagnosis and hospital allocation, a health report for the individual is generated.

## System Participants:
The system involves the following participants:
- NGOs
- Hospitals
- Medicine Providers
- Doctors
- Homeless Persons
- Volunteers
- Assistant Doctors

Each participant is granted role-based access for the management of their specific tasks and workflows within the digital ecosystem.

## Features:
Key features of the system include:
- Volunteer registration for homeless individuals.
- Hospital allocation based on the individual's location preferences.
- Department selection to investigate specific health issues.
- Doctor assignment facilitated by an assistant.
- Email alerts for registered individuals.
- Request initiation for symptom assessment.
- COVID-19 testing if symptoms suggest it.
- Comprehensive medical diagnosis to rule out other health issues.
- Generation of PDF health reports for future reference.

## Tech Stack 💻:
The system is built using the following technologies:
- Java
- Java Swing for the user interface.
- Maven library for simplified dependency management.
- SendGrid API for email communication.
- iTextPDF library for generating PDF documents.

![object-model](https://github.com/ameyagidh/ShelterSupport/assets/65457905/4cbe89b6-06a1-41a8-be37-674f9b2f1b75)
![class-diagram](https://github.com/ameyagidh/ShelterSupport/assets/65457905/b34e1698-c71a-41f9-8d33-f1b35a7890f4)
![workflow-diagram](https://github.com/ameyagidh/ShelterSupport/assets/65457905/40ca4f58-4e2b-4180-ada1-5344d340dc87)
