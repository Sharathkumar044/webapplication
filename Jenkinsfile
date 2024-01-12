pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: 'feature-helloworld']], userRemoteConfigs: [[url: 'https://github.com/Sharathkumar044/webapplication.git']]])
            }
        }
        stage('Clean Target Directory') {
            steps {
                sh 'rm -rf target'
            }
        }
        stage('Set execute permissions') {
            steps {
                script {
                    sh 'chmod +x mvnw'
                }
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
    environment {
        JAVA_HOME = '/path/to/your/java/home'
    }
}
