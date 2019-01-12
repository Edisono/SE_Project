<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '供应';
</script>


<div class="my-3 my-md-5">
	<div class="container">
		<div class="page-header">
			<h1 class="page-title">&nbsp;供应</h1>
		</div>
		<s:iterator value="#session.aList" var="xx" status="st">

			<div class="col-lg-12">
				<div class="card card-aside">
					<a href="a_showDetail?aid=<s:property value="#xx.aid"/>"
						class="card-aside-column"
						style="background-image: url(<s:property value="#xx.aimage"/>)"></a>
					<div class="card-body d-flex flex-column">
						<h4>
							<a href="a_showDetail?aid=<s:property value="#xx.aid"/>"><s:property
									value="#xx.atitle" /></a>
						</h4>

						<div class="d-flex align-items-center pt-5 mt-auto">
							<div></div>
							<div>
								<div>
									<s:property value="#xx.acompany" />
								</div>
								<small class="d-block text-muted"><s:property
										value="#xx.adeadline" /></small>
							</div>
							<div class="ml-auto text-muted">
								<a href="javascript:void(0)"
									class="icon d-none d-md-inline-block ml-3"><i
									class="fe fe-eye mr-1"></i> 100</a> <a href="javascript:void(0)"
									class="icon d-none d-md-inline-block ml-3"><i
									class="fe fe-heart mr-1"></i> 42</a>
							</div>
						</div>
					</div>
				</div>
			</div>




		</s:iterator>


		<div class="page-header">
			<a href="./addAInfo.jsp" class="btn btn-primary"><i
				class="fe fe-plus"></i> 发布新的供应信息</a>
		</div>

	</div>
</div>

<%@include file="End.jsp"%>