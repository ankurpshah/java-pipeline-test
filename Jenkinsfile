pipeline{
    agent{
        docker {
            image 'maven:3-alpine'
            args '-v /Users/ankurshah/.m2:/root/.m2'
        }
    }
    stages{
        stage('Test') {
            steps {
                sh 'mvn clean verify allure:report -P localgrid -DsuiteXmlFile=smoke.suite.xml'
            }
            post {
                success{
                    echo "========A execution successful========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
        }
        stage('Allure Reports') {
            steps {
                echo "===========Generating Allure Reports=============="
            }
            post {
                always {
                    allure results: [[path: 'target/allure-results']]
                    deleteDir()
                }
            }
        }
    }
}