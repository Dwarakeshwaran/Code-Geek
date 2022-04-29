# comment-app-using-gradle
Flames Web Application

#Docker Commands to Run the Application
docker pull dwarki/flames-angularserver
docker pull dwarki/flames-dbserver
docker pull dwarki/flames-springserver

docker run -p 80:80  --name flames-angular-container  -d dwarki/flames-angularserver
docker run --name flames-dbserver  -d dwarki/flames-dbserver
docker run -p 8080:8080 --name flames-spring-container --link flames-dbserver:mysql -d dwarki/flames-springserver