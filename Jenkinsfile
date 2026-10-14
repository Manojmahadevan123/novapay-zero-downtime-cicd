
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'NovaPay source code is available from GitHub'
            }
        }

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Build and test stage completed'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'sudo docker build -t novapay-app:v1 .'
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'NovaPay source code is available from GitHub'
            }
        }

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Build and test stage completed'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'sudo docker build -t novapay-app:v1 .'
            }
        }
    }
}
