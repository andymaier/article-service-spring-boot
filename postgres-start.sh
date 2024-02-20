docker stop postgres-article-service
docker rm postgres-article-service
docker run -d --name postgres-article-service -e POSTGRES_PASSWORD=artikel -e POSTGRES_USER=artikel -p 5433:5432 postgres