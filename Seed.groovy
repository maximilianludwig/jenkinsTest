#!groovyy
def code= load "test.groovy"
pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
                pwd
            }
        }
        stage('Execute') {
            steps{
                definition {   
                    cps {
                     script(
                           readFileFromWorkspace('jenkins/test.groovy')
                     )
                    }
                 }
            }
        }
    }
}

