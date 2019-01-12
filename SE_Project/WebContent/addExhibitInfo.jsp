<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
        
        <div class="my-3 my-md-6">
          <div class="container">
            <div class="row">
              <div class="col-md-3">
                <h3 class="page-title mb-5">展会服务</h3>
              </div>
             
             <div class="card">
                <div class="card">
                  <div class="card-header">
                     <h3 class="card-title">编辑展会</h3>
                   </div>
                  <div class="card-body">
                  <form  action="#" method="post" enctype="multipart/form-data">
                  <div class="form-group">
                          <label class="form-label">展会名称</label>
                          <input type="text" class="form-control" name="ntitle" placeholder="Title..">
                  </div>
                  <div class="form-group">
                      <label class="form-label">展会图片</label>
                      <div class="custom-file">
                      <input type="file" class="custom-file-input" name="nimage">
                      <label class="custom-file-label">Choose Image</label>
                    </div>
                  </div>
                  <div class="form-group">
                      <label class="form-label">展会内容</label>
                      <textarea class="form-control" name="ncontent" rows="6" placeholder="Content..">
                      </textarea>
                  </div>

                  <div class="float-right">
                        <button type="submit" class="btn btn-primary btn-space">发布</button>   
                  </div>

                  </form>
                </div>
              </div>
            </div>
          </div> 
<%@include file="End.jsp"%>