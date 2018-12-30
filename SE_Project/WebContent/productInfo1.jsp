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
    <title>产品</title>
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
                      <span class="text-default"> 用户名</span>
                      <small class="text-muted d-block mt-1"> 用户类型</small>
                    </span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right dropdown-menu-arrow">
                    <a class="dropdown-item" href="./modifyInfo.jsp">
                      <i class="dropdown-icon fe fe-user"></i> 设置
                    </a>
                    <a class="dropdown-item" href="./showMyMessage.jsp">
                      <i class="dropdown-icon fe fe-send"></i> 留言
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="./login.jsp">
                      <i class="dropdown-icon fe fe-log-out"></i> 退出
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
             
              <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                  <li class="nav-item">
                    <a href="./index.jsp" class="nav-link"><i class="fe fe-home"></i>&nbsp;首页&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./ExhibitInfo.jsp" class="nav-link"><i class="fe fe-box"></i>&nbsp;展会&nbsp;</a>
                  </li>
                  <li class="nav-item">
                     <a href="./NewsInfo.jsp" class="nav-link"><i class="fe fe-calendar"></i>&nbsp;咨询&nbsp;</a>
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
        <!-- HEAD END -->
          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;产品
                </h1>
              </div>
        
         
           <div class="container">
            <div class="row align-items-center">
        	 <div class="col-lg-3 ml-auto">
         	 <form class="input-icon my-3 my-lg-0" action="#">
                  <input type="search" class="form-control header-search" name="searchcontent"   placeholder="Search&hellip;" tabindex="1">
                  <div class="input-icon-addon">
                    <i class="fe fe-search"></i>
                  </div>
                </form>	
               </div>
              <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                  
                  <li class="nav-item">
                    <a href="./productInfo.jsp" class="nav-link"><i class="fa fa-connectdevelop"></i>&nbsp;科技&nbsp;</a>
                  </li>
                  <li class="nav-item">
                     <a href="./productInfo1.jsp" class="nav-link active"><i class="fa fa-empire"></i>&nbsp;动漫&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./productInfo2.jsp" class="nav-link"><i class="fe fe-film"></i>&nbsp;音像&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./productInfo3.jsp" class="nav-link"><i class="fe fe-globe"></i>&nbsp;影视&nbsp;</a>
                  </li>
                </ul>
              </div>
             </div>
              </div>


              <div class="col-lg-12">
                <div class="card">
                  <table class="table card-table table-vcenter">
                    <tr>
                        
                      <td>
                     <img src="demo/products/apple-iphone7-special.jpg" alt="" class="h-8">
                      
                      </td>
                      <td>
                      产品名
                      </td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">98 reviews</td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">38 offers</td>
                      <td class="text-right">
                        <strong>产品价格</strong>
                      </td>
                      <td class="text-right">
                            <a href="javascript:void(0)" class="btn btn-primary"><i class="fe fe-plus"></i> 查看详情</a>
                      </td>
                    </tr>
                    <tr>
                      <td><img src="demo/products/apple-iphone7-special.jpg" alt="" class="h-8"></td>
                      <td>
                        产品名
                      </td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">98 reviews</td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">38 offers</td>
                      <td class="text-right">
                        <strong>产品价格</strong>
                      </td>
                       <td class="text-right">
                            <a href="javascript:void(0)" class="btn btn-primary"><i class="fe fe-plus"></i> 查看详情</a>
                      </td>
                    </tr>
                   
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="footer">
        <div class="container">
          <div class="row">
            <div class="col-lg-8">
              <div class="row">
                <div class="col-6 col-md-3">
                  <ul class="list-unstyled mb-0">
                    <li><a href="#">First link</a></li>
                    <li><a href="#">Second link</a></li>
                  </ul>
                </div>
                <div class="col-6 col-md-3">
                  <ul class="list-unstyled mb-0">
                    <li><a href="#">Third link</a></li>
                    <li><a href="#">Fourth link</a></li>
                  </ul>
                </div>
                <div class="col-6 col-md-3">
                  <ul class="list-unstyled mb-0">
                    <li><a href="#">Fifth link</a></li>
                    <li><a href="#">Sixth link</a></li>
                  </ul>
                </div>
                <div class="col-6 col-md-3">
                  <ul class="list-unstyled mb-0">
                    <li><a href="#">Other link</a></li>
                    <li><a href="#">Last link</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-lg-4 mt-4 mt-lg-0">
              Premium and Open Source dashboard template with responsive and high quality UI. For Free!
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