docker rm postgres
docker run -d --name postgres -e POSTGRES_PASSWORD=artikel -e POSTGRES_USER=artikel -p 5432:5432 postgres