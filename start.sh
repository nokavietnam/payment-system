#!/bin/bash

# Start the Registry service
docker-compose -f docker-compose-registry.yml up -d

# Start the PostgreSQL service
docker-compose -f docker-compose-postgres.yml up -d

# Start the payment service
docker-compose -f docker-compose-service.yml up -d

# Start the monitoring services
docker-compose -f docker-compose-monitoring.yml up -d