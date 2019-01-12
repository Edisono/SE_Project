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
                <div class="card">
                  <div class="card-header">
                    <h3 class="card-title">编辑留言</h3>
                  </div>
                  <div class="card-body">
                    <form action="AddMessageAction">
                    
                      <textarea rows="10" name="message"class="form-control"></textarea>
                      <div class="btn-list mt-4 text-right">
                        <button type="button" class="btn btn-secondary btn-space">取消</button>
                        <button type="submit" class="btn btn-primary btn-space">提交</button>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
  <%@include file="End.jsp"%>