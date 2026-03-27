# payment-system

```bash
docker compose -f docker-compose-registry.yml

docker compose -f docker-compose-postgres.yml up -d  

docker compose -f docker-compose-service.yml up -d --build

docker compose -f docker-compose-monitor.yml up -d 

```