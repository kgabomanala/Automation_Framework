pipeline{
agent any
 tools {
  maven 'Maven'
  jdk  'JAVA'
 }

 stages
{
stage('Build')
{
steps{
echo "Building the Code.........."
 sh script :'mvn compile'
}
}
stage('run Test')
{
steps{
echo "Testing the Code.........."
 sh script:'mvn test -Dbrowser=localchrome'
}
}
stage('Compile')
{
steps{
echo "Compiling the Project.........."
 publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '', reportFiles: 'test-output/SparkReport/Spark*.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
}
}
stage('Deploy')
{
steps{
echo "Deploying the Project.........."
}
}
}
}