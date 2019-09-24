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

