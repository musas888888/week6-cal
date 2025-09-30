pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/musas888888/week6-cal.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install' // sh for linux and ios
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
    post {
      always {
        // Listaa varmuudeksi build-kansiot (valinnainen)
        bat 'dir target\\'
        bat 'dir target\\site\\jacoco\\'

        // Publish JUnit test results
        junit '**/target/surefire-reports/*.xml'

        // Publish JaCoCo HTML report (HTML Publisher -plugin tarvitaan)
        publishHTML(target: [
          reportDir:        'target/site/jacoco',
          reportFiles:      'index.html',
          reportName:       'JaCoCo Coverage Report',
          alwaysLinkToLastBuild: true,
          keepAll:          true,
          allowMissing:     true
        ])

        echo 'Pipeline completed with tests and coverage.'
      }
    }

}