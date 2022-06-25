1) iniciar scaneo utilizando API

GET/POST
http://localhost:8888/JSON/ascan/action/scan/?url=HOST_IP_DEL_SERVIDOR
http://localhost:8888/JSON/ascan/action/scan/?url=http://todo.ly

respuesta:
{"scan":"1"}


2) recuperar el porcentaje del scaneo

GET/POST
http://localhost:8888/JSON/ascan/view/status/?scanId=ID_DINAMICO_SCAN_ID
http://localhost:8888/JSON/ascan/view/status/?scanId=5

{"status":"0"}

3) recuperar los tipos de ataques que estamos realizando
   GET/POST
   http://localhost:8888/HTML/ascan/view/scanProgress/?scanId=ID_DINAMICO_SCAN_ID
   http://localhost:8888/HTML/ascan/view/scanProgress/?scanId=4

http://localhost:8888/JSON/ascan/view/scanProgress/?scanId=ID_DINAMICO_SCAN_ID
http://localhost:8888/JSON/ascan/view/scanProgress/?scanId=4


4) recuperar las alertar que encontramos
   GET/POST

http://localhost:8888/HTML/alert/view/alerts/?baseurl=HOST_IP_DEL_SERVIDOR
http://localhost:8888/JSON/alert/view/alerts/?baseurl=HOST_IP_DEL_SERVIDOR
http://localhost:8888/HTML/alert/view/alerts/?baseurl=http://todo.ly
http://localhost:8888/JSON/alert/view/alerts/?baseurl=http://todo.ly

5) generar el report HTML

* http://localhost:8888/JSON/reports/action/generate/?title=report&template=traditional-html
  {"generate":"C:\\Users\\EYNAR\\2022-06-11-ZAP-Report-.html"}


* http://localhost:8888/OTHER/core/other/htmlreport/?