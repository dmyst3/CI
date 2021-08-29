def call(){

    sh "echo " + checkout()
    sh "echo " + getTag()
    
    
    if (env.Test.length() > 1 ) {
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