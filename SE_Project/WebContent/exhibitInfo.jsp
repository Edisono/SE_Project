<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
        <!-- HEAD END -->
          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;展会
                </h1>
              </div>
            
            <s:iterator value="#session.exhibitList" var="xx" status="st">  
            <div class="col-lg-12">
                <div class="card card-aside">
                
                  <a href="#" class="card-aside-column" style="background-image: url(
                 <s:property value="#xx.eimage"/> )"></a>
                 
                  <div class="card-body d-flex flex-column">                         
                    <h4><a href="exhibit_showDetail.action?eid=<s:property value="#xx.eid"/> " > 题目：<s:property value="#xx.etitle"/>  </a></h4>
                    
                    <div class="d-flex align-items-center pt-5 mt-auto">
                      <div></div>
                      <div>
                         <div>发布人：<s:property value="#xx.username"/></div>
                        <small class="d-block text-muted">展会时间：<s:property value="#xx.etime"/></small>
                      </div>
                      <div class="ml-auto text-muted">
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-eye mr-1"></i> <%=(int)(Math.random()*100) %></a>
                        <a href="javascript:void(0)" class="icon d-none d-md-inline-block ml-3"><i class="fe fe-heart mr-1"></i> 0</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
			</s:iterator>

              <!-- 需要添加判断，个人/游客不可见 -->
              <s:if test="#session.user.role == 2">
              <a href="/addExhibitInfo.jsp" class="btn btn-primary"><i class="fe fe-plus"></i> 发布新的展会信息</a>
              </s:if>
              <s:elseif test="#session.user.role == 3">
              <a href="/addExhibitInfo.jsp" class="btn btn-primary"><i class="fe fe-plus"></i> 发布新的展会信息</a>
              </s:elseif>
             


            </div>
          </div>

    <%@include file="End.jsp"%>