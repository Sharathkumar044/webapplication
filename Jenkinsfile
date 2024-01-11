pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: 'feature-branch']], userRemoteConfigs: [[url: 'https://github.com/Sharathkumar044/webapplication.git']]])
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }  
        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}
