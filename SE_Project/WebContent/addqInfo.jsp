<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '求购';
</script>

<div class="my-3 my-md-6">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<h3 class="page-title mb-5">求购服务</h3>
			</div>

			<div class="card">
				<div class="card">
					<div class="card-header">
						<h3 class="card-title">编辑求购信息</h3>
					</div>
					<div class="card-body">
						<form action="q_add" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label class="form-label">求购信息标题</label> <input type="text"
									class="form-control" name="qtitle" placeholder="Title..">
							</div>
							<div class="form-group">
								<label class="form-label">求购时间范围</label> <select name="time"
									id="select-beast" class="form-control custom-select">
									<option value="5">五天</option>
									<option value="10">十天</option>
									<option value="20">二十天</option>
									<option value="30">三十天</option>
								</select>
							</div>
							<div class="form-group">
								<label class="form-label">求购产品图片</label>
								<div class="custom-file">
									<input type="file" class="custom-file-input" name="qimage">
									<label class="custom-file-label">Choose Image</label>
								</div>
							</div>
							<div class="form-group">
								<label class="form-label">求购产品介绍</label>
								<textarea class="form-control" name="qcontent" rows="6"
									placeholder="Content.."></textarea>
							</div>

							<div class="float-right">
								<button type="submit" class="btn btn-primary btn-space">发布</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="End.jsp"%>