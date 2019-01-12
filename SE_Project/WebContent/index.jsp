<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                      <i class="dropdown-icon fe fe-user"></i> 注册
                    </a>
               		 </s:if>
                    <!-- 用户功能条 -->
                    <s:elseif test="#session.user.role == 1">
                    <a class="dropdown-item" href="./modifyInfo.jsp">
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                  
                    <a class="dropdown-item" href="./showMyMessage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 留言管理
                    </a>
                    <a class="dropdown-item" href="./qInfoManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 供应信息管理
                    </a>
                     <a class="dropdown-item" href="./aInfoManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 求购信息管理
                    </a>
          			</s:elseif>
                    <!-- 管理员功能条 -->
                    <s:else >
                      <a class="dropdown-item" href="./modifyInfo.jsp">
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                    <a class="dropdown-item" href="./messageManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 留言管理
                    </a>
                    <a class="dropdown-item" href="./qInfoManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 供应信息管理
                    </a>
                     <a class="dropdown-item" href="./aInfoManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 求购信息管理
                    </a>
                    <a class="dropdown-item" href="./newsInfoManage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 资讯信息管理
                    </a>
                    <a class="dropdown-item" href="./exhibitInfoManage.jsp">
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
                    <a href="./AInfo.jsp" class="nav-link"><i class="fe fe-file"></i>&nbsp;求购&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./QInfo.jsp" class="nav-link"><i class="fe fe-check-square"></i>&nbsp;供应&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./productInfo.jsp" class="nav-link"><i class="fe fe-image"></i>&nbsp;产品</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="my-3 my-md-6">
          <div class="container">
              <div class="col-md-12">
                <div class="card">
                  
                    <div id="carousel-captions" class="carousel slide" data-ride="carousel">
                      <div class="carousel-inner">
                        <div class="carousel-item active">
                          <img class="d-block w-100" alt="" src="./demo/photos/david-marcu-114194-1500.jpg" data-holder-rendered="true">
                          <div class="carousel-item-background d-none d-md-block"></div>
                          <div class="carousel-caption d-none d-md-block">
                            <h3>妙啊</h3>
                            <p>妙可妙！非常妙</p>
                          </div>
                        </div>
                        <div class="carousel-item">
                          <img class="d-block w-100" alt="" src="./demo/photos/davide-cantelli-139887-1500.jpg" data-holder-rendered="true">
                          <div class="carousel-item-background d-none d-md-block"></div>
                          <div class="carousel-caption d-none d-md-block">
                            <h3>溜啊</h3>
                            <p>溜可溜！非常溜</p>
                          </div>
                        </div>
                        <div class="carousel-item">
                          <img class="d-block w-100" alt="" src="./demo/photos/dino-reichmuth-84359-1500.jpg" data-holder-rendered="true">
                          <div class="carousel-item-background d-none d-md-block"></div>
                          <div class="carousel-caption d-none d-md-block">
                            <h3>秀啊</h3>
                            <p>秀可秀！非常秀</p>
                          </div>
                        </div>
                        <div class="carousel-item">
                          <img class="d-block w-100" alt="" src="./demo/photos/eberhard-grossgasteiger-311213-1500.jpg" data-holder-rendered="true">
                          <div class="carousel-item-background d-none d-md-block"></div>
                          <div class="carousel-caption d-none d-md-block">
                            <h3>膜啊</h3>
                            <p>膜可膜！非常膜</p>
                          </div>
                        </div>
                        <div class="carousel-item">
                          <img class="d-block w-100" alt="" src="./demo/photos/geran-de-klerk-290418-1500.jpg" data-holder-rendered="true">
                          <div class="carousel-item-background d-none d-md-block"></div>
                          <div class="carousel-caption d-none d-md-block">
                            <h3>好啊</h3>
                            <p>好可好！非常好</p>
                          </div>
                        </div>
                      </div>
                      <a class="carousel-control-prev" href="#carousel-captions" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                      </a>
                      <a class="carousel-control-next" href="#carousel-captions" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                      </a>
                    </div>
                 
                </div>
              </div>
            </div>
          </div> 
     <footer class="footer">
        <div class="container">
          <div class="row align-items-center flex-row-reverse">
            <div class="col-auto ml-lg-auto">
              <div class="row align-items-center">
                <div class="col-auto">
                  <ul class="list-inline list-inline-dots mb-0">
                    <li class="list-inline-item">By</li>
                    <li class="list-inline-item">王超群</li>
                    <li class="list-inline-item">王金龙</li>
                    <li class="list-inline-item">陈立德</li>
                    <li class="list-inline-item">史金明</li>
                    <li class="list-inline-item">孙利龙</li>
                    <li class="list-inline-item">陈飞阳</li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-12 col-lg-auto mt-3 mt-lg-0 text-center">
              Copyright © 2018 <a href="./index.jsp">ccipp</a>.  All rights reserved.
            </div>
          </div>
        </div>
      </footer>
    </div>
   </div>
  </body>
</html>