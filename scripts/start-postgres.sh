#!/usr/bin/env bash
docker network create catalogueNetwork
docker rm -f postgres
docker run -d --name postgres --hostname postgres --network catalogueNetwork -e POSTGRES_PASSWORD=artikel -e POSTGRES_USER=artikel -p 5432:5432 postgres