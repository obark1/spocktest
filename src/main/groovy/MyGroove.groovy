import groovy.util.XmlSlurper

class MyGroove {

    public static void main(String[] args) {

        String my_xml = "<root1><details><rugbysummarycategory><players><player>Joey Carberry</player><player>Teddy Thomas</player></players></rugbysummarycategory></details><details><footballsummarycategory><players><player>Lionel Messi</player><player>Cristiano Ronaldo</player></players></footballsummarycategory></details></root1>";

        def rootNode = new XmlSlurper().parseText(my_xml)
        //def players = rootNode.Details.'*'.Players.Player*.text()
        def players = rootNode.details.'*'.players

        players.each({p -> println(p)})

   //     println "hmm"
   //     println rootNode
   //     println players

    }

}
