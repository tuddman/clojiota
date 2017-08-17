# clojiota

A Clojure library built on top of the [IOTA](https://iota.org/) Reference Implementation. Adds useful enhancements.

## Setup



###### Prerequisites:
    Java 8 installed
    maven installed
    leiningen installed

First, locally install the underlying IOTA Reference Implementation (iri)

```bash
$ git clone https://github.com/iotaledger/iri
$ cd iri
$ mvn clean compile 
$ mvn install

```
Now we can run clojiota

...with command-line options

```bash
$ git clone https://github.com/tuddman/clojiota
$ cd clojiota
$ lein compile
$ java -jar target/clojiota.jar -p 14265
```

...or with an .ini file 

```bash
$ git clone https://github.com/tuddman/clojiota
$ cd clojiota
$ lein compile
$ cp iri.ini.example iri.ini
# edit iri.ini to suit your needs. then...
$ java -jar target/clojiota.jar --config iri.ini
```

Really, all of the command-line options that can be passed to [iri](https://github.com/iotaledger/iri) can be passed to clojiota as well.

What is MORE fun, though, is spinning up a REPL to interact with IOTA

```bash
$ lein repl
> (clojiota.core/-main "-p" "14265")

wait...

> (clojiota.client/get-node-info)
> (clojiota.client/get-neighbors-activity)
> (clojiota.client/get-tips)
> ...
```
More to come.
