<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '留言';
</script>


<div class="my-3 my-md-5">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<h3 class="page-title mb-5">留言服务</h3>

			</div>

			<div class="card">
				<div class="card-header">
					<h3 class="card-title">查看留言</h3>
				</div>
				<s:iterator value="#session.messages" var="xx" status="st">

					<div class="card">
						<div class="card-body">
							<article class="media">
								<div class="media-body">
									<div class="content">
										<p class="h5">
											留言人姓名:
											<s:property value="#xx.username" />
											<small class="float-right text-muted">留言时间:<s:property
													value="#xx.mdate" /></small>
										</p>
										<p>
											留言内容:
											<s:property value="#xx.mcontent" />
										</p>
										<nav class="d-flex text-muted">
											<i class="fe fe-navigation"><s:if
													test="#xx.mobjtype == 0">咨询</s:if> <s:else>
													<s:if test="#xx.mobjtype == 1">展会</s:if>
													<s:else>
														<s:if test="#xx.mobjtype == 2">供应</s:if>
														<s:else>
															<s:if test="#xx.mobjtype == 3">求购</s:if>
															<s:else>
																<s:if test="#xx.mobjtype == 4">产品</s:if>
															</s:else>
														</s:else>
													</s:else>
												</s:else>
											</i> &nbsp;&nbsp;&nbsp; <i class="fe fe-align-justify"><s:property
													value="#xx.mobjtitle" /></i>
										</nav>
										<div class="float-right">
											<a href="message_delete?mid=<s:property value="#xx.mid"/>">
												<button type="button"
													class="btn btn-primary btn-space btn-sm">删除</button>
											</a>
										</div>
									</div>
								</div>
							</article>
						</div>


					</div>


				</s:iterator>


			</div>



		</div>
	</div>
</div>


<%@include file="End.jsp"%>