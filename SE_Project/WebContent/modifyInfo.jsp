<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
 <script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '编辑个人信息';
</script>
        <div class="my-3 my-md-5">
          <div class="container">
            <div class="page-header">
              <h1 class="page-title">
                个人设置
              </h1>
          </div>
            
            <div class="card">
              <form class="card" action="#">
                <div class="card-body">
                  <h3 class="card-title">编辑个人信息</h3>
                  <div class="row">
                    <div class="col-md-5">
                     <div class="form-group">
                     <div class="col-auto">
                          <div class="avatar avatar-xl" style="background-image: url(demo/faces/female/9.jpg)"></div>
                      </div>
                      </div>
                      <div class="form-group">
                      <a href="modifyAvator.jsp"><button class="btn btn-primary btn-sm">修改头像</button></a>
                      </div>
                    <div class="form-group">
                        <label class="form-label">邮箱地址</label>
                        <input type="text" class="form-control" name="email" readonly="true" placeholder="email" value="">
                      </div>
                    </div>
                    <div class="col-md-12">
                      <div class="form-group"> 
                        <label class="form-label">用户昵称/企业名</label>
                        <input type="text" class="form-control" placeholder="Username" name="username" value="michael23">
                      </div>
                    </div>
                    <div class="col-md-12">
                      <div class="form-group">
                        <label class="form-label">QQ</label>
                        <input type="text"   name="QQ"  class="form-control" placeholder="QQ" value="12345678">
                      </div>
                    </div>
                    <div class="col-sm-6 col-md-6">
                      <div class="form-group">
                        <label class="form-label">联系方式</label>
                        <input type="text" name="phone" class="form-control"  placeholder="Tel" value="Tel">
                      </div>
                    </div>
                    <div class="col-md-12">
                      <div class="form-group">
                        <label class="form-label">地址</label>
                        <input type="email" class="form-control"  name="address"  placeholder="address">
                      </div>
                    </div>
                  
                    <div class="col-md-12">
                      <div class="form-group mb-0">
                        <label class="form-label">个人简介</label>
                        <textarea rows="5" class="form-control" placeholder="Here can be your description" value="Mike"></textarea>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="card-footer text-right">
                  <button type="submit" class="btn btn-primary">提&nbsp;交</button>
                </div>
              </form>
			</div>
			</div>
			</div>



     <%@include file="End.jsp"%>