def call(){

    sh "echo " + checkout()
    sh "echo " + getTag()
    
}

def checkout(){
    return "echo Hello from Checkout"
}

def getTag(){
    return "echo Hello from getTag"
}