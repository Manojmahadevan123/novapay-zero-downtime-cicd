
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
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t novapay-app:v1 .'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    docker rm -f novapay-deploy || true

                    docker run -d \
                        --name novapay-deploy \
                        -p 8084:8081 \
                        novapay-app:v1

                    sleep 10

                    curl --fail http://localhost:8084/health
                '''
            }
        }
    }
}

