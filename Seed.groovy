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
            def code= load "test.groovy"
        }
        stage('Execute') {
            code.example1()
        }
    }
}

