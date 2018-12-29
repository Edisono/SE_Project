<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="Content-Language" content="en" />
    <meta name="msapplication-TileColor" content="#2d89ef">
    <meta name="theme-color" content="#4188c9">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent"/>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="HandheldFriendly" content="True">
    <meta name="MobileOptimized" content="320">
    <link rel="icon" href="./favicon.ico" type="image/x-icon"/>
    <link rel="shortcut icon" type="image/x-icon" href="./favicon.ico" />
    <!-- Generated: 2018-04-06 16:27:42 +0200 -->
    <title>Register</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,500,500i,600,600i,700,700i&amp;subset=latin-ext">
    <script src="./assets/js/require.min.js"></script>
    <script>
      requirejs.config({
          baseUrl: '.'
      });
    </script>
    <!-- Dashboard Core -->
    <link href="./assets/css/dashboard.css" rel="stylesheet" />
    <script src="./assets/js/dashboard.js"></script>
    <!-- c3.js Charts Plugin -->
    <link href="./assets/plugins/charts-c3/plugin.css" rel="stylesheet" />
    <script src="./assets/plugins/charts-c3/plugin.js"></script>
    <!-- Google Maps Plugin -->
    <link href="./assets/plugins/maps-google/plugin.css" rel="stylesheet" />
    <script src="./assets/plugins/maps-google/plugin.js"></script>
    <!-- Input Mask Plugin -->
    <script src="./assets/plugins/input-mask/plugin.js"></script>
  </head>
  <body class="">
    <div class="page">
      <div class="page-single">
        <div class="container">
          <div class="row">
            <div class="col col-login mx-auto">
              <div class="text-center mb-7">
                <img src="./demo/brand/tabler.svg" class="h-7" alt="">
              </div>
              <form class="card" action="Register" method="post" enctype="multipart/form-data">
                <div class="card-body p-7">
                  <div class="form-group">
                    <label class="form-label">用户昵称/企业名</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter name">
                  </div>
                  <div class="form-group">
                    <label class="form-label">邮箱地址</label>
                    <input type="email" name="email" class="form-control" placeholder="Enter email">
                  </div>
                  <div class="form-group">
                    <label class="form-label">密码</label>
                    <input type="password"  name="password" class="form-control" placeholder="Password">
                  </div>
                   <div class="form-group">
                    <label class="form-label">头像</label>
                    <div class="custom-file">
                    <input type="file" class="custom-file-input" name="avator">
                    <label class="custom-file-label">Choose file</label>
                     </div>
                   </div>
                  <div class="form-group">
                    <label class="form-label">地址</label>
                    <input type="text"  name="address" class="form-control" placeholder="Enter address">
                  </div>
                  <div class="form-group">
                    <label class="form-label">QQ</label>
                    <input type="text"  name="QQ" class="form-control" placeholder="Enter QQ">
                  </div>
                  <div class="form-group">
                    <label class="form-label">TEL</label>
                    <input type="text"  name="phone" class="form-control" placeholder="Enter TEL">
                  </div>
                  <div class="form-group">
                    <label class="form-label">个人简介</label>
                    <textarea type="text"  name="profile" class="form-control"  rows="4" placeholder="Content..">
                      </textarea>
                  </div>
                  <div class="form-footer">
                    <button type="submit" class="btn btn-primary btn-block">创建新账户</button>
                  </div>
                </div>
              </form>
              <div class="text-center text-muted">
                已有账户? <a href="./login.html">登陆</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>