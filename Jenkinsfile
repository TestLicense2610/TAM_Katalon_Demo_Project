pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args '-v /var/run/docker.sock:/var/run/docker.sock' // Add the volume mount here
        }
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/TestLicense2610/TAM_Katalon_Demo_Project.git' 
            }
        }

        stage('WebUI Testing') {
            steps {
                sh '''
                    katalonc.sh -projectPath=/tmp/project -browserType=Chrome -retry=0 -statusDelay=15 -testSuitePath="Test Suites/WebUI/WebUI_TS" -apiKey=1aa04c25-f8c5-4bbc-9946-ff23c242b0b1 -executionProfile=JustInMind-Production --config -webui.autoUpdateDrivers=true
                '''
            }
        }

        stage('Archive Test Results') {
            steps {
                archiveArtifacts artifacts: '**/report.html', fingerprint: true
            }
        }
    }
}