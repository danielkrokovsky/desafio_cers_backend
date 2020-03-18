pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh 'mvn clean install'
          }
        }

        stage('log') {
          steps {
            echo 'Publish SonarQube'
          }
        }

        stage('Sonar') {
          steps {
            sh 'mvn sonar:sonar -Dsonar.host.url=http://172.20.0.3:9000'
          }
        }

      }
    }

  }
}