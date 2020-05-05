#!groovyy
def code= load "test.groovy"
pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
        stage('Execute') {
            steps{
                script{
                    code.example1()
                }
            }
        }
    }
}

