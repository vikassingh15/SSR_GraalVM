# SSR Demo Application

A demo app that uses a Spring Java backend with a React
frontend and can perform server-side rendering (SSR).

## Running the code

Execute `mvn -Dpolyglot.js.nashorn-compat=true` if you have Maven already installed, or `./mvnw` if you
don't. You'll need [Java8
installed](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
either way at a *MINIMUM* version of `1.8.0_65`.

Other than JDK you will required to have [GraalVM](https://www.graalvm.org/docs/getting-started/) configured in system in order for application to find graal.js Script Engine.
