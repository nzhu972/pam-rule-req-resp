Description
=======================

This project shows how to pass in JSON request to kieserver and receive back a customize JSON response back. The implementation


Target Technology
-----------------------

1. RH Process Automation Manager 7.11+
2. BPMN
3. DRL
4. Java 11
5. Postman

JSON Request
-----------------------

> {
>    "lookup": "default-stateless-ksession",
>    "commands": [
>        {
>            "insert": {
>                "disconnected": false,
>                "return-object": true,
>                "entry-point": "DEFAULT",
>                "object": {
>                    "java.util.HashMap": {}
>                },
>                "out-identifier": "viperResponse"
>            }
>        },
>        {
>            "insert": {
>                "disconnected": false,
>                "return-object": false,
>                "entry-point": "DEFAULT",
>                "object": {
>                    "com.delta.demo.Foo": {
>                        "firstName" : "nevin"
>                    }
>                },
>                "out-identifier": "viperResponse2"
>            }
>        },
>        {
>            "start-process": {
>                "processId": "Demo.SampleWorkflow",
>                "parameter": [
>                    {
>                        "key": "channel",
>                        "value": {
>                            "channelName": "PNR"
>                        }
>                    }
>                ],
>     
>                "return-object": false,
>                "out-identifier": "some.returns"
>            }
>        }
>    ]
>}

JSON Response
-----------------------

> {
>    "type": "SUCCESS",
>    "msg": "Container Demo_1.0.0-SNAPSHOT successfully called.",
>    "result": {
>        "execution-results": {
>            "results": [
>                {
>                    "value": 1,
>                    "key": "some.returns"
>                },
>                {
>                    "value": {
>                        "ResponseData": 100
>                    },
>                    "key": "viperResponse"
>                }
>            ],
>            "facts": [
>                {
>                    "value": {
>                        "org.drools.core.common.DefaultFactHandle": {
>                            "external-form": "0:49:352902943:352902943:63:DEFAULT:NON_TRAIT:com.delta.demo.Foo"
>                        }
>                    },
>                    "key": "viperResponse2"
>                },
>                {
>                    "value": {
>                        "org.drools.core.common.DefaultFactHandle": {
>                            "external-form": "0:48:1721534797:1603060687:62:DEFAULT:NON_TRAIT:java.util.HashMap"
>                        }
>                    },
>                    "key": "viperResponse"
>                }
>            ]
>        }
>    }
>}
