// These should all be performed in the script block
currentTime = sh(returnStdout: true, script: 'date +%Y-%m-%d').trim()
