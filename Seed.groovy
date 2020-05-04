#!groovyy
pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
        stage("load"){
            steps{
            def code= load "test.groovy"
            }
        }
        stage('Execute') {
            steps{
            code.example1()
            }
        }
    }
}

