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
                script {
                    // Change ownership of the target directory
                    sh 'sudo chown -R jenkins:jenkins target'
                    // Remove the target directory
                    sh 'rm -rf target'
                }
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
        JAVA_HOME = '/usr/bin/java'
    }
}
