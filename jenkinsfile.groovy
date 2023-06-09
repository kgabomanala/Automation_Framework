pipeline{
agent any
 tools {
  maven 'Maven Apache'
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