<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '求购管理';
</script>

<!-- HEAD END -->
<div class="my-3 my-md-5">
	<div class="container">
		<div class="page-header">
			<h1 class="page-title">&nbsp;求购管理</h1>
		</div>


		<s:iterator value="#session.qList" var="xx" status="st">

			<div class="col-lg-12">
				<div class="card card-aside">
					<a href="q_showDetail?qid=<s:property value="#xx.qid"/>"
						class="card-aside-column"
						style="background-image: url(<s:property value="#xx.qimage"/>)"></a>
					<div class="card-body d-flex flex-column">
						<h4>
							<a href="q_showDetail?qid=<s:property value="#xx.qid"/>"><s:property
									value="#xx.qtitle" /></a>
						</h4>

						<div class="d-flex align-items-center pt-5 mt-auto">
							<div></div>
							<div>
								<div>
									<s:property value="#xx.username" />
								</div>
								<small class="d-block text-muted"><s:property
										value="#xx.qdate" /></small>
							</div>
							<div class="ml-auto text-muted">
								<a href="javascript:void(0)"
									class="icon d-none d-md-inline-block ml-3"><i
									class="fe fe-eye mr-1"></i> 100</a> <a href="javascript:void(0)"
									class="icon d-none d-md-inline-block ml-3"><i
									class="fe fe-heart mr-1"></i> 42</a>
							</div>
						</div>

						<div class="ml-auto text-muted">
							<a href="q_modify?qid=<s:property value="#xx.qid"/>" class="icon d-none d-md-inline-block ml-3">
								<button class="btn btn-outline-primary btn-sm">
									<span class="fe fe-edit-3"></span> 修改
								</button>
							</a> <a href="q_delete?qid=<s:property value="#xx.qid"/>" class="icon d-none d-md-inline-block ml-3">
								<button class="btn btn-outline-primary btn-sm">
									<span class="fe fe-delete"></span> 删除
								</button>
							</a>
						</div>

					</div>
				</div>
			</div>




		</s:iterator>

	</div>
</div>

<%@include file="End.jsp"%>