#!groovyy
pipeline {
    def code= load "test.groovy"
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
        stage('Execute') {
            steps{
            code.example1()
            }
        }
    }
}

