node {
 
  stage('Checkout') {
   git url: 'https://github.com/saravanan2910/spring-boot-build-demo'
  }
  stage('Build') {
      bat 'mvn clean install'
  }
}
