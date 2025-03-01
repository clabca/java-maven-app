pipeline {
    agent any

    stages {
        stage('Clonar Repositorio 123') {
            steps {
                git 'https://github.com/clabca/java-maven-app.git'
            }
        }
        stage('Construir') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Pruebas') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Analisis SonarQube') {
            environment {
              SCANNER_HOME = tool 'ConexionSonarQube'
            }
            steps {
              withSonarQubeEnv(credentialsId: 'sonarq22', installationName: 'SonarQube') {
              sh '''$SCANNER_HOME/bin/sonar-scanner \
                -Dsonar.projectKey=projectKey \
                -Dsonar.projectName=projectName \
                -Dsonar.sources=src/ \
                -Dsonar.java.binaries=target/classes/ \
                -Dsonar.exclusions=src/test/java/****/*.java \
                -Dsonar.projectVersion=${BUILD_NUMBER}-${GIT_COMMIT_SHORT}'''
               }
            }
        }
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Desplegar') {
            when {
                expression {
                    return !["UNSTABLE", "FAILURE"].contains(currentBuild.getPreviousBuild()?.result?.toString())
                }
            }
            steps {
                // Agrega aquí los pasos para desplegar tu aplicación
                sh 'echo "Desplegando la aplicación..."'
            }
        }        
        stage('Enviar Nexus y notificar Slack') {
            steps {
                nexusArtifactUploader artifacts:
                  [[artifactId: 'myapp', 
                    classifier: '', 
                    file: 'target/my-app-1.0-SNAPSHOT.jar', 
                    type: 'jar']], 
                    
                    credentialsId: 'UserNexus', 
                    groupId: 'M3L6clc', 
                    nexusUrl: 'nexus.sisge.cl/repository/M3L6Ejercicio/', 
                    nexusVersion: 'nexus2', 
                    protocol: 'http', 
                    repository: 'M3L6Ejercicio', 
                    version: '1.0.${BUILD_NUMBER}'
            }
            post {
                always {
                    slackSend channel: '#notificajenkins', 
                              color: 'purple', 
                              message: 'Mensaje MOD3 LEC7 Slack'
                }
            }
    
       }
      
    }
}
