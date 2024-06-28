pipeline {
  environment {
    BUILD_VALUE = "${BUILD_ID}+${BUILD_DISPLAY_NAME}+${BUILD_TAG}+${BUILD_URL}"
  }
  
  stages {
    stage('Build') {
      steps {
        sh 'echo "${BUILD_VALUE}"'
        // pipeline name: 17/test-snippet
        // 7+#7+jenkins-17-test-snippet-7+http://amamba-jenkins-jenkins:80/job/17/job/test-snippet/7/
      }
    }
  }
}
