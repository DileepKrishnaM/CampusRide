# CampusRide 🚗

CampusRide is a smart vehicle pooling system designed to help students and employees share rides within a campus or workplace. The platform reduces travel costs, fuel consumption, and traffic congestion while promoting eco-friendly commuting.

---

## Features Implemented So Far

### Authentication
- User Registration
- User Login
- Password encryption using BCrypt
- Data stored in MySQL

### Vehicle Registration
- Users can register vehicles
- Upload documents:
  - College ID
  - Driving License
  - RC
- Images stored locally (development mode)
- Vehicle status set to **PENDING** for admin verification (to be implemented)

### Frontend
- Welcome page
- Login page
- Register page
- Vehicle registration page

---

## Tech Stack

### Frontend
- HTML
- CSS
- JavaScript

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Spring Security (Password encryption)

### Database
- MySQL

---

## How the System Works

### Registration Flow
1. User fills registration form
2. Frontend sends data to backend API
3. Backend encrypts password
4. Data saved in MySQL

---

### Vehicle Registration Flow
1. User fills vehicle form
2. Files uploaded using multipart form
3. Backend stores files in uploads folder
4. File paths stored in database
5. Vehicle marked as **PENDING**

---

## Running the Project Locally

### Backend
1. Open backend in Eclipse or IntelliJ
2. Configure MySQL in:
application.properties
3. Run:
BackendApplication.java
Backend runs at:
http://localhost:8081

---

### Frontend
Open HTML files directly in browser:
index.html

---

## Future Enhancements
- Admin verification of vehicles
- Ride creation and search
- Dashboard page
- Deployment to cloud
- Cloud image storage

---

## Contributors
- Your Name  
- Team Member 2  
- Team Member 3  

---

## License
This project is developed for educational purposes.
