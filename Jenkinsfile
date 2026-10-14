
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

        stage('Build') {
    steps {
        sh '''
            export JAVA_HOME=/usr/lib/jvm/java-21-amazon-corretto.x86_64
            export PATH="$JAVA_HOME/bin:$PATH"

            java -version
            mvn -version
            mvn clean package
        '''
    }
}stage('Build') {
    steps {
        sh '''
            export JAVA_HOME=/usr/lib/jvm/java-21-amazon-corretto.x86_64
            export PATH="$JAVA_HOME/bin:$PATH"

            java -version
            mvn -version
            mvn clean package
        '''
    }
}
    }
}
