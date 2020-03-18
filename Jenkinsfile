pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('log') {
      steps {
        echo 'Publish Sonar'
      }
    }

  }
}