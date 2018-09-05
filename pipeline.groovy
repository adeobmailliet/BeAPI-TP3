node{
  stage('DisplayVars'){
    echo "WORKSPACE : "env.WORKSPACE
    sh "echo 'BUILD_NEMBER :' $BUILD_NUMBER"
  }
}
