node('master')
{
	stage ('checkout') {

	checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/PhanindraNagabhyru/jenkins-build-test-repo.git']]]
	}

	stage('maven')
	{

	 def test = sh 'mvn -Dtest=WorkingApplicationTests test'
	 /*def fail = sh 'mvn -Dtest=FailingApplicationTests test'*/
		//println("the test  result is ${test}")

	 //if(test)
	 //{
	 //println (" in if loop")
	 def folder = sh 'date +%F-%T'
	 zip $folder.zip $WORKSPACE
	 println ('success')
	  
	 //}
	 /*elseif (fail)
	 {
	  println ('the error is : ${fail}')
      println ('test failed')
      
	 }*/

	}
}
