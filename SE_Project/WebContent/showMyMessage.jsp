<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
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
    <title>留言</title>
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
      <div class="page-main">
        <div class="header py-4">
          <div class="container">
            <div class="d-flex">
              <a class="header-brand" href="./index.html">
                <img src="./demo/brand/tabler.svg" class="header-brand-img" alt="tabler logo">
              </a>
              <div class="d-flex order-lg-2 ml-auto">
                <div class="dropdown d-none d-md-flex">
                  <a class="nav-link icon" data-toggle="dropdown">
                    <i class="fe fe-bell"></i>
                  </a>
                </div>
               <div class="dropdown">
                  <a href="#" class="nav-link pr-0 leading-none" data-toggle="dropdown">
                    <span class="avatar" style="background-image: url(./demo/faces/female/25.jpg)"></span>
                    <span class="ml-2 d-none d-lg-block">
                      <span class="text-default">用户名</span>
                      <small class="text-muted d-block mt-1">用户类型</small>
                    </span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right dropdown-menu-arrow">
                    <a class="dropdown-item" href="./modifyInfo.html">
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                    <a class="dropdown-item" href="./showMyMessage.html">
                      <i class="dropdown-icon fe fe-send"></i> 留言
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="./login.html">
                      <i class="dropdown-icon fe fe-log-out"></i>退出
                    </a>
                  </div>
                </div>
              <a href="#" class="header-toggler d-lg-none ml-3 ml-lg-0" data-toggle="collapse" data-target="#headerMenuCollapse">
                <span class="header-toggler-icon"></span>
              </a>
            </div>
          </div>
        </div>
        <div class="header collapse d-lg-flex p-0" id="headerMenuCollapse">
          <div class="container">
            <div class="row align-items-center">
              <div class="col-lg-3 ml-auto">
                <form class="input-icon my-3 my-lg-0" action="???">
                  <input type="search" class="form-control header-search" name="searchcontent"   placeholder="Search&hellip;" tabindex="1">
                  <div class="input-icon-addon">
                    <i class="fe fe-search"></i>
                  </div>
                </form>
              </div>
              <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                  <li class="nav-item">
                    <a href="./index.html" class="nav-link"><i class="fe fe-home"></i>&nbsp;首页&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./ExhibitInfo.html" class="nav-link"><i class="fe fe-box"></i>&nbsp;展会&nbsp;</a>
                  </li>
                  <li class="nav-item">
                     <a href="./NewsInfo.html" class="nav-link"><i class="fe fe-calendar"></i>&nbsp;咨询&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./AInfo.html" class="nav-link"><i class="fe fe-file"></i>&nbsp;求购&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./QInfo.html" class="nav-link"><i class="fe fe-check-square"></i>&nbsp;供应&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./products.html" class="nav-link"><i class="fe fe-image"></i>&nbsp;产品</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
            <div class="my-3 my-md-5">
          <div class="container">
            <div class="row">
              <div class="col-md-3">
                <h3 class="page-title mb-5">留言服务</h3>
                <small>个人查询界面</small>	
              </div>
              <div class="card">
                <div class="card">
                  <div class="card-header">
                    <h3 class="card-title">查看留言</h3>
                  </div>


			       <div class="card">
                  <div class="card-body">
                    <article class="media">
                      <div class="media-body">
                        <div class="content">
                          <p class="h5">
                            留言人姓名 <small class="float-right text-muted">留言时间</small>
                          </p>
                          <p>
                            留言内容
                          </p>
                           <nav class="d-flex text-muted">
                          <i class="fe fe-navigation">被留言的类型 展会|咨询|供求|</i>
                          &nbsp;&nbsp;&nbsp;
                          <i class="fe fe-align-justify">被留言的title</i>
                          </nav>
                          <div class="float-right">
                          <a href="#"> <button type="button" class="btn btn-primary btn-space btn-sm">删除</button> </a> 
                          </div>
                    </article>
                  </div>

              
               </div>

<s:iterator value="#session.messages" var="xx" status="st">  

<div class="card">
                  <div class="card-body">
                    <article class="media">
                      <div class="media-body">
                        <div class="content">
                          <p class="h5">
                            留言人姓名:<s:property value="#xx.username"/> <small class="float-right text-muted">留言时间:<s:property value="#xx.mdate"/></small>
                          </p>
                          <p>
                            留言内容:<s:property value="#xx.mcontent"/>
                          </p>
                           <nav class="d-flex text-muted">
                          <i class="fe fe-navigation">被留言的类型 <s:if test="#xx.mobjtype == 0">咨询</s:if>
<s:else>
	<s:if test="#xx.mobjtype == 1">展会</s:if>
	<s:else>
		<s:if test="#xx.mobjtype == 2">咨询</s:if>
		<s:else>
			<s:if test="#xx.mobjtype == 3">咨询</s:if>
			<s:else>
				<s:if test="#xx.mobjtype == 4">咨询</s:if>
			</s:else>
		</s:else>
	</s:else>
</s:else>
</i>
                          &nbsp;&nbsp;&nbsp;
                          <i class="fe fe-align-justify">名称:<s:property value="#xx.mobjtitle"/></i>
                          </nav>
                          <div class="float-right">
                          <a href="message_delete?mid=<s:property value="#xx.mid"/>"> <button type="button" class="btn btn-primary btn-space btn-sm">删除</button> </a> 
                          </div>
                    </article>
                  </div>

              
               </div>


</s:iterator>








      <footer class="footer">
        <div class="container">
          <div class="row align-items-center flex-row-reverse">
            <div class="col-auto ml-lg-auto">
              <div class="row align-items-center">
                <div class="col-auto">
                  <ul class="list-inline list-inline-dots mb-0">
                    <li class="list-inline-item"><a href="./docs/index.html">Documentation</a></li>
                    <li class="list-inline-item"><a href="./faq.html">FAQ</a></li>
                  </ul>
                </div>
                <div class="col-auto">
                  <a href="https://github.com/tabler/tabler" class="btn btn-outline-primary btn-sm">Source code</a>
                </div>
              </div>
            </div>
            <div class="col-12 col-lg-auto mt-3 mt-lg-0 text-center">
              Copyright © 2018 <a href=".">Tabler</a>.  All rights reserved.
            </div>
          </div>
        </div>
      </footer>
    </div>
  </body>
</html>