def call(){

    sh "echo " + checkout()
    sh "echo " + getTag()
    sh "echo ${env.Test}"
    
}

def checkout(){
    return "echo Hello from Checkout"

}

def getTag(){
    return "echo Hello from getTag"
}