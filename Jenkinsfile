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

        stage('') {
          steps {
            echo 'Pblish SonarQube'
          }
        }

      }
    }

  }
}