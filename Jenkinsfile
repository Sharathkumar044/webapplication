pipeline {
    agent any

    environment {
        // Define environment variables
        MAVEN_HOME = tool 'Maven'
        PATH = "$MAVEN_HOME/bin:${env.PATH}"
        JAVA_HOME = tool 'Java17'
    }

    stages {
        stage('Build') {
            steps {
                checkout scm
                sh 'mvn clean package'
            }
        }
    }

    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
