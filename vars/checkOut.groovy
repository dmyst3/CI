def call(){

    
    if (env.AppName != null) {
        sh "echo ${env.AppName}"
        sh "echo " + checkout(env.AppName)
        sh "echo " + getTag()
    } else{
        currentBuild.result = 'ABORTED'
    }

    
}

def checkout(String AppName){
    return "echo Hello from Checkout step on " + AppName

}

def getTag(){
    return "echo Hello from getTag"
}