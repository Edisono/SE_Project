<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>
<script type="text/javascript">
document.getElementsByTagName("title")[0].innerText = '产品';
</script>
        <!-- HEAD END -->
          <div class="my-3 my-md-5">
            <div class="container">
              <div class="page-header">
                <h1 class="page-title">
                  &nbsp;产品
                </h1>
              </div>
        
         
             <div class="container">
            <div class="row align-items-center">
        	 <div class="col-lg-3 ml-auto">
         	 <form class="input-icon my-3 my-lg-0" action="#">
                  <input type="search" class="form-control header-search" name="searchcontent"   placeholder="Search&hellip;" tabindex="1">
                  <div class="input-icon-addon">
                    <i class="fe fe-search"></i>
                  </div>
                </form>	
               </div>
              <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                  
                  <li class="nav-item">
                    <a href="./productInfo.jsp" class="nav-link"><i class="fa fa-connectdevelop"></i>&nbsp;科技&nbsp;</a>
                  </li>
                  <li class="nav-item">
                     <a href="./productInfo1.jsp" class="nav-link active"><i class="fa fa-empire"></i>&nbsp;动漫&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./productInfo2.jsp" class="nav-link"><i class="fe fe-film"></i>&nbsp;音像&nbsp;</a>
                  </li>
                  <li class="nav-item">
                    <a href="./productInfo3.jsp" class="nav-link"><i class="fe fe-globe"></i>&nbsp;影视&nbsp;</a>
                  </li>
                </ul>
              </div>
             </div>
              </div>

              <div class="col-lg-12">
                <div class="card">
                  <table class="table card-table table-vcenter">
                    <tr>
                        
                      <td>
                     <img src="demo/products/apple-iphone7-special.jpg" alt="" class="h-8">
                      
                      </td>
                      <td>
                      产品名
                      </td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">98 reviews</td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">38 offers</td>
                      <td class="text-right">
                        <strong>产品价格</strong>
                      </td>
                      <td class="text-right">
                            <a href="javascript:void(0)" class="btn btn-primary"><i class="fe fe-plus"></i> 查看详情</a>
                      </td>
                    </tr>
                    <tr>
                      <td><img src="demo/products/apple-iphone7-special.jpg" alt="" class="h-8"></td>
                      <td>
                        产品名
                      </td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">98 reviews</td>
                      <td class="text-right text-muted d-none d-md-table-cell text-nowrap">38 offers</td>
                      <td class="text-right">
                        <strong>产品价格</strong>
                      </td>
                       <td class="text-right">
                            <a href="javascript:void(0)" class="btn btn-primary"><i class="fe fe-plus"></i> 查看详情</a>
                      </td>
                    </tr>
                   
                  </table>
                </div>
              </div>
            </div>
          </div>
          
 <%@include file="End.jsp"%>