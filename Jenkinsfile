pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('log') {
      steps {
        echo 'Publish Sonar'
      }
    }

    stage('Sonar') {
      steps {
        sh 'mvn sonar:sonar -Dsonar.host.url=http://172.18.0.3:9000 -Dsonar.login=179802efa4277854bdf4ab1e870dda1e93a8b547'
      }
    }

  }
}