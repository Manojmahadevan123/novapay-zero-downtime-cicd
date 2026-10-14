
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'NovaPay source code is available from GitHub'
            }
        }

        stage('Build') {
            environment {
                JAVA_HOME = '/usr/lib/jvm/java-21-amazon-corretto.x86_64'
                PATH = "/usr/lib/jvm/java-21-amazon-corretto.x86_64/bin:${env.PATH}"
            }
            steps {
                sh '''
                    echo "JAVA_HOME=$JAVA_HOME"
                    which java
                    which javac
                    java -version
                    javac -version
                    mvn -version
                    mvn clean package
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Build and test stage completed'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t novapay-app:v1 .'
            }
        }
    }
}

