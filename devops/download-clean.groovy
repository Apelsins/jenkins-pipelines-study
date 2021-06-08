pipeline {
    agent any

    tools {
        jdk 'jdk1'
        maven 'mav1'
      }

    stages {
        stage('git') {
            steps {
                git 'https://github.com/Apelsins/jenkins-kube'
            }
        }
    }
}