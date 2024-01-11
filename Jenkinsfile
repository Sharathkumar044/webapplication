pipeline {
    agent any

    environment {
        // Define environment variables
        MAVEN_HOME = tool 'Maven'
        PATH = "$MAVEN_HOME/bin:${env.PATH}"
        JAVA_HOME = tool 'Java17'
    }
    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }
    }
}        