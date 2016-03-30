# team21_week4
실전코딩 week4 (다시 만들었음)

1. Jenkins 빌드 시 구성 - Build

   1) Root POM : Team21_week4/pom.xml

   2) Goals and options : package


2. Jenkins 빌드 시 구성 - 'Analysis properties' of 'Invoke Standlone SonarQube Analysis'

   1) sonar.projectKey=[input]

        >> ex. sonar.projectKey=ttt


   2) sonar.projectName=[input]

        >> ex. sonar.projectName=ttt
        

   3) sonar.projectVersion=[input]

        >> ex. sonar.projectVersion=0.0.1
        
   4) sonar.sources=Team21_week4



* 이렇게 설정후 빌드해야합니다. pom.xml의 경로가 Team21_week4 안에 위치하기 때문에

:)
