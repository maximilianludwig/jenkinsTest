#!groovy
pipeline{
  agent{ 
    any
        {
          stages{
            stage("test"){
             steps{
                echo "hello I am the second script"
             }
            }
          }
        }
  }
}
