Multi-Play-Project
------------------

> Illustrates how to have multiple Play apps which share a common library but are not deployed together.


Start web1:

    cd web1
    play "~run 9001"

Open web1: [http://localhost:9001](http://localhost:9001)

Start web2:

    cd web2
    play "~run 9002"

Open web2: [http://localhost:9002](http://localhost:9002)


Make a change to `common/src/main/java/foo/Foo.java` and then refresh both browsers.
