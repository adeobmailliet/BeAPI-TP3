node{
  stage('DisplayVars'){
    echo "WORKSPACE : "
    echo env.WORKSPACE
    sh "echo 'BUILD_NEMBER :' $BUILD_NUMBER"
  }
}
