# JPA Projections

This is a simple Spring Boot application demonstrating the use of JPA projections to efficiently retrieve specific fields from a database. The application uses a native SQL query and a DTO-based projection to fetch a combination of data from two entities: `Person` and `Address`.

## Features
- **Spring Boot 3.3.2**: Built with the latest Spring Boot version for modern application development.
- **H2 Database**: Utilizes an in-memory database for simplicity during development and testing.
- **JPA Projections**: Implements interface-based DTO projections to optimize data retrieval.
- **REST API**: Exposes an API endpoint to query persons by their first name.
- **Lombok**: Reduces boilerplate code with annotations.

## Getting Started

### Prerequisites
Ensure you have the following installed:
- Java 17 or higher
- Maven 3.6 or higher

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/jpa-projections.git
   cd jpa-projections
2. Build the project:
    ```bash
   mvn clean install
3. Run the application:
    ```bash
   mvn spring-boot:run

## API Endpoint
### GET /api/persons
    Fetches a list of persons along with their address details filtered by their first name.

#### Request Parameters:

    firstname (string): The first name of the person to search for.
##### Response: 
    Returns a list of persons along with their address details.

#### Example Response
```json
    [
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "status": "Active",
        "city": "Springfield",
        "street": "742 Evergreen Terrace"
      }
    ]
