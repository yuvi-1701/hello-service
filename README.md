# Second Service (Hello Service)

## Overview

The Second Service exposes a single GET endpoint to return a greeting message.

## Features

- **GET `/hello`**: Returns the string `"Hello"` wrapped in a Spring `ResponseEntity`.

## Setup

```bash
# 1. Clone the repository:
git clone <repository-url>
cd second-service

# 2. Build the project:
mvn clean install

# 3. Run the application:
mvn spring-boot:run

```

## Endpoints
curl --location 'http://hello-service-4-env.eba-i7vmsbgq.ap-southeast-2.elasticbeanstalk.com/api/v1/hello'


