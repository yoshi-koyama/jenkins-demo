Zar Li Hnin
# 概要
このプロジェクトはJenkinsを勉強するために作成したデモプロジェクトです。

# 起動方法
1. このプロジェクトをcloneします
2. `cd jenkins-demo`を実行します
3. `./gradlew bootRn`を実行します
4. `http://localhost:8080/hello`にアクセスします
5. 以下のように表示されていればOKです

<img width="５００" alt="スクリーンショット 2022-02-03 1 50 42" src="https://user-images.githubusercontent.com/62045457/152199278-e1cc943e-1bbd-49de-8fdf-3867ed7ad4b4.png">

# テスト実行
1. `./gradlew test`を実行します
2. コンソールに以下のように表示されればOKです
<img width="５００" alt="スクリーンショット 2022-02-03 1 51 57" src="https://user-images.githubusercontent.com/62045457/152199460-536fafa9-a811-43f7-98e7-032d92891112.png">
3. また、./build/reports配下のindex.htmlを開いて、以下のように表示されていればOKです
<img width="５００" alt="スクリーンショット 2022-02-03 1 53 29" src="https://user-images.githubusercontent.com/62045457/152199736-aeda582b-e79d-4735-a8bd-fdda8b48b295.png">

# テストを失敗させる
1. DemoApplicationTestsのtestHello()メソッドの期待値を`no-hello`に変更します
2. `./gradlew test`を実行します
3. コンソールに以下のように表示されればOKです。エラーの内容をよく読んでください
<img width="５００" alt="スクリーンショット 2022-02-03 1 55 07" src="https://user-images.githubusercontent.com/62045457/152200031-2794c50c-f72d-4e6c-bd0a-27d5a4288fb0.png">
４. また、./build/reports配下のindex.htmlを開いて、以下のように表示されていればOKです
<img width="５００" alt="スクリーンショット 2022-02-03 1 55 52" src="https://user-images.githubusercontent.com/62045457/152200187-6bf82fe4-ed8a-4c0a-83b7-a47701f64ba2.png">
５. 何が原因で失敗したでしょうか？エラーの内容をよく読んでください
<img width="５００" alt="スクリーンショット 2022-02-03 1 56 10" src="https://user-images.githubusercontent.com/62045457/152200246-1922585f-b159-4404-81df-b8359c4d7ba7.png">

# 課題
1. 「起動方法」を読んで実行してください
2. 「テスト実行」を読んで実行してください
3. 「テストを失敗させる」を読んで実行してください
4. このレポジトリのテストを実行するJenkinsのジョブを作成してください
5. このレポジトリのmainブランチにマージがされたらテストを実行するジョブを作成してください
6. ５のやり方をPDFにまとめてください
