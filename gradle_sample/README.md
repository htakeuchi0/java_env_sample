# gradleサンプル

## インストール

以下のコマンドでインストールできる．

```
$ sudo apt install gradle
```

インストールの確認．

```
$ java --version
openjdk 11.0.4 2019-07-16
OpenJDK Runtime Environment (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3)
OpenJDK 64-Bit Server VM (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3, mixed mode, sharing)
```

```
$ javac --version
javac 11.0.4
```

```
$ gradle --version
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.codehaus.groovy.reflection.CachedClass (file:/usr/share/java/groovy-all.jar) to method java.lang.Object.finalize()
WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.reflection.CachedClass
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release

------------------------------------------------------------
Gradle 4.4.1
------------------------------------------------------------

Build time:   2012-12-21 00:00:00 UTC
Revision:     none

Groovy:       2.4.16
Ant:          Apache Ant(TM) version 1.10.5 compiled on March 28 2019
JVM:          11.0.4 (Ubuntu 11.0.4+11-post-Ubuntu-1ubuntu218.04.3)
OS:           Linux 5.0.0-29-generic amd64
```

## 環境のつくりかた

Mavenと同様のディレクトリ構成にする．

```
$ mkdir gradle_sample
$ cd gradle_sample
$ mkdir -p src/java/main/hello
$ mkdir -p src/java/test/hello
```

`gradle init`で生成される`build.gradle`を編集すればよい．

## つかいかた

ビルドと実行．`make` でもよい．

```
$ gradle build
$ gradle run
```

jarファイルでもよい．

```
$ gradle build
$ java -jar build/libs/gradle_sample.jar 
```

テスト．`make test` でもよい．

```
$ gradle test
```

初期化．`make clean` でもよい．

```
$ gradle clean
```

Javadocの生成．    
`build/docs/javadocs/index.html`をブラウザで開いて読む．    
`make docs` でもよい．

```
$ gradle javadoc
```
