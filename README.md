A:access resource protected
a-1.login with below command and get JSESSIONID back from server
curl -i -X POST -d username=root -d password=password http://localhost:8080/user/login

a-2.next call any other service with the JSESSIONID
curl -b JSESSIONID=7F542A2FF0A5F9DD5C99663A6FECCEF6 http://localhost:8080/user

B:access resource not be protected
curl http://localhost:8080/
