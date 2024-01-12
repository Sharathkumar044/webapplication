pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: 'feature-helloworld']], userRemoteConfigs: [[url: 'https://github.com/Sharathkumar044/webapplication.git']]])
            }
        }
        stage('Build') {
            steps {
                script {
                    sh './mvnw clean install -DskipTests'
                }
            }
        }  
    }
}
