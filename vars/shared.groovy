//Declarative Pipeline
@Library('Rossies-sharedlibs') _
pipeline{
agent any
  tools{
  maven "3.8.6"
  }
  stages{
    stage('gitpull') {
      steps {
      sh "echo start of project"
        git 'https://github.com/Rossiebee/tesla-project'
      }
    }
  }
}
    
    
    
         
     

  

