CES ParentTree Mock API
=

Very, very simple and dumb CES ParentTree Mock API.

Echos CES document request with additional prefLabelTree features of the form:

```
 { 
"name": { 	"type": "XS_STRING", 
"name": "prefLabelTree" }, 
"value": { 	"type": "XS_STRING", 
"lang": null, 
"value": "/mock/pref/label/tree/here" } 
} 
```


# Quick REST test

```
docker-compose up -d
```

## For swagger documentation
```
http://localhost:9108/swagger
```

## Curl Requests

### Request

``` 
curl -X POST --header 'Content-Type: application/vnd.ontotext.ces.document+json; charset=utf-8' --header 'Accept: application/vnd.ontotext.ces+json' -d '{ "id":"http://www.platts.com/chp/data/doc1", "feature-set":[

 ], "document-parts":{ "feature-set":[ { "name":{ "type":"XS_STRING", "name":"isDebugMode" }, "value":{ "type":"XS_BOOLEAN", "lang":null, "value":"false" } }, { "name":{ "type":"XS_STRING", "name":"encoding" }, "value":{ "type":"XS_STRING", "lang":null, "value":"UTF-8" } } ], "document-part":[ { "feature-set":[

 ], "id":"1", "part":"HEADLINE", "content":{ "text":" US beats Argentina to win men\u0027s volleyball World Cup ", "node":[ { "id":"12", "offset":12 }, { "id":"21", "offset":21 } ] } }, { "feature-set":[

 ], "id":"2", "part":"BODY", "content":{ "text":" TOKYO (AP) — The United States won its first men\u0027s volleyball World Cup in 30 years on Wednesday with a 25-20, 25-21, 17-25, 25-20 win over Argentina. Maxwell Holt scored 18 points as the U.S. team won the\n event for the first time since 1985 and secured a berth at the Olympics in Rio de Janeiro. \"It\u0027s a stressful challenge for any coach to qualify for the Olympics,\" U.S. coach John Speraw said. \"I thought our serve was good throughout the tournament and our\n blocking got better as we went along.\" Italy also wrapped up an Olympic spot by finishing second with a 26-24, 22-25, 25-22, 25-19 win over world champion Poland, which lost its first match and finished third. \n The United States, Italy and Poland all finished with 10 wins and one loss. The final ranking was determined by fewest sets lost. Matt Anderson of the U.S. finished the\n tournament with 172 points and was named MVP. Defending champion Russia beat host Japan 27-29, 25-17, 21-25, 25-17, 15-13 to finish fourth. 273\n 

Russia Japan 1 29 2 25 17 21 25 4 25 17 Some bold text. Some italics text. Some underlined text. \n Some strikethrough text. Item 1 Item 2 Item 3 Link to google. ", "node":[ { "id":"64", "offset":3 }, { "id":"69", "offset":8 }, { "id":"81", "offset":20 }, { "id":"94", "offset":33 }, { "id":"204", "offset":143 }, { "id":"213", "offset":152 }, { "id":"222", "offset":161 }, { "id":"234", "offset":173 }, { "id":"356", "offset":295 }, { "id":"382", "offset":321 }, { "id":"687", "offset":626 }, { "id":"698", "offset":637 }, { "id":"831", "offset":770 }, { "id":"836", "offset":775 }, { "id":"932", "offset":871 }, { "id":"953", "offset":892 }, { "id":"1029", "offset":968 }, { "id":"1042", "offset":981 }, { "id":"1044", "offset":983 }, { "id":"1049", "offset":988 }, { "id":"1054", "offset":993 }, { "id":"1060", "offset":999 }, { "id":"1433", "offset":1372 }, { "id":"1446", "offset":1385 }, { "id":"1814", "offset":1753 }, { "id":"1817", "offset":1756 }, { "id":"1826", "offset":1765 }, { "id":"1851", "offset":1790 } ] } } ] }, "annotation-sets":[ { "name":"Final", "ref":null, "annotation":[ { "feature-set":[ { "name":{ "type":"XS_STRING", "name":"overallScore" }, "value":{ "type":"XS_DOUBLE", "lang":null, "value":"0.55520644166736" } }, { "name":{ "type":"XS_STRING", "name":"confidence" }, "value":{ "type":"XS_DOUBLE", "lang":null, "value":"0.7550477262559766" } }, { "name":{ "type":"XS_STRING", "name":"inst" }, "value":{ "type":"XS_STRING", "lang":null, "value":"http://data.platts.com/Port/London" } }, { "name":{ "type":"XS_STRING", "name":"class" }, "value":{ "type":"XS_STRING", "lang":null, "value":"http://www.w3.org/2004/02/skos/core#Concept" } }, { "name":{ "type":"XS_STRING", "name":"relevanceScore" }, "value":{ "type":"XS_DOUBLE", "lang":null, "value":"0.35536515707874333" } } ], "id":"1420", "startnode":"687", "endnode":"698", "type":"Location", "status":"Suggested", "generated":true } ] } ] } ' 'http://localhost:9108/worker/extract?debug=false'
```

#### Response
```
{ "id": "http://www.platts.com/chp/data/doc1", "feature-set": [], "document-parts": { "feature-set": [ { "name": { "type": "XS_STRING", "name": "isDebugMode" }, "value": { "type": "XS_BOOLEAN", "lang": null, "value": "false" } }, { "name": { "type": "XS_STRING", "name": "encoding" }, "value": { "type": "XS_STRING", "lang": null, "value": "UTF-8" } } ], "document-part": [ { "feature-set": [], "id": "1", "part": "HEADLINE", "content": { "text": "<p>US beats Argentina to win men's volleyball World Cup</p>", "node": [ { "id": "12", "offset": 12 }, { "id": "21", "offset": 21 } ] } }, { "feature-set": [], "id": "2", "part": "BODY", "content": { "text": "<p>TOKYO (AP) — The United States won its first men's volleyball World Cup in 30 years on Wednesday with a 25-20, 25-21, 17-25, 25-20 win over Argentina.</p> <p>Maxwell Holt scored 18 points as the U.S. team won the\n event for the first time since 1985 and secured a berth at the Olympics in Rio de Janeiro.<chpembed class=\"hoverable\" title=\"Picture\" contents=\"DEMOMMGLLINK000000000942\" link=\"DEMOMMGLLINK000000000942\" source=\"DEMOMMGLPICT000000023097\"\n type=\"chpembed-image\" version=\"c\"></chpembed>&nbsp;</p> <p>\"It's a stressful challenge for any coach to qualify for the Olympics,\" U.S. coach John Speraw said. \"I thought our serve was good throughout the tournament and our\n blocking got better as we went along.\"</p> <p>Italy also wrapped up an Olympic spot by finishing second with a 26-24, 22-25, 25-22, 25-19 win over world champion Poland, which lost its first match and finished third.</p>\n <p>The United States, Italy and Poland all finished with 10 wins and one loss. The <a class=\"inlinenotes_production\" title=\"1. Production Administrator 2016-03-15 12:28, This is an example of an annotation.\" modifiedat=\"2016-03-15 12:28\"\n modifiedby=\"Administrator\" notehtmlcontent=\"This is an example of an annotation.\" noteindex=\"1\">final ranking</a> was determined by fewest sets lost.</p> <p>Matt Anderson of the U.S. <a class=\"inlinenotes_productionstrike\"\n title=\"2. Production strikethrough Administrator 2016-03-15 12:28, Another example of an annotation.\" modifiedat=\"2016-03-15 12:28\" modifiedby=\"Administrator\" notehtmlcontent=\"Another example of an annotation.\" noteindex=\"2\">finished the\n tournament</a> with 172 points and was named MVP.</p> <p>Defending champion Russia beat host Japan 27-29, 25-17, 21-25, 25-17, 15-13 to finish fourth.</p> <p>&nbsp;</p> <table border=\"1\" cellspacing=\"0\"\n cellpadding=\"0\"> <tbody> <tr> <td width=\"200px\"><br></td><td width=\"200px\">Russia</td><td width=\"200px\">Japan</td></tr> <tr> <td width=\"200px\">1</td><td\n width=\"200px\">27</td><td width=\"200px\">29</td> </tr> <tr> <td width=\"200px\">2</td><td width=\"200px\">25</td><td width=\"200px\">17</td> </tr> <tr> <td\n width=\"200px\">3</td><td width=\"200px\">21</td><td width=\"200px\">25</td> </tr> <tr> <td width=\"200px\">4</td><td width=\"200px\">25</td><td width=\"200px\">17</td> </tr>\n </tbody> </table> <p>&nbsp;</p> <p><strong>Some bold text.</strong></p> <p><em>Some italics text.</em></p> <p><u>Some underlined text.</u></p>\n <p><strike>Some strikethrough text.</strike></p> <p>&nbsp;</p> <ul> <li>Item 1</li><li>Item 2</li><li>Item 3</li> </ul> <p>Link to <a\n title=\"http://www.google.com\" href=\"http://www.google.com\" target=\"_blank\">google</a>.</p>", "node": [ { "id": "64", "offset": 3 }, { "id": "69", "offset": 8 }, { "id": "81", "offset": 20 }, { "id": "94", "offset": 33 }, { "id": "204", "offset": 143 }, { "id": "213", "offset": 152 }, { "id": "222", "offset": 161 }, { "id": "234", "offset": 173 }, { "id": "356", "offset": 295 }, { "id": "382", "offset": 321 }, { "id": "687", "offset": 626 }, { "id": "698", "offset": 637 }, { "id": "831", "offset": 770 }, { "id": "836", "offset": 775 }, { "id": "932", "offset": 871 }, { "id": "953", "offset": 892 }, { "id": "1029", "offset": 968 }, { "id": "1042", "offset": 981 }, { "id": "1044", "offset": 983 }, { "id": "1049", "offset": 988 }, { "id": "1054", "offset": 993 }, { "id": "1060", "offset": 999 }, { "id": "1433", "offset": 1372 }, { "id": "1446", "offset": 1385 }, { "id": "1814", "offset": 1753 }, { "id": "1817", "offset": 1756 }, { "id": "1826", "offset": 1765 }, { "id": "1851", "offset": 1790 } ] } } ] }, "annotation-sets": [ { "name": "Final", "ref": null, "annotation": [ { "feature-set": [ { "name": { "type": "XS_STRING", "name": "overallScore" }, "value": { "type": "XS_DOUBLE", "lang": null, "value": "0.55520644166736" } }, { "name": { "type": "XS_STRING", "name": "confidence" }, "value": { "type": "XS_DOUBLE", "lang": null, "value": "0.7550477262559766" } }, { "name": { "type": "XS_STRING", "name": "inst" }, "value": { "type": "XS_STRING", "lang": null, "value": "http://data.platts.com/Port/London" } }, { "name": { "type": "XS_STRING", "name": "class" }, "value": { "type": "XS_STRING", "lang": null, "value": "http://www.w3.org/2004/02/skos/core#Concept" } }, { "name": { "type": "XS_STRING", "name": "relevanceScore" }, "value": { "type": "XS_DOUBLE", "lang": null, "value": "0.35536515707874333" } }, { "name": { "type": "XS_STRING", "name": "prefLabelTree" }, "value": { "type": "XS_STRING", "lang": null, "value": "/mock/pref/label/tree/here" } } ], "id": "1420", "startnode": "687", "endnode": "698", "type": "Location", "status": "Suggested", "generated": true } ] } ] }
```

# Docker

## Build

```
docker build .
```
  
## Tag
### Get the image id

```
docker images
```

## Push to quay

### Login

```
docker login -e="." -u="ontotext+ontotext" -p="XXXX" quay.io
```

### tag
```
docker tag ${IMAGE} cesparenttreefiltermock 

docker tag ${IMAGE} quay.io/ontotext/cesparenttreefiltermock

```

### push to quay
```
docker push quay.io/ontotext/cesparenttreefiltermock

```

## Run Interactive
```
docker run --name cesparenttreefiltermock -it cesparenttreefiltermock /bin/bash
```   

## Run Daemon
```
docker run --name cesparenttreefiltermock -d cesparenttreefiltermock 
```

## Shell to docker container



### Get container ids
```
docker ps -a
```

```
docker exec -i -t ${CONTAINER_ID} /bin/bash
```



## Invoke

## Run via docker-compose

### Environment

Create a .env file with the correct environment settings

```
SOME_THING=XXX

```

### Interactive
```
docker-compose up
```

### Daemon
```
docker-compose up -d
