node {

      stage('Clone Repository') {
        git 'https://github.com/saravanan2910/spring-boot-build-demo'
    
   }
   stage('Build Maven Image') {
        app = docker.build("saravanan2910/spring-boot-build-demo")
   }
 
}