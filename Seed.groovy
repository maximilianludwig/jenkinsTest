#!groovyy
pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
                sh "pwd"
            }
        }
        stage('Execute') {
            steps{
                definition {   
                    cps {
                        script{
                           readFileFromWorkspace('jenkins/test.groovy')
                        }
                    }
                 }
            }
        }
    }
}

