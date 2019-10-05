# Mavenサンプル

## インストール

以下のコマンドでインストールできる．

```
$ sudo apt install maven
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
$ mvn --version
Apache Maven 3.6.0
Maven home: /usr/share/maven
Java version: 11.0.4, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: ja_JP, platform encoding: UTF-8
OS name: "linux", version: "5.0.0-29-generic", arch: "amd64", family: "unix"
```

## 環境のつくりかた

本プロジェクトの場合は，以下のコマンドでよい．

```
$ mvn archetype:generate -DinteractiveMode=false -DgroupId=hello -DartifactId=maven_sample
```

以下のディレクトリ構成で生成されるので，    
必要に応じて `pom.xml` やソースファイルを編集すればよい．

```
|- maven_sample
   |- pom.xml
   |- src/main/java/hello/App.java
   |- src/test/java/hello/AppTest.java
```

## つかいかた

ビルドと実行．

```
$ mvn package
$ java -jar target/maven_sample-1.0-jar-with-dependencies.jar 
```

テスト．
```
$ mvn package
```

初期化．
```
$ mvn clean
```

