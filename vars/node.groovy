pipeline {
  agent any;
  
  stages {
    stage ('Git') {
      steps {
          echo "Git"
      }
    }
      stage ('Build') {
      steps {
          echo "Build"
      }
    }
      stage ('Deploy') {
      steps {
          echo "Deploy"
      }
    }
  }
  
}