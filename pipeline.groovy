node{
  stage('DisplayVars'){
    echo "WORKSPACE : " WORKSPACE
    sh "echo 'BUILD_NEMBER :' $BUILD_NUMBER"
  }
}
