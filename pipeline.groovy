node{
  stage('DisplayVars'){
    echo env.WORKSPACE
    sh "echo $BUILD_NUMBER"
  }
}
