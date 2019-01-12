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
			<h1 class="page-title">&nbsp;产品</h1>
		</div>

		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-3 ml-auto">
					<form class="input-icon my-3 my-lg-0"
						action="./product_search.action">
						<input type="search" class="form-control header-search"
							name="searchcontent" placeholder="Search&hellip;" tabindex="1">
						<div class="input-icon-addon">
							<i class="fe fe-search"></i>
						</div>
					</form>
				</div>
				<div class="col-lg order-lg-first">
					<ul class="nav nav-tabs border-0 flex-column flex-lg-row">

						<li class="nav-item"><a href="./product_showScience.action"
							class="nav-link active"><i class="fa fa-connectdevelop"></i>&nbsp;科技&nbsp;</a>
						</li>
						<li class="nav-item"><a href="./product_showCartoon.action"
							class="nav-link"><i class="fa fa-empire"></i>&nbsp;动漫&nbsp;</a></li>
						<li class="nav-item"><a href="./product_showAudio.action"
							class="nav-link active"><i class="fe fe-film"></i>&nbsp;音像&nbsp;</a></li>
						<li class="nav-item"><a href="./product_showVideo.action"
							class="nav-link"><i class="fe fe-globe"></i>&nbsp;影视&nbsp;</a></li>
					</ul>
				</div>
			</div>
		</div>


		<s:iterator value="#session.ProductList" var="xx" status="st">
			<div class="col-lg-12">
				<div class="card">
					<table class="table card-table table-vcenter">
						<tr>
							<td><a href="./product_showDetail?aid=<s:property value="#xx.pid"/>"
								class="card-aside-column"
								style="background-image: url(<s:property value="#xx.pimage"/>)"></a></td>

							<td><s:property value="#xx.pname" /></td>
							<td
								class="text-right text-muted d-none d-md-table-cell text-nowrap">198
								reviews</td>
							<td
								class="text-right text-muted d-none d-md-table-cell text-nowrap">99
								offers</td>
							<td class="text-right"><strong><s:property
										value="#xx.pprice" /></strong></td>
							<td class="text-right"><a href="./product_showDetail" class="btn btn-primary"><i
									class="fe fe-plus"></i> 查看详情</a></td>
						</tr>
					</table>
				</div>
			</div>
		</s:iterator>

	</div>
</div>

<%@include file="End.jsp"%>