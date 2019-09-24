# words-printer
https://github.com/suzuki-hoge/hoge-work/tree/master/words-printer 実装

### ふりかえり
#### 経過時間
+ 2019/9/22(日) 3H
+ 2019/9/23(月) 6H

#### うまくいった点
+ 自宅でintelliJプロジェクト立ち上げ・githubにcommit等ができた
+ commit時、gitconfigでユーザ名指定していなかったので事故ったけど修正できた
https://qiita.com/sea_mountain/items/d70216a5bc16a88ed932
+ spockでテストを書けた
+ 標準出力のテストを実装できた。でもちゃんと理解できていないので要課題
+ できるところまで、という目標で一通り動くものを実装できた

#### うまくいかなかった点
+ compress実装できなかった。悔しい。正規表現でなんとかしようと思ったけどできなかった。
+ mainクラスがダサい。switch文だし、全部newしてるし。。でも一応動く。現状の力量ではここまでしかできない。
+ `javac Main.java`して`java Main "aaa bbb ccc" --capitalize --horizontal`しないと動かない。
+ 標準出力のテスト書くの難しい。Mockしてるけどいまいち何やってるかわかっていない。あとbuild.gradleにも追加したけどこちらもまだ理解できていない。
+ gitにpushするときに怒られた。今回はsourcetree使わないでコマンドで全部やったけど、コマンドちゃんと勉強せねば。
https://www.softel.co.jp/blogs/tech/archives/3569
+ 最初にコミットした際、コミットユーザとメールアドレスが事故った。焦った。gitconfigちゃんと設定していなかったせい。
+ 全部実装できなかったのが本当に悔しい。。


### ふりかえり：2019/9/24(火)追加分
#### 経過時間
+ 2019/9/24(火) 3.5H

#### 前回からの課題
+ テストコードを忘れない
  + ✖️：Resolverテストクラス書いていない。
+ 各処理は独立させる
  + △：Mainの処理をResolverに持っていったので△。しかしResolverクラスはごちゃごちゃしている
+ 破壊禁止（final必須）
  + △：Resolverクラスにしかfinal指定していない
+ 標準出力を避ける
  + △：outputで標準出力している

#### うまくいった点
+ Resolverクラスにrunメソッドを追加し、コンストラクタから呼び出すようにしたのでMainではnewするだけでいいことにした

#### うまくいかなかった点
+ Resolverクラスでconversionとoutputのどれを使うかを決める処理を実装できなかった
  + filterでconversionだけのリストを作ってそれを元に実行する、というようなことも考えたけど現状のSwitch文と大差なかった
+ Resolverクラスのテストを書けていない
  + ↑どれ使うか決める処理を考えることに時間を使いすぎてタイムアップ。どこまでリファクタするか計画立てていなかった。
+ Resolver#runのvoid問題
  + MainにListで返してprintlnするとお題にある形式で出力できない。ので困ってvoidにしてprintlnは各output処理でやってしもた
+ final指定してるのはResolverクラスだけ
  + 各パーサーのフィールドもfinalして動かせていない
+ リファクタ順番を誤った。5からいきなりやったので他が全部後回しになった。
  + 1.各パーサーにfinal指定、テスト実行
  + 2.Resolverクラスを作成（細かい処理はまだ書かない）
  + 3.Mainクラスの処理をResolverクラスにうつす
  + 4.Resolverクラスのテストを実装、テスト実行
  + 5.Resolverクラスのリファクタ。いい感じの処理に直す。

