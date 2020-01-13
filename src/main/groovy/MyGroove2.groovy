class MyGroove2 {
    static stringXML =
            '<personDatabase>'+
                    '  <person><firstName>John</firstName><lastName>Doe</lastName><age>25</age></person>'+
                    '  <person><firstName>Jane</firstName><lastName>Smith</lastName><age>31</age></person>'+
                    '  <person><firstName>Robert</firstName><lastName>Doe</lastName><age>11</age></person>'+
                    '  <person><firstName>Michael</firstName><lastName>Smith</lastName><age>55</age></person>'+
                    '  <person><firstName>Scott</firstName><lastName>Williams</lastName><age>35</age></person>'+
                    '  <person><firstName>Alice</firstName><lastName>Anthony</lastName><age>14</age></person>'+
                    '</personDatabase>'
    static main(args) {
        def people = new XmlSlurper().parseText(stringXML)
        people.person.findAll { p ->
            p.age.toInteger() > 20
        }.each { p ->
            println "${p.lastName}, ${p.firstName} is ${p.age} years old."
        }
    }
}
