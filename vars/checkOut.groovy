def call(){

    sh "echo " + checkout()
    sh "echo " + getTag()
    
    
    if (env.Test != null) {
        sh "echo ${env.Test}"
    } else{
        currentBuild.result = 'ABORTED'
    }

    
}

def checkout(){
    return "echo Hello from Checkout"

}

def getTag(){
    return "echo Hello from getTag"
}