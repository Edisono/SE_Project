<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
 <script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '资讯';
</script>
        <!-- HEAD END -->
          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;咨讯
                </h1>
              </div>
          
          
          <s:iterator value="#session.newsList" var="xx" status="st">  
            <div class="col-lg-12">
                <div class="card card-aside">
                
                  <a href="#" class="card-aside-column" style="background-image: url(
                 <s:property value="#xx.nimage"/> )"></a>
                 
                  <div class="card-body d-flex flex-column">                         
                    <h4><a href="news_showDetail.action?nid=<s:property value="#xx.nid"/> " > 题目：<s:property value="#xx.ntitle"/>  </a></h4>
                    
                    <div class="d-flex align-items-center pt-5 mt-auto">
                      <div></div>
                      <div>
                         <div>发布人：<s:property value="#xx.username"/></div>
                        <small class="d-block text-muted">发布时间：<s:property value="#xx.ntime"/></small>
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


            </div>
          </div>

 <%@include file="End.jsp"%>