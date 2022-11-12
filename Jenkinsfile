pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/sohamgoswami0205/trigonometric-functions.git/'
                bat '.\mvnw clean compile'
            }
        }
    }
}
