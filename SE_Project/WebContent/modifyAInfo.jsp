<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>

        <div class="my-3 my-md-6">
          <div class="container">
            <div class="row">
              <div class="col-md-3">
                <h3 class="page-title mb-5">求购服务</h3>
              </div>
             
             <div class="card">
                <div class="card">
                  <div class="card-header">
                     <h3 class="card-title">编辑求购</h3>
                   </div>
                  <div class="card-body">
                  <form  action="a_update" method="post" enctype="multipart/form-data">
                  <div class="form-group">
                          <label class="form-label">求购标题</label>
                          <input type="text" class="form-control" name="atitle" placeholder="Title.." value="<s:property value="%{#session.a.atitle}" />">
                  </div>
                  <div class="form-group">
                      <label class="form-label">求购图片</label>    <!-- 没有选择则保持之前，需要添加判断决定是否更改 -->
                      <div class="custom-file">
                      <input type="file" class="custom-file-input" name="aimage">
                      <label class="custom-file-label">选择图片</label>
                    </div>
                  </div>
                  <div class="form-group">
                      <label class="form-label">求购内容</label>
                      <textarea class="form-control" name="acontent" rows="6" placeholder="Content..">
                      	<s:property value="%{#session.a.acontent}" />
                      </textarea>
                  </div>
                  <div class="float-right">
								<button type="submit" class="btn btn-primary btn-space">提交</button>
							</div>
                  
                  </form>
                </div>
              </div>
            </div>
          </div> 
     <%@include file="End.jsp"%>