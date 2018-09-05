node{
  stage('Hello'){
    echo env.WORKSPACE
    sh "echo $BUILD_NUMBER"
  }
}
