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
    <title>首页</title>
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
              <a class="header-brand" href="./index.jsp">
              	<!-- logo图片 -->
                <img src="./demo/brand/tabler.svg" class="header-brand-img" alt="ccipp logo">
              </a>
              <div class="d-flex order-lg-2 ml-auto">
                <div class="dropdown d-none d-md-flex">
                  <a class="nav-link icon" data-toggle="dropdown">
                    <i class="fe fe-bell"></i>
                  </a>
                </div>
<div class="dropdown">
                  <a href="#" class="nav-link pr-0 leading-none" data-toggle="dropdown">
                  	
                    <span class="avatar" style="background-image: url(#session.user.avator)"></span>
                    <span class="ml-2 d-none d-lg-block">
                      <span class="text-default"><s:property value="#session.user.username"/></span>
                      <small class="text-muted d-block mt-1">
                       <s:if test="#session.user.role == 0">游客</s:if>
               		   <s:elseif test="#session.user.role == 1">个人会员</s:elseif>
                       <s:elseif test="#session.user.role == 2">企业会员</s:elseif>
                       <s:else>管理员</s:else>
                      </small>
                    </span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right dropdown-menu-arrow">
                     
                     
  					 <!--所有要获取信息的跳转 均需改成 s:url 进行跳转到action中  -->
                    <!-- 游客功能条 -->
                    <s:if test="#session.user.role == 0">
                     <a class="dropdown-item" href="./register.jsp">
                     <!-- 直接跳转-->
                      <i class="dropdown-icon fe fe-user"></i> 注册
                    </a>
               		 </s:if>
                    <!-- 用户功能条 -->
                    <s:elseif test="#session.user.role == 1">
                    <a class="dropdown-item" href="user_modify.action">
                    	<!-- 跳转到modifyInfo 直接跳转？-->
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                  
                    <a class="dropdown-item" href="message_show.action">
                      <i class="dropdown-icon fe fe-send"></i> 留言管理
                    </a>
                    <a class="dropdown-item" href="a_showMyA.action">
                    <!-- 看自己的Q么-->
                      <i class="dropdown-icon fe fe-send"></i> 供应信息管理
                    </a>
                     <a class="dropdown-item" href="q_showMyQ.action">
                      <i class="dropdown-icon fe fe-send"></i> 求购信息管理
                    </a>
          			</s:elseif>
                    <!-- 管理员功能条 -->
                    <s:else >
                      <a class="dropdown-item" href="user_modify.action">
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                    <a class="dropdown-item" href="message_show.action">
                      <i class="dropdown-icon fe fe-send"></i> 留言管理
                    </a>
                    <a class="dropdown-item" href="a_showMyA.action">
                      <i class="dropdown-icon fe fe-send"></i> 供应信息管理
                    </a>
                     <a class="dropdown-item" href="q_showMyQ.action">
                      <i class="dropdown-icon fe fe-send"></i> 求购信息管理
                    </a>
                    <a class="dropdown-item" href="news_show.action">
                      <i class="dropdown-icon fe fe-send"></i> 资讯信息管理
                    </a>
                    <a class="dropdown-item" href="exhibit_show.action">
                      <i class="dropdown-icon fe fe-send"></i> 展会信息管理
                    </a>
                    </s:else>
                    
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="./login.jsp">
                      <i class="dropdown-icon fe fe-log-out"></i>退出
                    </a>
                    
                    
                  </div>
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
              <div class="col-lg order-lg-first">
               <!--所有要获取信息的跳转 均需改成 s:url 进行跳转到action中  -->
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                  <li class="nav-item">
                    <a href="./index.jsp" class="nav-link"><i class="fe fe-home"></i>&nbsp;首页&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="exhibit_show.action" class="nav-link"><i class="fe fe-box"></i>&nbsp;展会&nbsp;</a>
                  </li>
                  <li class="nav-item">
                     <a href="news_show.action" class="nav-link"><i class="fe fe-calendar"></i>&nbsp;咨询&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="a_show.action" class="nav-link"><i class="fe fe-file"></i>&nbsp;供应&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="q_show.action" class="nav-link"><i class="fe fe-check-square"></i>&nbsp;求购&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="product_showScience.action" class="nav-link"><i class="fe fe-image"></i>&nbsp;产品</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        