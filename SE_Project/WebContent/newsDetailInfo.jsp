<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
        
        <!-- HEAD END -->
          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;咨讯详情
                </h1>
              </div>
            
            <div class="row">
             <div class="col-lg-9">
                <div class="card">
                  <div class="card-body">
                     <div class="text-wrap p-lg-6">
                        <a href="javascript:void(0)" class="mb-3">
                          <img src=<s:property value="%{#session.news.nimage}"/> alt="咨询图片" class="rounded">
                        </a>
                    </div>  
                    <div class="text-wrap p-lg-6">
                      <h2 class="mt-0 mb-4">标题：<s:property value="%{#session.news.ntitle}"/></h2>
                      <p>主要内容：<s:property value="%{#session.news.ncontent}"/></p>
                       <div>
                         <div>发布人：<s:property value="%{#session.news.username}"/></div>
                        <small class="d-block text-muted">发布时间：<s:property value="%{#session.news.ntime}"/></small>
                      </div>                 
                      </div>
                    </div>
                   
                </div>

            </div>
          </div>
          <!--添加留言-->
          <div class="card-footer text-right">
          <s:if test="#session.user.getRole()!='0'.toString()"></s:if>
          <s:else> <a href="addMessage.html">  <button class="btn btn-primary">添加留言</button> </a> </s:else>
             
          </div>
          
          
          <!-- 留言界面 -->
           <s:iterator value="#session.messagesList" var="xx" status="st">
                 <div class="card">
                  <div class="card-body">
                    <article class="media">
                      <div class="media-body">
                        <div class="content">
                          <p class="h5">
                            留言人姓名 :<s:property value="#xx.username"/>
                            <small class="float-right text-muted">留言时间:<s:property value="%#xx.mdate"/></small>
                          </p>
                          <p>
                            留言内容:<s:property value="#xx.mcontent}"/>
                          </p>
                          </div>
                          </div>
                    </article>
                  </div>
                  </div>
			</s:iterator>
			</div>
			</div>
                 
   <%@include file="End.jsp"%>