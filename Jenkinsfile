pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone the Git repository into the Jenkins workspace
                git branch: 'main', url: 'https://github.com/TestLicense2610/TAM_Katalon_Demo_Project.git'
            }
        }

        stage('Test') {
            steps {
                // The current workspace is now the cloned Git repository
                sh 'docker run --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType=Chrome -retry=0 -statusDelay=15 -testSuitePath="Test Suites/WebUI/WebUI_TS" -apiKey=485fb30e-b19d-414f-97db-0a20876475d3 -serverUrl=https://admin-support.katalon.info -testOps.serverUrl==https://testops-support.katalon.info -executionProfile=JustInMind-Production -orgID=1 -testOpsReleaseId=6 -testOpsProjectId=6 --config -webui.autoUpdateDrivers=true''
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'Reports/**/*.*', fingerprint: true
            junit 'Reports/**/JUnit_Report.xml'
        }
    }
}