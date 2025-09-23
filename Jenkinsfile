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
                    katalonc.sh -projectPath=/tmp/project -browserType=Chrome -retry=0 -statusDelay=15 -testSuitePath="Test Suites/WebUI/WebUI_TS" -apiKey=485fb30e-b19d-414f-97db-0a20876475d3 -serverUrl=https://admin-support.katalon.info -testOps.serverUrl=https://testops-support.katalon.info -executionProfile=JustInMind-Production -orgID=1 -testOpsReleaseId=6 -testOpsProjectId=6 --config -webui.autoUpdateDrivers=true
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