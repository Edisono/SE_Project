<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
	document.getElementsByTagName("title")[0].innerText = '产品';
</script>
<!-- HEAD END -->
<div class="my-3 my-md-5">
	<div class="container">
		<div class="page-header">
			<h1 class="page-title">&nbsp;产品详情</h1>
		</div>



		<div class="row">
			<div class="col-lg-9">
				<div class="card">
					<div class="card-body">
						<div class="text-wrap p-lg-6">
							<!-- <a href="javascript:void(0)" class="mb-3"> <img
								src="demo/photos/nathan-anderson-316188-500.jpg" alt="产品图片"
								class="rounded">
							</a> -->
							<a
								href="./product_showDetail?pid=<s:property value="%{#session.ProductDetail.pid}"/>"
								class="card-aside-column"
								style="background-image: url(<s:property value="%{#session.ProductDetail.pimage}"/>)"></a>
						</div>
						<div class="text-wrap p-lg-3">
							<h4 class="card-title">
								<s:property value="%{#session.ProductDetail.pname}" />
							</h4>
							<div class="d-flex align-items-center px-2">
								<div>
									<small class="d-block text-muted"><s:property
											value="%{#session.ProductDetail.ptype}" /></small>
								</div>
								<div class="ml-auto text-muted">
									<a href="javascript:void(0)" class="icon"><i
										class="fe fe-eye mr-1"></i> 96</a> <a href="javascript:void(0)"
										class="icon d-none d-md-inline-block ml-3"><i
										class="fe fe-heart mr-1"></i> 6</a>
								</div>
							</div>
							<ul class="list-group card-list-group">
								<li class="list-group-item"><s:property
										value="%{#session.ProductDetail.pintroduce}" /></li>
							</ul>
						</div>
						<!-- <div class="card-body">
							<a href="javascript:void(0)" class="card-link"><button
									class="btn btn-primary">购&nbsp;&nbsp;买</button></a>
						</div> -->
					</div>
				</div>
			</div>
		</div>
		<!--添加留言-->
		<div class="card-footer text-right">
			<a href="addMessage.jsp">
				<button class="btn btn-primary">添加留言</button>
			</a>
		</div>
		<!-- 留言界面 -->
		<s:iterator value="#session.ProductMessage" var="xx" status="st">
			<div class="card">
				<div class="card-body">
					<article class="media">
						<div class="media-body">
							<div class="content">
								<p class="h5">
									<s:property value="#xx.username" />
									<small class="float-right text-muted"><s:property
											value="#xx.mdate" /></small>
								</p>
								<p>
									<s:property value="#xx.mcontent" />
								</p>
							</div>
						</div>
					</article>
				</div>
			</div>
		</s:iterator>
	</div>
</div>

<%@include file="End.jsp"%>