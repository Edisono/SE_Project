<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '供应';
</script>

          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;供应
                </h1>
              </div>
            
            <div class="col-lg-12">
                <div class="card card-aside">
                  <a href="#" class="card-aside-column" style="background-image: url(E:/图片/2.jpg)"></a>
                  <div class="card-body d-flex flex-column">                         
                    <h4><a href="#">标题</a></h4>
                    
                    <div class="d-flex align-items-center pt-5 mt-auto">
                      <div></div>
                      <div>
                         <div>发布人姓名</div>
                        <small class="d-block text-muted">发布时间</small>
                      </div>
                      <div class="ml-auto text-muted">
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-eye mr-1"></i> 100</a>
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-heart mr-1"></i> 42</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              
              <div class="col-lg-12">
                <div class="card card-aside">
                  <a href="#" class="card-aside-column" style="background-image: url(demo/photos/aneta-ivanova-776-500.jpg)"></a>
                  <div class="card-body d-flex flex-column">                         
                    <h4><a href="#">标题</a></h4>
                    
                    <div class="d-flex align-items-center pt-5 mt-auto">
                      <div></div>
                      <div>
                         <div>发布人姓名</div>
                        <small class="d-block text-muted">发布时间</small>
                      </div>
                      <div class="ml-auto text-muted">
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-eye mr-1"></i> 100</a>
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-heart mr-1"></i> 42</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div> 
              
              <div class="page-header">
                <a href="./addAInfo.html" class="btn btn-primary"><i class="fe fe-plus"></i> 发布新的供应信息</a>
              </div>

            </div>
          </div>

   <%@include file="End.jsp"%>