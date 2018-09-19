# spring-cloud-config
Some Of the Key thing we need to understand for the Cloud Config
Annotation : @EnableConfigServer
The above annotation does all the Magic
The whole purpose for the cloud config is to manage the configuration of the microservice.
You will see I would be switching from bootstrap.yml and application.yml file.
Just wanted to say, that if you are naming the bootstrap.yml then the file will load first before the program.
If you are naming application.yml then the program will load before the application.yml file
You can also use bootstrap.properties or application.properties

If you are using AWS and Docker,
Run the Dockerfile as 
docker build -f Dockerfile -t (name of the Image).
docker run -p 8888:8888 (name of the Image) 




