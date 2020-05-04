#!groovyy
pipeline {
    agent { any }
    stages {
        stage('Load') {
             code = load 'test.groovy'
        }

         stage('Execute') {
            code.example1()
        }
    }
}