# Java開発環境の作成サンプル

## 概要

Maven, gradleの基本的な使いかたをまとめる．    
実行環境は以下のとおりである．

* OS: Linux (Ubuntu 18.04.3 LTS)

## サンプル元

以下のページのサンプルプログラムをもとにして考える．
* タイトル：ubuntu16.04にGradleを入れてHelloWorldをビルドしてみた。
* URL: `https://qiita.com/marutanseijin/items/b2897539ea94d67739e6`

コンパイルには以下のライブラリが必要となる．    
* Joda-Time
  * https://www.joda.org/joda-time/

また，単体テストには以下のライブラリが必要となる．
* JUnit
  * https://junit.org/junit5/

Maven, gradleそれぞれで，最低限，以上のライブラリを含める必要がある．   
また，依存ライブラリを含めたjarファイルが生成できるサンプルを作成する．

## 備考

現在時刻を取得するためだけならば，`java.time.LocalDateTime`を使えばよい．    
今回はMaven, gradleの使いかたの確認のために，外部ライブラリを使用している．

