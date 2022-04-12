node{
    stage('SCM Checkout'){
        git branch: 'main', credentialsId: 'git-cred', url: 'https://github.com/farhadtx/myspringrestapp'
    }

    stage('MVN package'){
    	sh 'mvn clean package'
    }

    stage('Build Docker Image'){
        sh 'docker build . -t farhadtx/myspringrestapp:${BUILD_NUMBER}'
    }

    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPassword')]) {
            sh "docker login -u farhadtx -p ${dockerHubPassword}"
        }
    	sh 'docker push farhadtx/myspringrestapp:${BUILD_NUMBER}'
    	sh "sed -i 's/#BUILD_NUMBER/${BUILD_NUMBER}/g' deployment.yaml"
    }
    stage ('K8S Deploy') {
        kubernetesDeploy(
            configs: 'deployment.yaml',
            kubeconfigId: 'K8s',
            enableConfigSubstitution: true
        )
    }
}
