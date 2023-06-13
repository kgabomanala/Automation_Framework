pipeline{
agent any
 tools {
  maven 'Maven'
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
 publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '', reportFiles: 'test-output/SparkReport/Spark.html', reportName: 'HTML Report', reportTitles: 'kgabo', useWrapperFileDirectly: false])
}
}
stage('Deploy')
{
steps{
echo "Deploying the Project.........."
 emailext attachmentsPattern: 'test-output/SparkReport/Spark.html', body: 'hi please find the report', subject: 'html', to: 'tshepomana197@gmail.com'
}
}
}
}