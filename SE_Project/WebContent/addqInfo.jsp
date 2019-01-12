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
                  <form  action="#" method="post" enctype="multipart/form-data">
                  <div class="form-group">
                          <label class="form-label">求购信息标题</label>
                          <input type="text" class="form-control" name="ntitle" placeholder="Title..">
                  </div>
                  <div class="form-group">
                          <label class="form-label">求购时间范围</label>
                          <select name="atime" id="select-beast" class="form-control custom-select">
                          <option value="1">一个星期</option>
                          <option value="2">一个月</option>
                          <option value="3">半年</option>
                          <option value="4">一年</option>
                          </select>
                  </div>
                  <div class="form-group">
                      <label class="form-label">求购产品图片</label>
                      <div class="custom-file">
                      <input type="file" class="custom-file-input" name="nimage">
                      <label class="custom-file-label">Choose Image</label>
                    </div>
                  </div>
                  <div class="form-group">
                      <label class="form-label">求购产品介绍</label>
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
          </div>
          </div>
  <%@include file="End.jsp"%>