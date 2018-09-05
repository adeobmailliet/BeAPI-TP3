node{
  stage('Hello'){
    echo env.WORKSPACE
    sh "echo $GIT_BRANCH"
  }
}
