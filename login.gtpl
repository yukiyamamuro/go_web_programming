<html>
  <head>
    <title>goでWebサイト作成</title>
  </head>
  <body>
    <form action="/login" method="post">
      <input type="checkbox" name="interest" value="football">サッカー
      <input type="checkbox" name="interest" value="basketball">バスケットボール
      <input type="checkbox" name="interest" value="tennis">テニス
      ユーザ名:<input type="text" name="username">
      パスワード:<input type="password" name="password">
      <input type="hidden" name="token" value="{{.}}">
      <input type="submit" value="ログイン">
    </form>
  </body>
</html>