node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/grepport.git'), string(name: 'PORT_DESCRIPTION', value: 'Grep searches one or more input files for lines containing a match to a specified pattern. By default, Grep outputs the matching lines.' )]
  }
}
