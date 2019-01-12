<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '留言管理';
</script>
    <div class="my-3 my-md-5">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <h3 class="page-title mb-5">留言服务</h3>
            <small>管理员界面</small>
          </div>
          <div class="card">
            <div class="card-header">
              <h3 class="card-title">查看留言</h3>
            </div>
            <div class="card">
              <div class="card-body">
                <article class="media">
                  <div class="media-body">
                    <div class="content">
                      <p class="h5">
                        留言人姓名
                        <small class="float-right text-muted">留言时间</small>
                      </p>
                      <p>
                        留言内容
                      </p>
                      <nav class="d-flex text-muted">
                        <i class="fe fe-navigation">被留言的类型 展会|咨询|供求|</i>
                        &nbsp;&nbsp;&nbsp;
                        <i class="fe fe-align-justify">被留言的title</i>
                      </nav>
                      <div class="float-right">
                        <a href="#">
                          <button type="button" class="btn btn-primary btn-space btn-sm">
                            更新
                          </button>
                        </a>
                        <a href="#">
                          <button type="button" class="btn btn-primary btn-space btn-sm">
                            删除
                          </button>
                        </a>
                      </div>
                    </div>
                  </div>
                </article>
              </div>

              <div class="card-body">
                <article class="media">

                  <div class="media-body">
                    <div class="content">
                      <p class="h5">
                        留言人姓名
                        <small class="float-right text-muted">留言时间</small>
                      </p>
                      <p>
                        留言内容
                      </p>
                      <nav class="d-flex text-muted">
                        <i class="fe fe-navigation">被留言的类型 展会|咨询|供求|</i>
                        &nbsp;&nbsp;&nbsp;
                        <i class="fe fe-align-justify">被留言的title</i>
                      </nav>
                      <div class="float-right">
                        <a href="#">
                          <button type="button" class="btn btn-primary btn-space btn-sm">
                            更新
                          </button>
                        </a>
                        <a href="#">
                          <button type="button" class="btn btn-primary btn-space btn-sm">
                            删除
                          </button>
                        </a>
                      </div>
                    </div>
                  </div>
                </article>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

   <%@include file="End.jsp"%>