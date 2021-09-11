

//Define function
def call(){

    if (env.AppName != null) {
        sh "echo ${env.AppName}"
        sh "echo " + checkout(env.AppName)
        sh "echo " + getTag()
        sh "echo " + pipelineID
    } else{
        currentBuild.result = 'ABORTED'
    }

}





//Define logging

//Define consumer info

//Define Notification



def checkout(String AppName){
    return "echo Hello from Checkout step on " + AppName
}

def getTag(){
    return "echo Hello from getTag"
}