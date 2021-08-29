def call(){
    sh "echo this is from the first stage!"
    sh "echo " + printParams()
}

def printParams() {
  env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
}