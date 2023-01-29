//Declarative Pipeline
@Library('Rossies-sharedlibs') _
pipeline{
agent any
  tools{
  maven"maven3.8.6"
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
stage('Build'){
  steps{
  shared("Build")
  }
}
}

    
    
    
         
     

  

