//Declarative Pipeline
@Library ('Rossies-Sharedlibs') _
pipeline {
agent any
  tools {
  maven"maven3.8.6"
  }
  stages{
    stage('gitpull'){
      steps{
      sh "echo start of project"
        git 'https://github.com/Rossiebee/tesla-project'
      }
    }
  stage("Build"){
  steps{
    shared("Build")
  }
  }
    stage("Execute SonarQube Report"){
      steps{
        shared("SonarQube Report")
      }
    }
     stage("Upload Artifacts Into Nexus"){
      steps{
        shared("Upload Into Nexus")
      }
     }
    //==================
  } // stages closes
} //Pipeline closes
    


    
    
    
         
     

  

