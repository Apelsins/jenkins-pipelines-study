pipeline {
    agent any

    tools {
        jdk 'jdk1'
        maven 'mav1'
      }

    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}